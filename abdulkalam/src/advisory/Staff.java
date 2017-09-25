package advisory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staff {

	
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.41:8080/amweb");
		//maximize window
		driver.manage().window().maximize();
		//do login
		driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("501");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		//click on staff
		driver.findElement(By.xpath("//*[@href='/amweb/staff']")).click();
		Thread.sleep(3000);
		///click on register staff
		driver.findElement(By.linkText("Register Staff")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.xpath("//*[@name='sid']")).sendKeys("3");
		driver.findElement(By.xpath("//*[@name='sname']")).sendKeys("kalyan");
		Select s=new Select(driver.findElement(By.xpath("//*[@name='shifttime']")));
		s.selectByIndex(1);
		driver.findElement(By.xpath("//*[@placeholder='Work Details']")).sendKeys("attender");
		//click register
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//click on general ledger
		driver.findElement(By.xpath("//*[@href='#timeModal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='close'])[1]")).click();
		Thread.sleep(3000);
		//click 501
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(3000);
		//click logout
		driver.findElement(By.xpath("//*[@href='/amweb/']")).click();
		
		
	}

}
