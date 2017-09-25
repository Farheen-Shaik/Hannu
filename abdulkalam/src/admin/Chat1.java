package admin;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chat1 {

	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		// Create FireFox browser object.

		WebDriver driver = new ChromeDriver();
		//Enter url
		driver.get("http://124.123.41.5:8081/bamsa");

		driver.findElement(By.xpath("//*[@class='fa fa-laptop']")).click();
		//Enter username
		       driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT18"); 
		       //Enter password
		       driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123");
		       //Click submit button.
		       driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		       //click all users
		       driver.findElement(By.xpath("//*[@id='employees']/a")).click();
		       //click dev nd testng 
		       driver.findElement(By.xpath("(//*[@class='timeline-title'])[1]")).click();
		       //click on php
		       driver.findElement(By.linkText("PHP")).click();
		       //CLICK ON start live chat
		       driver.findElement(By.xpath("//*[@value='Start Live Chat']")).click();
		       //switch to other window
		       ArrayList<String> x= new ArrayList<String>(driver.getWindowHandles());
		       driver.switchTo().window(x.get(1));
		       driver.findElement(By.xpath("//*[@name='name']")).sendKeys("system");
		       driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		       driver.findElement(By.xpath("//*[@name='SystemLogin']")).click();
		               Select k= new Select(driver.findElement(By.xpath("//*[@name='chatrooms']")));
		               k.selectByIndex(1);
		               driver.findElement(By.xpath("html/body/form/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/font/a/b")).click();
		               driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Testing");
		               driver.findElement(By.xpath("//*[@name='subject']")).sendKeys("sandeep");
		               driver.findElement(By.xpath("//*[@name='Button']")).click();
		               driver.findElement(By.xpath("//*[@href='moderators.jsp']")).click();
		               driver.findElement(By.xpath("//*[@href='xmlconfig.jsp']")).click();
		               driver.findElement(By.xpath("//*[@href='javascript:logout()']/b")).click();

		

		
	}

}
