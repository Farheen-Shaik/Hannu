package balaji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	
	public static void main(String[] args) throws InterruptedException
	{
		    //launch browser and site
			System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://localhost/balaji/login.php");
			//maximize window
			driver.manage().window().maximize();
			//do login
			driver.findElement(By.xpath("//*[@id='inputEmail']")).sendKeys("bala");
			driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("balaji123");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			//Click on new chit
			driver.findElement(By.linkText("New Chit")).click();
			Thread.sleep(5000);
			//fill details
			driver.findElement(By.xpath("//*[@name='number']")).sendKeys("jun12");
			Select s=new Select(driver.findElement(By.xpath("//*[@name='type']")));
			s.selectByVisibleText("20,00,000");
			driver.findElement(By.xpath("//*[@id='datepicker']")).click();
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			driver.findElement(By.linkText("12")).click();
			driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
			for(int i=0;i<=48;i++)
			{
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			driver.findElement(By.linkText("12")).click();
			driver.findElement(By.xpath("//*[@name='group']")).sendKeys("50");
			//click saveit
			driver.findElement(By.xpath("//*[@name='submit']")).click();
			//click cancel
			//driver.findElement(By.xpath("(//*[@class='btn'])[1]")).click();
			//logout
			driver.findElement(By.xpath("(//*[@data-toggle='dropdown'])[1]")).click();
			driver.findElement(By.linkText("Logout")).click();
			
	}

}
