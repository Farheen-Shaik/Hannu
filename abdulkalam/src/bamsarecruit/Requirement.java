package bamsarecruit;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Requirement {

	
	public static void main(String[] args) throws InterruptedException 
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
				//click on requirement
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/addRequirement'])[1]")).click();
				Thread.sleep(3000);
				//fill fields
				driver.findElement(By.xpath("//*[@id='pid']")).sendKeys("D555");
				driver.findElement(By.name("ptitle")).sendKeys("Testing");
				driver.findElement(By.name("city")).sendKeys("koi bhi");
				Select s=new Select(driver.findElement(By.name("state")));
				s.selectByVisibleText("Texas");
				driver.findElement(By.name("pskill")).sendKeys("Automation");
				driver.findElement(By.name("sskill")).sendKeys("java");
				Select s1=new Select(driver.findElement(By.name("ratetype")));
				s1.selectByVisibleText("Hourly");
				driver.findElement(By.name("rate")).sendKeys("3400");
				driver.findElement(By.name("pvendor")).sendKeys("prodeisgn technologies india pvt ltd");
				driver.findElement(By.name("contact")).sendKeys("raham");
				//click prime vendor
				/*driver.findElement(By.linkText("Add Prime-Vendor")).click();
				Thread.sleep(5000);
				//Switch to window
				ArrayList<String> x=new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(x.get(1));
				Thread.sleep(5000);
			//Fill fields
				driver.findElement(By.name("fname")).sendKeys("rahane");
				driver.findElement(By.name("lname")).sendKeys("Shaik");
				driver.findElement(By.name("accountname")).sendKeys("almas");
				Select s2=new Select(driver.findElement(By.name("accowner")));
				s2.selectByVisibleText("madhu");
				Select s3=new Select(driver.findElement(By.name("category")));
				s3.selectByVisibleText("Client");
				driver.findElement(By.name("website")).sendKeys("www.example.com");
				Select s4=new Select(driver.findElement(By.name("status")));
				s4.selectByVisibleText("Active");
				driver.findElement(By.name("reqlist")).click();
				Thread.sleep(5000);
				driver.findElement(By.name("hotlist")).click();
				Thread.sleep(5000);
				driver.findElement(By.name("city")).sendKeys("koi bhi kuch bhi");
				Select s5=new Select(driver.findElement(By.name("state")));
				s5.selectByVisibleText("Florida");
			    driver.findElement(By.name("pemail")).sendKeys("rahim@gmail.com");
				driver.findElement(By.name("semail")).sendKeys("rahane@gmail.com");
				driver.findElement(By.name("phone")).sendKeys("4563782456");
				//scroll down
				WebElement e=driver.findElement(By.xpath("//*[@type='submit']"));
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();",e);
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//*[@name='description'])[3]")).click();
				Actions a=new Actions(driver);
				a.sendKeys("safdedg sdfhuyshg").build().perform();
				//click add account
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				//Switch back to window
				ArrayList<String> x1=new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(x1.get(0));
				Thread.sleep(5000);*/
				//give primevendor
				//driver.findElement(By.name("pvendor")).sendKeys("society");
				
				driver.findElement(By.name("eclient")).sendKeys("salman");
				//scroll down
				WebElement e1=driver.findElement(By.xpath("//*[@type='submit']"));
				JavascriptExecutor js1=(JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView();",e1);
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//*[@name='description'])[3]")).click();
				//driver.findElement(By.name("description")).sendKeys("egcs gssdcyugs hsgsnscb bshdb");
				Actions a1=new Actions(driver);
				a1.sendKeys("safdedg sdfhuyshg").build().perform();				
				//click add account
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				
				
		
	}

}
