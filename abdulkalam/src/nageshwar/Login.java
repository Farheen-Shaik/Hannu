package nageshwar;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Login {

	
	public static void main(String[] args) throws RowsExceededException, WriteException, InterruptedException, IOException, BiffException
	{
		//open excel file for read and write
		File f=new File("C:\\Users\\karishma\\Desktop\\karishma\\jxltest.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nor=rsh.getRows();
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//data driven testing
		//oth row have columns headings
		for(int i=1;i<nor;i++)
		{
			String u=rsh.getCell(2,i).getContents();
			String uc=rsh.getCell(3,i).getContents();
			String p=null,pc=null;
			p=rsh.getCell(4,i).getContents();
			pc=rsh.getCell(5,i).getContents();
			
			System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://124.123.41.5:8081/bamsa/");
			//maximize window
			driver.manage().window().maximize();
			Thread.sleep(5000);
			//click dev nd test departmnt
			driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/ul/div[7]/div[1]/li/a")).click();
			Thread.sleep(5000);
			//do login
			driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys(u);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys(p);
			driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
			if(uc.equals("valid") && pc.equals("valid") && driver.findElement(By.xpath("//*[@id='dashboard']/a")).isDisplayed())
			{
				Label l=new Label(6,i,"Test passed for valid pwd");
				wsh.addCell(l);
			}
			else if(uc.equals("invalid") && driver.findElement(By.xpath("//*[@class='form']/h5[1]")).isDisplayed())
			{
				Label l=new Label(6,i,"Test passed for invalid");
				wsh.addCell(l);
			}
			
			else if(pc.equals("invalid") && driver.findElement(By.xpath("//*[@class='form']/h5[1]")).isDisplayed())
			{
				Label l=new Label(6,i,"Test passed for invalid pwd");
				wsh.addCell(l);
			}
			else if(uc.equals("invalid") && pc.equals("invalid") && driver.findElement(By.xpath("//*[@class='form']/h5[1]")).isDisplayed())
			{
				Label l=new Label(6,i,"Test passed for invalid pwd");
				wsh.addCell(l);
			}
			else
			{
				 Label l=new Label(6,i,"Test Failed for uid");
				    wsh.addCell(l);
			}
		}


	}

}
