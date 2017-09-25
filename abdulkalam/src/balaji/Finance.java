package balaji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finance
{

	
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
				//click on finance
				driver.findElement(By.linkText("Finance Information")).click();
				//click download
				driver.findElement(By.xpath("(//*[@class='btn btn-warning dropdown-toggle'])[1]")).click();
				driver.findElement(By.linkText("Excel")).click();
				//click ongoing
				driver.findElement(By.linkText("Ongoing")).click();
				//click download
				driver.findElement(By.xpath("(//*[@class='btn btn-warning dropdown-toggle'])[2]")).click();
				driver.findElement(By.linkText("Excel")).click();
				Thread.sleep(5000);
				//click pending
				driver.findElement(By.linkText("Pending")).click();
				//click download
				driver.findElement(By.xpath("(//*[@class='btn btn-warning dropdown-toggle'])[3]")).click();
				driver.findElement(By.linkText("Excel")).click();
				Thread.sleep(5000);
				//click closed
				driver.findElement(By.linkText("Closed")).click();
				//click download
				driver.findElement(By.xpath("(//*[@class='btn btn-warning dropdown-toggle'])[4]")).click();
				driver.findElement(By.linkText("Excel")).click();
				Thread.sleep(5000);
				//click daily collections
				driver.findElement(By.linkText("Daily Collections")).click();
				//click download
				driver.findElement(By.xpath("(//*[@class='btn btn-warning dropdown-toggle'])[5]")).click();
				driver.findElement(By.linkText("Excel")).click();
				Thread.sleep(5000);
				
		
	}

}
