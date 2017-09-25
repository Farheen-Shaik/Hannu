package advisory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Complaint {

	
	public static void main(String[] args) throws InterruptedException
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.41:8080/amweb");
		//maximize window
		driver.manage().window().maximize();
		//click on complaint
		driver.findElement(By.linkText("Complaint")).click();
		Thread.sleep(5000);
		//Fill fields
		driver.findElement(By.name("flatno")).sendKeys("888");
		driver.findElement(By.name("details")).sendKeys("karr");
		driver.findElement(By.name("complaint")).sendKeys("power issue");
		//click submit
		driver.findElement(By.xpath("(//*[@value='Submit'])[1]")).click();
		
		
	}

}
