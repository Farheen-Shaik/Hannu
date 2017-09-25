package nageshwar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://124.123.41.5:8081/advisory/");
		driver.findElement(By.className("hvr-sweep-to-left")).click();
		driver.findElement(By.name("name")).sendKeys("Basha");
		driver.findElement(By.name("villano")).sendKeys("102");
		driver.findElement(By.name("parkingno")).sendKeys("1");
	    Select s= new Select(driver.findElement(By.name("gender")));
	    s.selectByVisibleText("Male");
	    Select s1=new Select(driver.findElement(By.name("residenttype")));	
	    s1.selectByVisibleText("Owner");
	    Select s2=new Select(driver.findElement(By.name("designation")));
	    s2.selectByVisibleText("President");
		driver.findElement(By.name("familydetails")).sendKeys("abba,ammi,raafi,mein");
		driver.findElement(By.name("contactno")).sendKeys("7893615246");
		driver.findElement(By.name("permanent")).sendKeys("mahendra nagar 4th lane ongole");
		driver.findElement(By.name("picture")).click();
	    StringSelection f=new StringSelection("C:\\Users\\karishma\\Desktop\\pics\\YouCam Fun\\2017-02-16-22-39-45-073-1-1");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f, null);
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(5000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
	    driver.findElement(By.name("save")).click();
	    
		
	}

}
