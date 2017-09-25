package builder;

import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Profitshare {

	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/builder/admin_login.php");
		//maximize window
		driver.manage().window().maximize();
		//do login
		driver.findElement(By.name("username")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//clcik on spandana estates
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
		//click on investors
		driver.findElement(By.linkText("Investors")).click();
		Thread.sleep(5000);
		//click ADD INVESTOR
		driver.findElement(By.linkText("Add Investor")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("sandy");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("sandy@gmail.com");
		driver.findElement(By.xpath("//*[@name='mobile']")).sendKeys("7788996545");
		driver.findElement(By.xpath("//*[@name='address']")).sendKeys("hyderabad");
		driver.findElement(By.xpath("(//*[@name='amount'])[2]")).sendKeys("100000");
		//click save it
		driver.findElement(By.xpath("(//*[@type='submit'])[3]")).click();
		Thread.sleep(5000);
		//click cancel
		//driver.findElement(By.xpath("(//*[@class='btn'])[2]")).click();
		//click on profit shares
		driver.findElement(By.linkText("Profit Shares")).click();
		//click on balance sheet
		driver.findElement(By.linkText("Balance Sheet")).click();
		Thread.sleep(5000);
		//enter from date
		driver.findElement(By.xpath("//*[@id='datepicker3']")).click();
		driver.findElement(By.linkText("11")).click();
		//enter to date
		driver.findElement(By.xpath("//*[@id='datepicker4']")).click();
		driver.findElement(By.linkText("13")).click();
		//click submit query
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		//click on investors
				driver.findElement(By.linkText("Investors")).click();
				Thread.sleep(5000);
		//click add money
		//driver.findElement(By.xpath("(//*[@id='note'])[1]")).click();
	    //driver.findElement(By.xpath("//*[@id='money']")).sendKeys("50000");
	      //click submit
	     // driver.findElement(By.xpath(".//*[@id='frm1']/div/button")).click();
				//click edit
				driver.findElement(By.xpath("(//*[@title='edit'])[1]")).click();
				//switch to oder window
				/*ArrayList<String> x= new ArrayList<String>(driver.getWindowHandles());
			    driver.switchTo().window(x.get(1));
			    driver.manage().window().maximize();*/
			    //edit details
			    /*driver.findElement(By.xpath("//*[@name='name']")).clear();
			    driver.findElement(By.xpath("//*[@name='name']")).sendKeys("sandeep");
			    driver.findElement(By.xpath("//*[@name='email']")).clear();
			    driver.findElement(By.xpath("//*[@name='email']")).sendKeys("sand@gmail.com");
			    driver.findElement(By.xpath("//*[@name='mobile']")).clear();
			    driver.findElement(By.xpath("//*[@name='mobile']")).sendKeys("7764589386");
			    driver.findElement(By.xpath("//*[@name='amount']")).clear();
			    driver.findElement(By.xpath("//*[@name='amount']")).sendKeys("20000");
			    Thread.sleep(5000);*/
			    //save changes
			   // driver.findElement(By.xpath("//*[@name='submit']")).click();
			    //click delete
			    driver.findElement(By.xpath("(//*[@title='delete'])[2]")).click();
			    
			    
			    
			    
	      
	      

		
		
		
	}

}
