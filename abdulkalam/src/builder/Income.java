package builder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Income {

	
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
				//clcik on add income
				driver.findElement(By.linkText("Add Income")).click();
				Thread.sleep(5000);
				//FILL FIELDS
				driver.findElement(By.xpath("(//*[@name='amount'])[3]")).sendKeys("50000");
				driver.findElement(By.xpath("//*[@id='datepicker2']")).click();
				driver.findElement(By.linkText("11")).click();
				driver.findElement(By.xpath("(//*[@name='particulars'])[2]")).sendKeys("by investing in business");
				//click saveit
				driver.findElement(By.xpath("(//*[@type='submit'])[4]")).click();
				//click cancel
				//driver.findElement(By.xpath("(//*[@class='btn'])[3]")).click();
				

				
		
	}

}
