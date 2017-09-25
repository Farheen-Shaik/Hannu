package balaji;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PayDetails {

	
	public static void main(String[] args) 
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/balaji/login.php");
		//maximize window
		driver.manage().window().maximize();
		//do login
		driver.findElement(By.xpath("//*[@id='inputEmail']")).sendKeys("balaji");
		driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("balaji123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//click on payment details
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/table/tbody/tr[4]/td[8]/button")).click();
		driver.manage().window().maximize();
		//move to other window
		ArrayList<String> x= new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(x.get(1));
		//click on download
		driver.findElement(By.xpath("//*[@data-toggle='dropdown']")).click();
		//click on excel
		driver.findElement(By.linkText("Excel")).click();
		//click on hello balaji
		driver.findElement(By.xpath("(//*[@data-toggle='dropdown'])[1]")).click();
		//click on logout
		driver.findElement(By.linkText("Logout")).click();
		
		

		
	}

}
