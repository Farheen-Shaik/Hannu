package nageshwar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Griev {

	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://192.168.0.30:8080/bamsa/");
				//maximize window
				driver.manage().window().maximize();
				//click dev nd test departmnt
				driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/ul/div[7]/div[1]/li/a")).click();
				Thread.sleep(5000);
				//do login
				driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("CEO");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("tulasi");
				driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
				//MAXIMIZE 
				driver.manage().window().maximize();
				//click on asset tracking
				driver.findElement(By.xpath("//*[@id='assets']/a")).click();
				//click on dashboard
				driver.findElement(By.xpath("//*[@id='dashboard']/a")).click();
				//click on grievanc
				driver.findElement(By.xpath("//*[@id='complainta']/a")).click();
				//click on heading
				driver.findElement(By.xpath("//*[@id='headingTwo']")).click();
				Thread.sleep(5000);
				//fill details
				driver.findElement(By.xpath("//*[@class='tokens-container form-control']")).sendKeys("sandeep.prodesign@gmail.com");
				Thread.sleep(3000);
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				driver.findElement(By.xpath("//*[@id='subject']")).sendKeys("compramise");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='description']")).sendKeys("we will have a meeting in the evening in my cabin");
				Thread.sleep(3000);
				//click send
				driver.findElement(By.xpath("(//*[@type='button'])[3]")).click();
				//Thread.sleep(5000);
				//click logout
				//driver.findElement(By.xpath("//*[@class='ts-account']/a")).click();
				//driver.findElement(By.linkText("Logout")).click();
				
		
	}

}
