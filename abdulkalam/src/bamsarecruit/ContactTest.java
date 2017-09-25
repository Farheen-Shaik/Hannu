package bamsarecruit;

import java.awt.AWTException;
//import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactTest {

	
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
				//click sales activity
				driver.findElement(By.xpath("(//*[@class='parent'])[3]")).click();
				Thread.sleep(5000);
				//click contact
				driver.findElement(By.xpath("//*[@id='viewhcontact']/a")).click();
				Thread.sleep(3000);
				//search s.no
				driver.findElement(By.xpath("//*[@type='number']")).sendKeys("10");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("haseen");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("shaik");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("ajay");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("120");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[5]")).sendKeys("Vendor");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[6]")).sendKeys("10");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[7]")).sendKeys("www.recruit.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[8]")).sendKeys("active");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[9]")).sendKeys("-----");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[10]")).sendKeys("Illinois");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[11]")).sendKeys("fdg");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[12]")).sendKeys("akash@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[13]")).sendKeys("----");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[14]")).sendKeys("CEO");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@type='text'])[15]")).sendKeys("2017-05-30");
				Thread.sleep(3000);
				
				
		
		
		
	}

}
