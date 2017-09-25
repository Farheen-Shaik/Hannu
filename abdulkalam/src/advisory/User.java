package advisory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User {

	
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://124.123.41.5:8081/advisory/");
				//maximize window
				driver.manage().window().maximize();
				//do login
				driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("203");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
				driver.findElement(By.xpath("//*[@value='Sign in']")).click();
				//click on documents
				driver.findElement(By.xpath("//*[@href='/advisory/documents']")).click();
				//give file name
				driver.findElement(By.xpath("//*[@name='docname']")).sendKeys("aadhar");
				//click browse
				driver.findElement(By.xpath("//*[@name='picture']")).click();
				//send data to clipboard
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
				//click upload
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				
		
	}

}
