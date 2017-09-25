package balaji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Investment {

	
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
		//click on investment
		driver.findElement(By.linkText("Investments")).click();
		Thread.sleep(5000);
		//click on new investmnt
		driver.findElement(By.linkText("New Investment")).click();
		//fill fields
		driver.findElement(By.xpath("//*[@name='particular']")).sendKeys("Shahrukh Add Agency");
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		driver.findElement(By.linkText("4")).click();
		driver.findElement(By.xpath("//*[@name='amount']")).sendKeys("50000000");
		//click save it
		driver.findElement(By.xpath("//*[@name='investmentadd']")).click();
		//click cancel
		//driver.findElement(By.xpath("//*[@class='btn']")).click();
		//click add money
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/table/tbody/tr[1]/td[6]/button")).click();
		Thread.sleep(5000);
		//fill details
		driver.findElement(By.xpath("//*[@id='amount']")).sendKeys("50000");
		driver.findElement(By.xpath("//*[@name='remark']")).click();
		driver.switchTo().alert().accept();
		

		
	}

}
