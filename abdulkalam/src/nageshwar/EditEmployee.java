package nageshwar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditEmployee {

	
	public static void main(String[] args) throws InterruptedException
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://124.123.41.5:8081/bamsalogin/");
				//maximize window
				driver.manage().window().maximize();
				Thread.sleep(5000);
				//click dev nd test departmnt
				//driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/ul/div[7]/div[1]/li/a")).click();
				Thread.sleep(5000);
				//do login
				driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT01");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("2862PDT01");
				driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
				//MAXIMIZE 
				driver.manage().window().maximize();
				//click on edit details
				//driver.findElement(By.xpath("//*[@id='editid']/div/fieldset/button")).click();
				//click on asset tracking
				driver.findElement(By.xpath("//*[@id='assets']/a")).click();
				driver.findElement(By.xpath("//*[@class='ts-account']/a")).click();
				driver.findElement(By.linkText("Edit Account")).click();
				//edit details
				driver.findElement(By.id("name")).sendKeys("Jaya Kishore.T.");
				driver.findElement(By.name("dob")).sendKeys("30-12-1982");
				driver.findElement(By.id("phone")).sendKeys("9052821048");
				driver.findElement(By.id("emgphone")).sendKeys("9052821048");
				driver.findElement(By.id("email")).sendKeys("kishoe.me32@gmail.com");
				driver.findElement(By.xpath("//*[@value='Female']")).click();
				//click submit
				driver.findElement(By.xpath("//*[@type='submit']")).click();



	}

}
