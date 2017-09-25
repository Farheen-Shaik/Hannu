package builder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expenditure {

	
	public static void main(String[] args) throws InterruptedException 
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
		driver.findElement(By.xpath("(//*[@role='button'])[1]")).click();
		Thread.sleep(5000);
		//click on expenditure
		driver.findElement(By.linkText("Add Expenditure")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.xpath("(//*[@name='amount'])[1]")).sendKeys("35000");
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
		driver.findElement(By.linkText("13")).click();
		driver.findElement(By.xpath("(//*[@name='particulars'])[1]")).sendKeys("spending on laptop");
		//click save it
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		//cancel
		driver.findElement(By.xpath("(//*[@class='btn'])[1]")).click();
		
		

		
	}

}
