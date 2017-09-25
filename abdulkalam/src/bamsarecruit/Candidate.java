package bamsarecruit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Candidate {

	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.35:8080/bamsarecruit/");
		Thread.sleep(5000);
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//click on dev nd test
		driver.findElement(By.xpath("//*[@class='icoFacebook']")).click();
		//fill fields
		driver.findElement(By.xpath("//*[@id='loginform']/input[1]")).sendKeys("CEO");	
		driver.findElement(By.xpath("//*[@id='loginform']/input[2]")).sendKeys("tulasi");
		driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		//click on qucik view
		driver.findElement(By.xpath("(//*[@class='parent'])[1]")).click();
		Thread.sleep(3000);
		//click on candidate
		driver.findElement(By.xpath("(//*[@href='/bamsarecruit/candidateRegistration'])[1]")).click();
		Thread.sleep(5000);
		//cfill fields
		driver.findElement(By.name("fname")).sendKeys("Hasu");
		driver.findElement(By.name("mname")).sendKeys("Farheen");
		driver.findElement(By.name("lname")).sendKeys("Shaik");
		driver.findElement(By.name("email")).sendKeys("bye@hjdfgwey");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='gender'])[1]")).click();
		driver.findElement(By.name("mobno")).sendKeys("1234567891");
		driver.findElement(By.name("city")).sendKeys("california");
		Select s=new Select(driver.findElement(By.name("state")));
		s.selectByVisibleText("Texas");
		Select s1=new Select(driver.findElement(By.name("vstatus")));
		s1.selectByVisibleText("Other");
		driver.findElement(By.name("af")).sendKeys("07-21-2017");
		Select s2=new Select(driver.findElement(By.name("consultant")));
		s2.selectByVisibleText("W2");
		driver.findElement(By.name("hotlist")).click();
		Select s3=new Select(driver.findElement(By.name("reloc")));
		s3.selectByVisibleText("Yes(Open)");
		driver.findElement(By.name("skills")).sendKeys("Testing");
		driver.findElement(By.name("ssn")).sendKeys("678934");
		Select s4=new Select(driver.findElement(By.name("ratetype")));
		s4.selectByVisibleText("Hourly");
		driver.findElement(By.name("rate")).sendKeys("40");
		//click browse
		//driver.findElement(By.xpath("(//*[@id='upload'])[1]")).click();
		//send data to clipboard
		/*StringSelection f=new StringSelection("C:\\Users\\Dell\\Downloads\\amCharts");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f, null);
		Thread.sleep(5000);
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
		Thread.sleep(5000);*/
		//click another browse
		driver.findElement(By.xpath("(//*[@id='upload'])[2]")).click();
		//send data to clipboard
		StringSelection f1=new StringSelection("C:\\Users\\Dell\\Downloads\\CV-Templates-Curriculum-Vitae");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f1, null);
		Thread.sleep(5000);
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
		Thread.sleep(5000);
		//click submit
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
