package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Contact {

	
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
				//click on contact
				driver.findElement(By.xpath("//*[@href='/bamsarecruit/addClient']")).click();
				Thread.sleep(5000);
				//Fill fields
				driver.findElement(By.name("fname")).sendKeys("234567");
				driver.findElement(By.name("lname")).sendKeys("2324356");
				driver.findElement(By.name("accountname")).sendKeys("Prodesign Technologies india pvt ltd");
				Select s=new Select(driver.findElement(By.name("accowner")));
				s.selectByVisibleText("madhu");
				Select s1=new Select(driver.findElement(By.name("category")));
				s1.selectByVisibleText("Client");
				driver.findElement(By.name("website")).sendKeys("AETRTYUIO987654322345VC@FGHJKLKJHRRT");
				Select s2=new Select(driver.findElement(By.name("status")));
				s2.selectByVisibleText("Active");
				driver.findElement(By.name("reqlist")).click();
				Thread.sleep(5000);
				driver.findElement(By.name("hotlist")).click();
				Thread.sleep(5000);
				driver.findElement(By.name("city")).sendKeys("koi bhi kuch bhi");
				Select s3=new Select(driver.findElement(By.name("state")));
				s3.selectByVisibleText("Florida");
			    driver.findElement(By.name("pemail")).sendKeys("ASDFVGHJK@DRTYUK");
				driver.findElement(By.name("semail")).sendKeys("XCVBNMJ@SRTYJDFGGH123");
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
				
				
				
				
				
				
				
		
	}

}
