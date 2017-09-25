package advisory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://124.123.41.5:8081/advisory/");
				Thread.sleep(5000);
				//maximize window
				driver.manage().window().maximize();
				//click on register 
				driver.findElement(By.linkText("Register Here")).click();
				Thread.sleep(5000);
				//fill fields
				driver.findElement(By.name("name")).sendKeys("karrr");
				driver.findElement(By.name("villano")).sendKeys("005");
				driver.findElement(By.name("parkingno")).sendKeys("05");
				Select s=new Select(driver.findElement(By.name("gender")));
				s.selectByVisibleText("Male");
				Select s1=new Select(driver.findElement(By.name("residenttype")));
				s1.selectByVisibleText("Owner");
				Select s2=new Select(driver.findElement(By.name("designation")));
				s2.selectByVisibleText("User");
				driver.findElement(By.name("family")).sendKeys("4");
				driver.findElement(By.name("familydetails")).sendKeys("dad, mom, bro, sis, me");
				driver.findElement(By.name("contactno")).sendKeys("7890987789");
				driver.findElement(By.name("permanent")).sendKeys("kukatpally, hyderabad");
				//click browse
				driver.findElement(By.name("picture")).click();
				Thread.sleep(5000);
				//send file name to clipboard
				StringSelection f=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f, null);
				//send clipboard data to screen
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(5000);
				//click save
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(10000); 
				//click cancel
				//driver.findElement(By.name("cancel")).click();
				//click save
				driver.findElement(By.id("save")).click();
				Thread.sleep(5000);
				
		
	}

}
