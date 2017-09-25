package balaji;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bid {

	
	public static void main(String[] args) throws AWTException
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
		//click bid lift
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/table/tbody/tr[3]/td[6]/button")).click();
		//fill fields
		driver.findElement(By.xpath("//*[@name='lmoney']")).sendKeys("1300000");
		driver.findElement(By.xpath("//*[@id='datepicker2']")).click();
		driver.findElement(By.linkText("12")).click();
		//click on submit
		driver.findElement(By.xpath("//*[@name='remark2']")).click();
		//click enter
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//logout
		driver.findElement(By.xpath("(//*[@data-toggle='dropdown'])[1]")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
	}

}
