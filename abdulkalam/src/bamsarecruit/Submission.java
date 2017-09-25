package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Submission {

	
	public static void main(String[] args) throws InterruptedException
	
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.35:8080/bamsarecruit");
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
		//click submisson details
		driver.findElement(By.xpath("(.//*[@id='sendmail']/a)[2]")).click();
		Thread.sleep(5000);
		//click status of haseena
		driver.findElement(By.xpath("(//*[@value='Status'])[1]")).click();
		Thread.sleep(3000);
		Select s=new Select(driver.findElement(By.id("status")));
		s.selectByVisibleText("Interviewed");
		//click submit
		driver.findElement(By.xpath("(//*[@type='button'])[5]")).click();
		
		
		
		
	}

}
