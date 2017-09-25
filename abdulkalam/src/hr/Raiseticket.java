package hr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Raiseticket {

	
	public static void main(String[] args) 
	{
		
			System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
	        // Create FireFox browser object.
	        
	                WebDriver driver = new ChromeDriver();
	                
	                driver.get("http://124.123.41.5:8081/bamsa");
	                 driver.findElement(By.xpath("//*[@class='fa fa-laptop']")).click();
	                driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT18");  
	                //pay attention here By.name or By.id, see  the page source properly
	                driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123");

	               
	                driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
	                driver.findElement(By.xpath("//*[@id='assets']/a")).click();
	                Select s=new Select(driver.findElement(By.id("Marque")));
	                         s.selectByVisibleText("Component");
	                         Select k=new Select(driver.findElement(By.id("Serie")));
	                         k.selectByVisibleText("RM0091"); 
	                         //driver.findElement(By.xpath("(//*[@class='form-control'])[3]")).click();
	                         Select k1=new Select(driver.findElement(By.xpath("//*[@name='requestingto']")));
	                         k1.selectByVisibleText("PDT18");
	                 Select k2=new Select(driver.findElement(By.xpath("//*[@name='purpose']")));
	                         k2.selectByVisibleText("Repair");
	                         driver.findElement(By.xpath("//*[@id='Remarks']")).sendKeys("Os Problem");
	                         driver.findElement(By.xpath("//*[@type='submit']")).click();
	                         driver.findElement(By.xpath("//*[@href='viewTicket']")).click();
	                         //search
	                         driver.findElement(By.xpath("//*[@type='search']")).sendKeys("asset");
	                         // click logout
	                         driver.findElement(By.xpath("//*[@class='ts-account']/a")).click();
	         				driver.findElement(By.linkText("Logout")).click();
		
	}

}
