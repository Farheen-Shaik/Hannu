package advisory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
/*import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.41:8080/amweb");
		//maximize window
		driver.manage().window().maximize();
		//do login
		driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("601");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		//click on documents
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[4]")).click();
		//click on community documents
		//driver.findElement(By.xpath("//*[@href='/advisory/bcdocument']")).click();
		//click on personal document
		driver.findElement(By.xpath("//*[@href='/amweb/pdocument']")).click();
		//give file name
		driver.findElement(By.xpath("//*[@id='exampleInputEmail2']")).sendKeys("3642367432");
		Thread.sleep(5000);
		//click browse file
		driver.findElement(By.xpath("//*[@name='picture']")).click();
		Thread.sleep(5000);
		//send filename to clipboard
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
		//click submit
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//click on general ledger
		driver.findElement(By.xpath("//*[@href='#timeModal']")).click();
		//click close
		driver.findElement(By.xpath("//*[@class='close']")).click();
		Thread.sleep(5000);
		//click on notifications
		driver.findElement(By.xpath(".//*[@id='header_notification_bar']/a/span")).click();
		//click on any one meeting
		driver.findElement(By.xpath("(//*[@href='/amweb/pmeetinglist'])[1]")).click();
		Thread.sleep(5000);
		//click on complaints
		driver.findElement(By.xpath("//*[@class='badge bg-success']")).click();
		//click on any one complaint
		driver.findElement(By.xpath("(//*[@class='desc'])[7]")).click();
		//logout
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		driver.findElement(By.xpath("//*[@href='/amweb/']")).click();


		
	}

}
