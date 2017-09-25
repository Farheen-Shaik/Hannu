package cowe;

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
import org.openqa.selenium.support.ui.Select;

//import org.sikuli.script.Screen;

public class Stallform {

	
	public static void main(String[] args) throws InterruptedException, BiffException, IOException, RowsExceededException, WriteException 
	{
		File f=new File("C:\\karishma\\files\\cowe2.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nor=rsh.getRows();
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
	    //data driven testing
		for(int i=1;i<nor;i++)
		{
		
		    //login data
			String f_name=rsh.getCell(0,i).getContents();
			String addr=rsh.getCell(1,i).getContents();
			String inputPhone=rsh.getCell(2,i).getContents();
			String inputMobile=rsh.getCell(3,i).getContents();
			String inputemail=rsh.getCell(4,i).getContents();
			String inputWeb=rsh.getCell(5,i).getContents();
			String sno=rsh.getCell(6,i).getContents();
			String m_name=rsh.getCell(7,i).getContents();
			String inputMobile1=rsh.getCell(8,i).getContents();
			String inputProduct=rsh.getCell(9,i).getContents();
			String inputFacia=rsh.getCell(10,i).getContents();
			String inputStall=rsh.getCell(11,i).getContents();
			
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.mypaytax.com/web/index.html");
		Thread.sleep(5000);
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//click on book now
		driver.findElement(By.xpath("//*[@href='rule.html']/img")).click();
		Thread.sleep(10000);
		//fill stall no nd cost
		driver.findElement(By.xpath("//*[@id='stallno']")).sendKeys("A11");
		driver.findElement(By.xpath("//*[@id='rate']")).sendKeys("59000");
		//click book
		driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.id("f_name")).sendKeys(f_name);
		driver.findElement(By.id("addr")).sendKeys(addr);
		driver.findElement(By.id("inputPhone")).sendKeys(inputPhone);
		driver.findElement(By.id("inputMobile")).sendKeys(inputMobile);
		driver.findElement(By.id("inputemail")).sendKeys(inputemail);
		driver.findElement(By.id("inputWeb")).sendKeys(inputWeb);
		driver.findElement(By.id("cy")).click();
		Select s=new Select(driver.findElement(By.id("month")));
		s.selectByVisibleText("2014");
		driver.findElement(By.id("sno")).sendKeys(sno);
		driver.findElement(By.id("m_name")).sendKeys(m_name);
		driver.findElement(By.id("inputMobile")).sendKeys(inputMobile1);
		driver.findElement(By.id("inputProduct")).sendKeys(inputProduct);
		driver.findElement(By.id("inputFacia")).sendKeys(inputFacia);
		driver.findElement(By.id("inputStall")).sendKeys(inputStall);
		driver.findElement(By.id("square")).click();
		driver.findElement(By.id("pre")).click();
		driver.findElement(By.id("cy1")).click();
		//click submit
		driver.findElement(By.id("submit")).click();
		System.out.println("running");
		//print result in excel file
		Label l=new Label(12,i,"successfully registered");
		wsh.addCell(l);
		driver.close();
		
		
		
	}
		wwb.write();
		wwb.close();
		rwb.close();

}
}
