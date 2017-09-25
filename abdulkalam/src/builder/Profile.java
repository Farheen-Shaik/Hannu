package builder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {

	
	public static void main(String[] args) 
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://localhost/builder/admin_login.php");
				//maximize window
				driver.manage().window().maximize();
				//do login
				driver.findElement(By.name("username")).sendKeys("admin@gmail.com");
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				//clcik on spandana estates
				driver.findElement(By.xpath("(//*[@role='button'])[1]")).click();
				//click on admin
				driver.findElement(By.xpath("(//*[@type='button'])[2]")).click();
				//click on projects
				driver.findElement(By.linkText("Projects")).click();
				//click on admin
				driver.findElement(By.xpath("(//*[@type='button'])[2]")).click();
				//click on agents
				driver.findElement(By.linkText("Agents")).click();
				//click on admin
				driver.findElement(By.xpath("(//*[@type='button'])[2]")).click();
				//click on logout
				driver.findElement(By.linkText("Logout")).click();
				

		
	}

}
