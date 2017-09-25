package hr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grievance {

	
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
		driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT36");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("4197PDT36");
		driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		//click on grievanc
		driver.findElement(By.xpath("//*[@id='complaint']/a")).click();
		//FILL FIELDS
		Select s=new Select(driver.findElement(By.xpath("//*[@id='gtype']")));
		s.selectByVisibleText("Work Loads");
		Select s1=new Select(driver.findElement(By.xpath("//*[@id='severe']")));
		s1.selectByVisibleText("4--Severe");
		driver.findElement(By.xpath("//*[@id='mob']")).sendKeys("7689239172");
		driver.findElement(By.xpath("//*[@id='details']")).sendKeys("dgffw  egwehwhwhiw  uhduwfbhj dhgwqhdqd uhiqwdqwjd ");
		//click register
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		

		
	}

}
