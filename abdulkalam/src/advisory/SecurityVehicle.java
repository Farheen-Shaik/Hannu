package advisory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecurityVehicle {

	
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.41:8080/amweb");
		//maximize window
		driver.manage().window().maximize();
		//do login
		driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("501");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		//click on vehicel parking
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[4]")).click();
		Thread.sleep(3000);
		//click on community parking
		driver.findElement(By.xpath("//*[@href='/amweb/cparking']")).click();
		Thread.sleep(5000);
		//click on register vehicle
		driver.findElement(By.xpath("(//*[@class='btn btn-success btn-block'])[1]")).click();
		Thread.sleep(15000);
		//fill fields
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("9");
		driver.findElement(By.xpath("//*[@name='vehicleno']")).sendKeys("hzsjhf747vgfxb");
		driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("501");
		driver.findElement(By.xpath("//*[@name='details']")).sendKeys("hsbgcyw hjsdwusdu hewwgdy");
		//click save
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		//click timelogs
		driver.findElement(By.xpath("(//*[@href='#timeModal'])[2]")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("6");
		//select time type
		Select s=new Select(driver.findElement(By.xpath("(//*[@name='times'])[1]")));
		s.selectByVisibleText("In");
		//click submit
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		//click on vehicel parking
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[4]")).click();
		Thread.sleep(5000);
		//click visitor parking
		driver.findElement(By.xpath("//*[@href='/amweb/vparking']")).click();
		Thread.sleep(5000);
		//click on register vehicle
		driver.findElement(By.linkText("REGISTER VISITOR VEHICLE")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("601");
		driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("hzsjhf747vgfxb");
		driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("601");
		driver.findElement(By.xpath("//*[@name='allotno']")).sendKeys("1");
		driver.findElement(By.xpath("//*[@name='details']")).sendKeys("cfcghgvh dtrfry6 gfvygy6788 bvghyhds");
		//click register
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		//click on time logs
		driver.findElement(By.linkText("Time Logs")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("6t78");
		Select s1=new Select(driver.findElement(By.xpath("(//*[@name='times'])[1]")));
		s1.selectByVisibleText("Out");
		//click submit
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		Thread.sleep(5000);
		//click on vehicel parking
				driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[4]")).click();
				Thread.sleep(5000);
		//Click on parking timings
		driver.findElement(By.xpath("//*[@href='/amweb/parkingtimings']")).click();
		
		
		
		
		
	}

}
