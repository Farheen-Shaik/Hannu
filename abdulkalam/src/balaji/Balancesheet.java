package balaji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Balancesheet {

	
	public static void main(String[] args) throws InterruptedException 
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
				//click on hello balaji
				driver.findElement(By.xpath("(//*[@data-toggle='dropdown'])[1]")).click();
				Thread.sleep(5000);
				//click on balance sheet
				driver.findElement(By.linkText("Balance Sheet")).click();
				Thread.sleep(5000);
				//click on add expenditure
				driver.findElement(By.linkText("Add Expenditure")).click();
				Thread.sleep(5000);
				//fill fields
				driver.findElement(By.xpath("//*[@name='particular']")).sendKeys("Petrol");
				driver.findElement(By.xpath("//*[@id='datepicker']")).click();
				driver.findElement(By.linkText("13")).click();
				driver.findElement(By.xpath("//*[@name='amount']")).sendKeys("500");
				//click cancel
				//driver.findElement(By.xpath("//*[@class='btn']")).click();
				//click save it
				driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
				//click select month
				Select s=new Select(driver.findElement(By.xpath("//*[@name='month']")));
				s.selectByVisibleText("May");
				//click get report
				driver.findElement(By.xpath("//*[@value='Get Report']")).click();
				//click download
				driver.findElement(By.xpath("//*[@class='btn btn-warning dropdown-toggle']")).click();
				//click on excel
				driver.findElement(By.linkText("Excel")).click();
				//click hello balaji
				driver.findElement(By.xpath("(//*[@data-toggle='dropdown'])[1]")).click();
				Thread.sleep(5000);
				//click logout
				driver.findElement(By.linkText("Logout")).click();
				
				
				
				
				

		
	}

}
