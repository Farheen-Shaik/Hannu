package hr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miss {

	public static void main(String[] args) throws InterruptedException
	{
		
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.misshyderabad.com/registration");
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.id("fullname")).sendKeys("suma");
		driver.findElement(By.name("email")).sendKeys("suma");
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.id("")).sendKeys("");
		
	}

}
