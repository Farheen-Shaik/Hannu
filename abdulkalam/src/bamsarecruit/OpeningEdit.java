package bamsarecruit;

// import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpeningEdit {

	
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
				//click recactivity
				driver.findElement(By.xpath("(//*[@class='parent'])[2]")).click();
				Thread.sleep(3000);
				//click openings
				driver.findElement(By.xpath("//*[@href='/bamsarecruit/viewopening']")).click();
				Thread.sleep(3000);
				//click on software testing
				driver.findElement(By.linkText("Software testing")).click();
				Thread.sleep(5000);
				//ArrayList<String> x=new ArrayList<String>(driver.getWindowHandles());
				//driver.switchTo().window(x.get(1));
				//edit details
				//driver.findElement(By.xpath("//*[@id='positionid']")).clear();
				//driver.findElement(By.xpath("//*[@id='positionid']")).sendKeys("rc134");
				driver.findElement(By.xpath("//*[@id='positiontitle']")).clear();
				driver.findElement(By.xpath("//*[@id='positiontitle']")).sendKeys("manual tester");
				Select s=new Select(driver.findElement(By.id("state")));
				s.selectByVisibleText("Colorado");
				driver.findElement(By.id("city")).sendKeys("alaska");
				driver.findElement(By.id("ps")).clear();
				driver.findElement(By.id("ps")).sendKeys("writing testcases");
				driver.findElement(By.id("ss")).sendKeys("requirement knowledge");
				Select s1=new Select(driver.findElement(By.id("ratetype")));
				s1.selectByVisibleText("Monthly");
				driver.findElement(By.id("brate")).clear();
				driver.findElement(By.id("brate")).sendKeys("20.0");
				driver.findElement(By.id("primevendor")).clear();
				driver.findElement(By.id("primevendor")).sendKeys("oak");
				driver.findElement(By.id("contactdetails")).clear();
				driver.findElement(By.id("contactdetails")).sendKeys("keethu");
				driver.findElement(By.id("endclient")).clear();
				driver.findElement(By.id("endclient")).sendKeys("karishma");
				Thread.sleep(5000);
				//click primevendor
				driver.findElement(By.xpath(".//*[@id='pvs']/a")).click();
				Thread.sleep(5000);
				
				
				//description
				//driver.findElement(By.name("description")).sendKeys("dfwtyd hasgd hegrd hyewgdy");
				//Thread.sleep(3000);
				//click submit
				//driver.findElement(By.xpath("//*[@type='submit']")).click();
				//click close
				//driver.findElement(By.xpath("//*[@title='Close']")).click();
				
				
				
		
	}

}
