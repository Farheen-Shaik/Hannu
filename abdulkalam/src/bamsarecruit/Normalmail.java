package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normalmail {

	
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
		//click send mail
		driver.findElement(By.xpath("(//*[@href='/bamsarecruit/sendMail'])[1]")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.xpath("//*[@id='to']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='to']")).sendKeys("sandeep.prodesign@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cc']")).sendKeys("ghasytdgeycu@hjdsg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='bcc']")).sendKeys("shgfywefhewhw@jkdshf");
		Thread.sleep(2000);
		//give subject
		driver.findElement(By.xpath("//*[@id='subject']")).sendKeys("Reg: attendance");
		//switch to frame
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("Dont take leave morethan one day");
		//back to page
		driver.switchTo().defaultContent();
		//scroll down
		WebElement e=driver.findElement(By.xpath("//*[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(5000);
		//click send
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}

}
