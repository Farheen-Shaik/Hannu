package advisory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserMeeting {

	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		//launch browser and site
		System.setProperty("webdriver.gecko.driver", "D:\\karishma\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(5000);
		driver.get("http://192.168.0.29:8080/amweb/");
		Thread.sleep(5000);
		//maximize window
		driver.manage().window().maximize();
		//do login
		driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("203");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		//click on meetings
		driver.findElement(By.xpath("(//*[@href='/amweb/meetings'])[1]")).click();
		Thread.sleep(5000);
		//click on meeting request
		driver.findElement(By.xpath("//*[@src='/amweb/static/images/meeting.png']")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("7/21/2017");
		driver.findElement(By.xpath("//*[@name='stime']")).sendKeys("10 AM");
		driver.findElement(By.xpath("//*[@name='magenda']")).sendKeys("sound issue");
		//click submit
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		//click cancle
		//driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		//click on minuts  of meeting
		driver.findElement(By.xpath("//*[@src='/amweb/static/images/mom.png']")).click();
		Thread.sleep(5000);
		//click on notifications
		driver.findElement(By.xpath("(//*[@class='badge bg-success'])[1]")).click();
		Thread.sleep(5000);
		//click on third one
		driver.findElement(By.xpath("//*[@href='/amweb/meetings']")).click();
		Thread.sleep(3000);
		//click on complaints
		driver.findElement(By.xpath("(//*[@class='badge bg-success'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='desc'])[5]")).click();
		Thread.sleep(5000);
		//click on general ledger
		//driver.findElement(By.xpath("//*[@href='#timeModal']")).click();
		//click 203
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(3000);
		//click logout
		driver.findElement(By.xpath("//*[@class='dropdown-menu']")).click();
		
		
		
		
	}

}
