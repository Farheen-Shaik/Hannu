package advisory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Builder {

	
	public static void main(String[] args) throws InterruptedException
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://124.123.41.5:8081/advisory/");
		//maximize window
		driver.manage().window().maximize();
		//do login
		driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("567");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		//click on community details
		driver.findElement(By.xpath("//*[@href='/advisory/cdetails']")).click();
		//click on meetings
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[4]")).click();
		//click on meeting schedule
		driver.findElement(By.xpath("//*[@href='/advisory/bmeetingschedule']")).click();
		Thread.sleep(5000);
		//click on request meeting
				driver.findElement(By.xpath("(//*[@class='img-thumbnail'])[1]")).click();
				Thread.sleep(5000);
				//click close
				driver.findElement(By.xpath("(//*[@class='close'])[2]")).click();
				//click on  meetings
				driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[4]")).click();
				Thread.sleep(5000);
				//click on meeting list
				driver.findElement(By.xpath("(//*[@href='/advisory/bmeetinglist'])[1]")).click();
				Thread.sleep(5000);
				//click on  meetings
				driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[4]")).click();
				Thread.sleep(5000);
				//click on mom
				driver.findElement(By.xpath("//*[@href='/advisory/bmom']")).click();
				//click on general ledger
				driver.findElement(By.xpath("//*[@href='#timeModal']")).click();
				Thread.sleep(5000);
				//click close
				driver.findElement(By.xpath("(//*[@class='close'])[1]")).click();
				//click 301
				driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
				//click logout
				driver.findElement(By.xpath("//*[@href='/advisory/']")).click();
				
		



	}

}
