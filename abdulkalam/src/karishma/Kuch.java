package karishma;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Kuch {
  @Test
  public void f() throws RowsExceededException, WriteException, IOException, BiffException, InterruptedException 
  {
	  File f=new File("C:\\karishma\\files\\jxl3.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nor=rsh.getRows();
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);

		//data driven testing
		for(int i=1;i<nor;i++)
		{
			String u=rsh.getCell(0,i).getContents();
			String uc=rsh.getCell(1,i).getContents();
			String p=rsh.getCell(2,i).getContents();
			String pc=rsh.getCell(3,i).getContents();
			//launch site
			System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://124.123.41.5:8081/bamsa/login");
			//maximize window
			//driver.manage().window().maximize();
			Thread.sleep(5000);
			//do login
			driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys(u);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys(p);
			driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
			//validate credentials
			if(uc.equals("valid") && pc.equals("valid") && driver.findElement(By.xpath("//*[@id='dashboard']/a")).isDisplayed())
			{
				Label l=new Label(4,i,"login credentials are valid");
				wsh.addCell(l);
			}
			else if(uc.equals("valid") && pc.equals("invalid") && driver.findElement(By.xpath("//*[@class='form']/h5[1]")).isDisplayed())
			{
				Label l=new Label(4,i,"password is invalid");
				wsh.addCell(l);
			}
			else if(uc.equals("invalid") && pc.equals("valid") && driver.findElement(By.xpath("//*[@class='form']/h5[1]")).isDisplayed())
			{
				Label l=new Label(4,i,"userid is invalid");
				wsh.addCell(l);
			}
			else if(uc.equals("valid") && pc.equals("invalid") && ExpectedConditions.alertIsPresent()!=null)
			{
				Label l=new Label(4,i,"password is blank");
				wsh.addCell(l);
			}
			else if(uc.equals("invalid") && pc.equals("valid") && ExpectedConditions.alertIsPresent()!=null)
			{
				Label l=new Label(4,i,"userid is blank");
				wsh.addCell(l);
			}
			else
			{
				Label l=new Label(4,i,"Test failed");
				wsh.addCell(l);
			}
			driver.close();

		}
		wwb.write();
		wwb.close();
		rwb.close();
  }
}
