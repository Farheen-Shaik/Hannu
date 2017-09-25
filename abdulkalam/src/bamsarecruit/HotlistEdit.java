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

public class HotlistEdit {

	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("http://192.168.0.35:8080/bamsarecruit");
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
				//click sales activity
				driver.findElement(By.xpath("(//*[@class='parent'])[3]")).click();
				Thread.sleep(5000);
				//click on hotlist details
				driver.findElement(By.xpath("//*[@id='viewhotlist']/a")).click();
				Thread.sleep(5000);
				//click on haseen to edit
				driver.findElement(By.linkText("Haseen")).click();
				//edit details
				driver.findElement(By.id("firstname")).clear();
				driver.findElement(By.id("firstname")).sendKeys("keethu");
				driver.findElement(By.id("lastname")).clear();
				driver.findElement(By.id("lastname")).sendKeys("jinugu");
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("email")).sendKeys("bye@gmail.com");
				driver.findElement(By.id("phone")).clear();
				driver.findElement(By.id("phone")).sendKeys("7654322345");
				driver.findElement(By.xpath("(//*[@id='gender'])[2]")).click();
				Select s=new Select(driver.findElement(By.id("state")));
				s.selectByVisibleText("Ohio");
				driver.findElement(By.id("city")).clear();
				driver.findElement(By.id("city")).sendKeys("hfbwejhyhf");
				driver.findElement(By.id("status")).sendKeys("CPT");
				driver.findElement(By.id("af")).click();
				driver.findElement(By.linkText("11")).click();
				driver.findElement(By.id("hotlist")).click();
				Select s1=new Select(driver.findElement(By.id("reloc")));
				s1.selectByVisibleText("NO");
				driver.findElement(By.id("skills")).clear();
				driver.findElement(By.id("skills")).sendKeys("java");
				driver.findElement(By.id("ssn")).clear();
				driver.findElement(By.id("ssn")).sendKeys("1243");
				Select s2=new Select(driver.findElement(By.id("billrate")));
				s2.selectByVisibleText("Monthly");
				driver.findElement(By.id("rate")).clear();
				driver.findElement(By.id("rate")).sendKeys("25");
				driver.findElement(By.id("resume")).click();
				StringSelection f=new StringSelection("C:\\Users\\Dell\\Downloads\\CV-Templates-Curriculum-Vitae");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f, null);
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(5000);
				//click enter
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				//click submit
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				Thread.sleep(5000);
				driver.navigate().refresh();
				
				
				
		
	}

}
