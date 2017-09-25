package balaji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Weekpay {

	
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
		Thread.sleep(5000);
		//click on payment
		driver.findElement(By.xpath(".//*[@id='tab2default']/div/div/div[1]/table/tbody/tr[3]/td[11]/button")).click();
		//fill fields
		driver.findElement(By.xpath("//*[@id='datepicker2']")).click();
		driver.findElement(By.linkText("10")).click();
		Select s=new Select(driver.findElement(By.xpath("//*[@id='status']")));
		s.selectByVisibleText("Paid");
		driver.findElement(By.xpath("//*[@id='amount']")).sendKeys("2000");
		//click submit
		driver.findElement(By.xpath("//*[@name='remark']")).click();
		
		
	}

}
