package advisory;

//import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecretaryMeeting {

	
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.41:8080/amweb");
		//maximize window
		driver.manage().window().maximize();
		//do login
		driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("501");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		Thread.sleep(5000);
		//click on meetings
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[5]")).click();
        WebDriverWait w=new WebDriverWait(driver,10);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@href='/amweb/meetingslist'])[6]"))).click();
		//click on meeting schedule
		/*driver.findElement(By.xpath("//*[@href='/amweb/smeetingschedule']")).click();
		Thread.sleep(5000);
		//click on requestng meeting
		driver.findElement(By.xpath("(//*[@class='img-thumbnail'])[1]")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("18072017");
		driver.findElement(By.xpath("//*[@name='stime']")).sendKeys("11");
		driver.findElement(By.xpath("//*[@name='magenda']")).sendKeys("To discuss issues ");
		//click submit
		driver.findElement(By.xpath("//*[@type='submit']")).click();*/
		//click on meeting list
		//driver.findElement(By.xpath("(//*[@href='/amweb/meetingslist'])[6]")).click();
		Thread.sleep(5000);
		//click on payemnt
		
		

		
	}

}
