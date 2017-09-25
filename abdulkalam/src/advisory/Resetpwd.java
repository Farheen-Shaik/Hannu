package advisory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resetpwd {

	
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://192.168.0.41:8080/amweb/");
				//maximize window
				driver.manage().window().maximize();
				//click on reset pwd
				driver.findElement(By.linkText("Reset Password ?")).click();
				Thread.sleep(5000);
				//fill fields
				driver.findElement(By.xpath("(//*[@name='flatno'])[2]")).sendKeys("601");
				driver.findElement(By.xpath("//*[@name='oldpassword']")).sendKeys("karishma");
				driver.findElement(By.xpath("//*[@name='newpassword']")).sendKeys("password");
				driver.findElement(By.xpath("//*[@name='cnfmpassword']")).sendKeys("password");
				//click submit
				driver.findElement(By.xpath("(//*[@name='login'])[2]")).click();
		
	}

}
