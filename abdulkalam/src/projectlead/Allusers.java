package projectlead;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Allusers {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		// Create FireFox browser object.

		WebDriver driver = new ChromeDriver();
		//Enter url
		driver.get("http://192.168.30:8080/bamsa/login");

		//driver.findElement(By.xpath("//*[@class='fa fa-laptop']")).click();
		//Enter username
		       driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT36");  
		       //pay attention here By.name or By.id, see  the page source properly
		       //Enter password
		       driver.findElement(By.xpath("//*[@name='password']")).sendKeys("4197PDT36");
		       //Click submit button.
		       driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		       //click all users
		       driver.findElement(By.xpath("//*[@id='employees']/a")).click();
		       //
		       driver.findElement(By.xpath("(//*[@class='timeline-title'])[1]")).click();
		       //
		       driver.findElement(By.linkText("JAVA")).click();
		       //
		       driver.findElement(By.xpath("//*[@value='Start Live Chat']")).click();
		       //
		       ArrayList<String> x= new ArrayList<String>(driver.getWindowHandles());
		       driver.switchTo().window(x.get(1));
		       driver.findElement(By.xpath("//*[@name='name']")).sendKeys("system");
		       driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		       driver.findElement(By.xpath("//*[@name='SystemLogin']")).click();
		               Select k= new Select(driver.findElement(By.xpath("//*[@name='chatrooms']")));
		               k.selectByIndex(1);
		               driver.findElement(By.xpath("html/body/form/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/font/a/b")).click();
		               driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Testing");
		               driver.findElement(By.xpath("//*[@name='subject']")).sendKeys("sandeep");
		               driver.findElement(By.xpath("//*[@name='Button']")).click();
		               driver.findElement(By.xpath("//*[@href='moderators.jsp']")).click();
		               driver.findElement(By.xpath("//*[@href='xmlconfig.jsp']")).click();
		               driver.findElement(By.xpath("//*[@href='javascript:logout()']/b")).click();
		}

		
	}


