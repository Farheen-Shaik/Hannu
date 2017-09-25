package bamsarecruit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broadcasthotlist {

	
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
		//click on broadcast hotlist
		driver.findElement(By.xpath("(//*[@id='topbar']/li/a)[2]")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.xpath("//*[@id='to']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='to']")).sendKeys("karishma.prodesign@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cc']")).sendKeys("sandeep.prodesign@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='bcc']")).sendKeys("sangeeth.prodesign@gmail.com");
		Thread.sleep(2000);
		//give subject
		driver.findElement(By.xpath("//*[@id='subject']")).sendKeys("Reg: attendance");
		
		//click none selected
		driver.findElement(By.xpath("(//*[@title='None selected'])[1]")).click();
		//select 4th one
		driver.findElement(By.xpath("(//*[@class='checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//*[@class='checkbox'])[5]")).click();
		//click preview
		driver.findElement(By.xpath("//*[@id='btnSelected']")).click();
		//switch to frame
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='tinymce']/table/tbody/tr/th[2]")).clear();
		Thread.sleep(5000);
		//driver.findElement(By.xpath(".//*[@id='tinymce']/table/tbody/tr[1]/td[2]")).sendKeys("california");
		//back to page
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//Click browse
		driver.findElement(By.xpath("(//*[@name='files'])[1]")).click();
		Thread.sleep(3000);
		StringSelection f=new StringSelection("C:\\Users\\Dell\\Downloads\\Prodesign-logo");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		//click enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//click send
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
	}

}
