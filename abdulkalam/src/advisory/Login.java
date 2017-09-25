package advisory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	
	public static void main(String[] args)
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://124.123.41.5:8081/advisory/");
		//maximize window
		driver.manage().window().maximize();
		//do login
		driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("601");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		//logout
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		driver.findElement(By.xpath("//*[@href='/advisory/']")).click();
		

		
	}

}
