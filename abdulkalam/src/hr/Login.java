package hr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://192.168.0.18:8080/bamsa/login");
				//maximize window
				driver.manage().window().maximize();
				//Thread.sleep(5000);
				//click dev nd test departmnt
				//driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/ul/div[7]/div[1]/li/a")).click();
				Thread.sleep(5000);
				//do login
				driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT40");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("3840PDT40");
				driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		
	}

}
