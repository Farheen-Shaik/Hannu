package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactEdit {

	
	public static void main(String[] args) throws InterruptedException
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.35:8080/bamsarecruit/");
		Thread.sleep(5000);
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//click on dev nd test
		//driver.findElement(By.xpath("//*[@class='icoFacebook']")).click();
		//driver.findElement(By.xpath("//*[@class='icoTwitter']")).click();
		//driver.findElement(By.xpath("//*[@class='icoGoogle']")).click();
		driver.findElement(By.xpath("//*[@class='icoInstagram']")).click();
		//fill fields
		driver.findElement(By.xpath("//*[@id='loginform']/input[1]")).sendKeys("CEO");	
		driver.findElement(By.xpath("//*[@id='loginform']/input[2]")).sendKeys("tulasi");
		driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		//click recactivity
		driver.findElement(By.xpath("(//*[@class='parent'])[2]")).click();
		Thread.sleep(3000);
		//click contact details
		driver.findElement(By.xpath("//*[@id='viewrcontact']/a")).click();
		Thread.sleep(5000);
		//click mahesh
		driver.findElement(By.linkText("kali")).click();
		Thread.sleep(3000);
		//edit fields
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys("raafi");
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys("shaik");
		driver.findElement(By.id("accname")).clear();
		driver.findElement(By.id("accname")).sendKeys("Technology");
		Select s=new Select(driver.findElement(By.id("accowner")));
		s.selectByVisibleText("haseen");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("hyderabad");
		Select s1=new Select(driver.findElement(By.id("state")));
		s1.selectByVisibleText("Colorado");
		Select s2=new Select(driver.findElement(By.id("category")));
		s2.selectByVisibleText("Vendor");
		driver.findElement(By.id("website")).sendKeys("wbgdywtd@hjdt7");
		Select s3=new Select(driver.findElement(By.id("status")));
		s3.selectByVisibleText("In Active");
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("1234567890");
	    driver.findElement(By.id("primaryemail")).clear();
	    driver.findElement(By.id("primaryemail")).sendKeys("xdffgbhjtyf@hjgvft6");
	    driver.findElement(By.id("secondarymail")).clear();
	    driver.findElement(By.id("secondarymail")).sendKeys("sdbfytsaw@shg");
	    //click submit
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
		
		
		
		
		
	}
	
}

