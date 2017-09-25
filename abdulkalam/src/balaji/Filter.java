package balaji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filter {

	
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
				//click on filter
				driver.findElement(By.xpath("//*[@class='btn btn-default btn-xs btn-filter']")).click();
				//s.no
				driver.findElement(By.xpath("//*[@placeholder='S.No']")).sendKeys("2");
				//chit number
				driver.findElement(By.xpath("//*[@placeholder='Chit Number']")).sendKeys("july");
				//chit type
				driver.findElement(By.xpath("//*[@placeholder='Chit Type']")).sendKeys("300000");
				//start date
				driver.findElement(By.xpath("//*[@placeholder='Start Date']")).sendKeys("2017-03-01");
				//group
				driver.findElement(By.xpath("//*[@placeholder='Group']")).sendKeys("50");
				//click download
				driver.findElement(By.xpath("//*[@class='btn btn-warning dropdown-toggle']")).click();
				//click on pdf
				//driver.findElement(By.linkText("Pdf")).click();
				//click on download
				//driver.findElement(By.xpath("//*[@id='download']")).click();
				//click on excel
				driver.findElement(By.linkText("Excel")).click();
				
				

		
	}

}
