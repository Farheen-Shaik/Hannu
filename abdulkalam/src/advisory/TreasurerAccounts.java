package advisory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreasurerAccounts {

	
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://124.123.41.5:8081/advisory/");
				//maximize window
				driver.manage().window().maximize();
				//do login
				driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("301");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
				driver.findElement(By.xpath("//*[@value='Sign in']")).click();
				//click on accounts
				driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[4]")).click();
				//click on maintanace
				driver.findElement(By.xpath("//*[@href='/advisory/maintenance']")).click();
				//click on accounts 
				driver.findElement(By.xpath("(//*[@data-toggle='modal'])[2]")).click();
				Thread.sleep(3000);
				//click close
				driver.findElement(By.xpath("(//*[@class='close'])[1]")).click();
				Thread.sleep(3000);
				//click on accounts
				driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[4]")).click();
				//click on expenses
				driver.findElement(By.xpath("(//*[@href='/advisory/expenses'])[1]")).click();
				//click on create expense
				driver.findElement(By.xpath("(//*[@data-toggle='modal'])[2]")).click();
				Thread.sleep(5000);
				//fill fields
				driver.findElement(By.xpath("//*[@name='month']")).sendKeys("june");
				driver.findElement(By.xpath("//*[@name='expensetype']")).sendKeys("Water");
				driver.findElement(By.xpath("//*[@name='amount']")).sendKeys("5000");
				driver.findElement(By.xpath("//*[@name='details']")).sendKeys("hrgfueawhfhfeeuhefuw fgrg");
				//click submit
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				//click on accounts
				driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[4]")).click();
				//click on other activity
				driver.findElement(By.xpath("//*[@href='/advisory/other']")).click();
				//click on other expences
				driver.findElement(By.xpath("(//*[@data-toggle='modal'])[2]")).click();
				Thread.sleep(3000);
				//Fill fields
				driver.findElement(By.xpath("//*[@placeholder='Expence']")).sendKeys("1");
				Select s=new Select(driver.findElement(By.xpath("(//*[@class='form-control'])[2]")));
				s.selectByIndex(1);
				driver.findElement(By.xpath("(//*[@placeholder='Account'])[1]")).sendKeys("water bill");
				driver.findElement(By.xpath("(//*[@placeholder='Account'])[2]")).sendKeys("6000");
				driver.findElement(By.xpath("(//*[@placeholder='Account'])[3]")).sendKeys("7/19/2017");
				Thread.sleep(5000);
				//click submit
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				Thread.sleep(5000);
				
				
				
				
				
				
				
				
		
	}

}
