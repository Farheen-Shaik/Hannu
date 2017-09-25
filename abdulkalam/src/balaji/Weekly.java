package balaji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Weekly {

	
	public static void main(String[] args) throws InterruptedException
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://localhost/balaji/login.php");
				//maximize window
				driver.manage().window().maximize();
				//do login
				driver.findElement(By.xpath("//*[@id='inputEmail']")).sendKeys("balaji");
				driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("balaji123");
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				//click on hello balaji
				driver.findElement(By.xpath("(//*[@data-toggle='dropdown'])[1]")).click();
				Thread.sleep(5000);
				//click on new finance
				driver.findElement(By.linkText("New Finance account/payment")).click();
				//clcik on weekly finance
				driver.findElement(By.linkText("Weekly Payments")).click();
				//click on new member
				driver.findElement(By.linkText("New Member")).click();
				Thread.sleep(5000);
				//fill fields
				driver.findElement(By.xpath("//*[@name='number']")).sendKeys("45300");
				driver.findElement(By.xpath("//*[@name='name']")).sendKeys("sallu");
				driver.findElement(By.xpath("//*[@name='mobile']")).sendKeys("7800119876");
				Select s=new Select(driver.findElement(By.xpath("//*[@name='type']")));
				s.selectByVisibleText("Weekly");
				driver.findElement(By.xpath("//*[@name='rate']")).sendKeys("20");
				driver.findElement(By.xpath("//*[@id='datepicker']")).click();
				driver.findElement(By.linkText("10")).click();
				driver.findElement(By.xpath("//*[@name='address']")).sendKeys("delhi");
				driver.findElement(By.xpath("//*[@name='loan']")).sendKeys("25000");
				//click saveit
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				//click cancel
				//driver.findElement(By.xpath("//*[@class='btn']")).click();
				
		
	}

}
