package karishma;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assetcreation {

	
	public static void main(String[] args) throws InterruptedException, RowsExceededException, WriteException, IOException, AWTException, BiffException 
	{
		
		File f=new File("C:\\karishma\\xml6.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nor=rsh.getRows();
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//asset file
		File f1=new File("C:\\karishma\\raafi9.xls");
		Workbook rwb1=Workbook.getWorkbook(f1);
		Sheet rsh1=rwb1.getSheet(0);
		int nor1=rsh1.getRows();
		WritableWorkbook wwb1=Workbook.createWorkbook(f1,rwb1);
		WritableSheet wsh1=wwb1.getSheet(0);
		//data driven testing
		for(int i=1;i<nor;i++)
		{
		
		    //login data
			String u=rsh.getCell(0,i).getContents();
			String uc=rsh.getCell(1,i).getContents();
			String p=rsh.getCell(2,i).getContents();
			String pc=rsh.getCell(3,i).getContents();
			//launch browser and site
			System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
			driver.get("http://124.123.41.5:8081/bamsa/login");
			//maximize window
			driver.manage().window().maximize();
			Thread.sleep(5000);
			//do login
			driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys(u);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys(p);
			driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
			for(int j=1;j<nor1;j++)
			{
				System.out.println("inner for loop");
			//asset data
			String a=rsh1.getCell(0,j).getContents();
			String m=rsh1.getCell(1,j).getContents();
			String se=rsh1.getCell(2,j).getContents();
			String an=rsh1.getCell(3,j).getContents();
			String su=rsh1.getCell(4,j).getContents();
			String on=rsh1.getCell(5,j).getContents();
			String pco=rsh1.getCell(6,j).getContents();
			String w=rsh1.getCell(7,j).getContents();
			String n=rsh1.getCell(8,j).getContents();
			if(uc.equals("valid") && pc.equals("valid") && driver.findElement(By.xpath("//*[@id='dashboard']/a")).isDisplayed())
			{
			//print result in excel file
				Label l=new Label(4,i,"login credentials are valid");
				wsh.addCell(l);
			//click on asset tracking
			driver.findElement(By.xpath("//*[@id='assets']/a")).click();
			Thread.sleep(5000);
			//click on create new
			driver.findElement(By.linkText("Create New")).click();
			Thread.sleep(5000);
			//enter fields
			if(!(a.equals("asdf12")))
			{
		
			driver.findElement(By.id("asset_tag")).sendKeys(a);
			driver.findElement(By.id("model_select_id")).sendKeys(m);
			Select s=new Select(driver.findElement(By.id("status_select_id")));
			s.selectByVisibleText("Out for Repair");
			Select s1=new Select(driver.findElement(By.xpath("(//*[@name='branchname'])[1]")));
			s1.selectByVisibleText("Panjagutta");
			driver.findElement(By.id("serial")).sendKeys(se);
			driver.findElement(By.id("name")).sendKeys(an);
			driver.findElement(By.name("purchasedate")).click();
			Select s2=new Select(driver.findElement(By.className("ui-datepicker-year")));
			s2.selectByValue("2016");
			Select s3=new Select(driver.findElement(By.className("ui-datepicker-month")));
			s3.selectByVisibleText("Jan");
			driver.findElement(By.linkText("6")).click();
			driver.findElement(By.name("supplier_id")).sendKeys(su);
			driver.findElement(By.id("order_number")).sendKeys(on);
			driver.findElement(By.id("purchase_cost")).sendKeys(pco);
			driver.findElement(By.id("warranty_months")).sendKeys(w);
			driver.findElement(By.xpath("(//*[@id='notes'])[1]")).sendKeys(n);
			driver.findElement(By.id("file-upload")).click();
			//Browse file
			Robot r=new Robot();
			StringSelection f2=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f2, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			//click save
			driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
			Label l1=new Label(9,j,"asset created successfully");
			wsh1.addCell(l1);
			}
			
		   if(a.equals("ABC123") && driver.findElement(By.xpath("//*[@id='myTab']/h5[1]")).isDisplayed())
			{
				Label l2=new Label(9,j,"asset already exist");
				wsh1.addCell(l2);
				wwb1.write();
			}
			
			
			
			else //if(a.equals("ABC123") && driver.findElement(By.xpath("//*[@id='myTab']/h5[1]")).isDisplayed())
			{
				Label l2=new Label(9,j,"asset already exist");
				wsh1.addCell(l2);
				wwb1.write();
                break;
				
			}
			
			}	
			
			
		                           		
			}
						
			wwb1.close();
			rwb1.close();
		
			if(uc.equals("valid") && pc.equals("invalid") && driver.findElement(By.xpath("//*[@class='form']/h5[1]")).isDisplayed())
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
		
		}
		wwb.write();
		wwb.close();
		rwb.close();
		
			
	}
			
		
	}


