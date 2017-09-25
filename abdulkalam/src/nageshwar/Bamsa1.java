package nageshwar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bamsa1 {

	
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://124.123.41.5:8081/bamsa/");
				//maximize window
				driver.manage().window().maximize();
				//click dev nd test departmnt
				driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/ul/div[7]/div[1]/li/a")).click();
				Thread.sleep(5000);
				//do login
				driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT01");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("2862PDT01");
				driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
				//Click on all users
				driver.findElement(By.xpath("//*[@id='employees']/a")).click();
				//click on depart link
				driver.findElement(By.xpath("(//*[@class='timeline-panel'])[1]")).click();
				//click on java
				driver.findElement(By.linkText("JAVA")).click();
				//click on start live chat
		        driver.findElement(By.xpath("//*[@value='Start Live Chat']")).click();
		        //do login in chat room
		        driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/input")).sendKeys("system");
		        driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("password");
		        driver.findElement(By.xpath("//*[@type='submit']")).click();
		        //click on
		        driver.findElement(By.xpath("//*[@href='moderators.jsp']/b")).click();
		        //do login
		        driver.findElement(By.name("login")).sendKeys("karishma");
		        driver.findElement(By.name("//*[@name='email']")).sendKeys("karishma.prodesign@gmail.com");
		        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		        driver.findElement(By.xpath("//*[@name='checkpassword']")).sendKeys("password");
		        driver.findElement(By.xpath("//*[@value='Submit']")).click();
		        
		
	}

}
