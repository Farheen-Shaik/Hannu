package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registrationform {

	
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.35:8080/bamsarecruit");
		Thread.sleep(5000);
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//click on dev nd test
		driver.findElement(By.xpath("//*[@class='icoFacebook']")).click();
		//fill fields
		driver.findElement(By.xpath("//*[@id='loginform']/input[1]")).sendKeys("CEO");	
		driver.findElement(By.xpath("//*[@id='loginform']/input[2]")).sendKeys("tulasi");
		driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		//click registration form
		driver.findElement(By.xpath("//*[@href='/bamsarecruit/registration']")).click();
		Thread.sleep(5000);
		//Fill fields
		driver.findElement(By.name("fname")).sendKeys("haseen");
		driver.findElement(By.name("lname")).sendKeys("shaik");
		driver.findElement(By.name("empid")).sendKeys("sanmnsaja");
		driver.findElement(By.name("mobno")).sendKeys("9678987659");
		driver.findElement(By.name("phno")).sendKeys("9876543212");
		driver.findElement(By.name("email")).sendKeys("bghvdsj@bgvvg");
		driver.findElement(By.name("gmail")).sendKeys("vtyygbhg@gmail.com");
		//fill further details
		Select s=new Select(driver.findElement(By.name("reportingto")));
		s.selectByVisibleText("RC123");
		Select s1=new Select(driver.findElement(By.name("designation")));
		s1.selectByVisibleText("Director");
		//click register
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		//click ceo
		//driver.findElement(By.xpath("html/body/div[1]/ul/li/a/i")).click();
		//click edit account
		//driver.findElement(By.linkText("Edit Account")).click();
		//Thread.sleep(5000);
		//click register
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		//Thread.sleep(5000);
		//click on red menu button
		driver.findElement(By.xpath("//*[@class='dice-menu']/li[1]")).click();
		Thread.sleep(4000);
		//click on 1st one
		driver.findElement(By.xpath("//*[@class='dice-menu']/li[2]")).click();
		Thread.sleep(5000);
		//click registration form
		driver.findElement(By.xpath("//*[@href='/bamsarecruit/registration']")).click();
		Thread.sleep(5000);
		//click on red menu button
		driver.findElement(By.xpath("//*[@class='dice-menu']/li[1]")).click();
		Thread.sleep(4000);
		//click on 2nd one
		driver.findElement(By.xpath("//*[@class='dice-menu']/li[3]")).click();
		Thread.sleep(5000);
		//click registration form
		driver.findElement(By.xpath("//*[@href='/bamsarecruit/registration']")).click();
		Thread.sleep(5000);
		//click on red menu button
		driver.findElement(By.xpath("//*[@class='dice-menu']/li[1]")).click();
		Thread.sleep(4000);
		//click on 1st one
		driver.findElement(By.xpath("//*[@class='dice-menu']/li[4]")).click();
		Thread.sleep(5000);
		//click registration form
		driver.findElement(By.xpath("//*[@href='/bamsarecruit/registration']")).click();
		Thread.sleep(5000);
		//click on red menu button
		driver.findElement(By.xpath("//*[@class='dice-menu']/li[1]")).click();
		Thread.sleep(4000);
		//click on 1st one
		driver.findElement(By.xpath("//*[@class='dice-menu']/li[5]")).click();
		Thread.sleep(5000);
				
		//click ceo
		driver.findElement(By.xpath("html/body/div[1]/ul/li/a/i")).click();
		Thread.sleep(5000);
		//click logout
		driver.findElement(By.linkText("Logout")).click();
		
		
		
	}

}
