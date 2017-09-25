package projectlead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalGantt {

	
	public static void main(String[] args) throws InterruptedException
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.30:8080/bamsa/login");
		//maximize window
		driver.manage().window().maximize();
		//click dev nd test departmnt
		//driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/ul/div[7]/div[1]/li/a")).click();
		Thread.sleep(5000);
		//do login
		driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT36");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("4197PDT36");
		driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		//click on my calander
		driver.findElement(By.xpath("//*[@id='calendar']/a")).click();
		//clcik on left arrow
		driver.findElement(By.xpath("//*[@id='dncalendar-prev-month']")).click();
		driver.findElement(By.xpath("//*[@id='dncalendar-next-month']")).click();
		//click on 
		driver.findElement(By.xpath("//*[@id='complaint']/a")).click();
		//click search
		//driver.findElement(By.xpath("//*[@type='search']")).sendKeys("PDT26");
		//click on gantt chat
		driver.findElement(By.xpath("//*[@id='ganttchart']/a")).click();
		//driver.findElement(By.name("empid")).sendKeys("PDT25");
		Select s=new Select(driver.findElement(By.id("npid")));
		s.selectByVisibleText("BAMSA");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//do logout
		driver.findElement(By.xpath("//*[@class='ts-account']/a")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
	}

}
