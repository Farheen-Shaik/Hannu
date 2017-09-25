package nageshwar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	
	public static void main(String[] args) throws InterruptedException
	{

		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.30:8080/bamsa/login");
		//maximize window
		driver.manage().window().maximize();
		//click dev nd test departmnt
		//driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/ul/div[7]/div[1]/li/a")).click();
		Thread.sleep(5000);
		//do login
		driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT01");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("2862PDT01");
		driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		//CLCIK ON REGISTRATION FORM
		driver.findElement(By.xpath("//*[@id='registration']/a")).click();
		//fill fields
		driver .findElement(By.id("name")).sendKeys("karishma");
		driver.findElement(By.id("empid")).sendKeys("PDT57");
		driver.findElement(By.name("dob")).click();
		Select s=new Select(driver.findElement(By.className("ui-datepicker-year")));
		s.selectByValue("1994");
		Select s1=new Select(driver.findElement(By.className("ui-datepicker-month")));
		s1.selectByVisibleText("Aug");
		driver.findElement(By.linkText("4")).click();
		driver.findElement(By.name("doj")).click();
		Select s2=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		s2.selectByValue("2017");
		Select s3=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		s3.selectByVisibleText("Jun");
		driver.findElement(By.linkText("29")).click();
		driver.findElement(By.xpath("(//*[@id='phone'])[1]")).sendKeys("4365862728");
		driver.findElement(By.xpath("(//*[@id='phone'])[2]")).sendKeys("6346538775");
		driver.findElement(By.id("email")).sendKeys("kfjscgfdfhfgfh@gmail.com");
		driver.findElement(By.xpath("(//*[@id='gender'])[1]")).click();
		
		


		

		
	}

}
