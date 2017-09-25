package nageshwar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bamsa2 {

	
	public static void main(String[] args) 
	{

		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://124.123.41.5:8081/jchatbox/admin/index.jsp");
		//click on moderators
		 driver.findElement(By.xpath("//*[@href='moderators.jsp']/b")).click();
	        //do login
	        driver.findElement(By.name("login")).sendKeys("karishma");
	        driver.findElement(By.name("//*[@name='email']")).sendKeys("karishma.prodesign@gmail.com");
	        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
	        driver.findElement(By.xpath("//*[@name='checkpassword']")).sendKeys("password");
	        driver.findElement(By.xpath("//*[@value='Submit']")).click();
		
	}

}
