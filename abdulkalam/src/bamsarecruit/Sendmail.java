package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendmail {

	
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
		//click reqlist
		driver.findElement(By.xpath("(//*[@class='offer-content'])[1]")).click();
		Thread.sleep(3000);
		//click on qucik view
		driver.findElement(By.xpath("(//*[@class='parent'])[1]")).click();
	    Thread.sleep(3000);
	    //click send mail
	    driver.findElement(By.xpath("(//*[@href='/bamsarecruit/sendMail'])[1]")).click();
		Thread.sleep(5000);
		//click reqlist
		driver.findElement(By.xpath("(//*[@class='offer-content'])[2]")).click();
		Thread.sleep(3000);
		
		
	}

}
