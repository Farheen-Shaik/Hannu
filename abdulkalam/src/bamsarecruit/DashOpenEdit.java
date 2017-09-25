package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class DashOpenEdit {

	
	public static void main(String[] args) throws InterruptedException
	
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.35:8080/bamsarecruit");
		Thread.sleep(5000);
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//click on dev nd test
		driver.findElement(By.xpath("//*[@class='icoFacebook']")).click();
		//fill fields
		driver.findElement(By.xpath("//*[@id='loginform']/input[1]")).sendKeys("CEO");	
		driver.findElement(By.xpath("//*[@id='loginform']/input[2]")).sendKeys("tulasi");
		driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		//click on openings
		driver.findElement(By.xpath("//*[@id='editd']")).click();
		Thread.sleep(3000);
		//click on dotnet developer
		//driver.findElement(By.linkText("Dot net developer")).click();
		Thread.sleep(3000);
		//ArrayList<String> x=new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(x.get(1));
		//edit details
		//driver.findElement(By.xpath("//*[@id='positionid']")).clear();
		//driver.findElement(By.xpath("//*[@id='positionid']")).sendKeys("rc134");
		/*driver.findElement(By.xpath("//*[@id='positiontitle']")).clear();
		driver.findElement(By.xpath("//*[@id='positiontitle']")).sendKeys("manual tester");
		Select s=new Select(driver.findElement(By.id("state")));
		s.selectByVisibleText("Colorado");
		driver.findElement(By.id("city")).sendKeys("alaska");
		driver.findElement(By.id("ps")).clear();
		driver.findElement(By.id("ps")).sendKeys("writing testcases");
		driver.findElement(By.id("ss")).sendKeys("requirement knowledge");
		Select s1=new Select(driver.findElement(By.id("ratetype")));
		s1.selectByVisibleText("Monthly");
		driver.findElement(By.id("brate")).clear();
		driver.findElement(By.id("brate")).sendKeys("20.0");
		driver.findElement(By.id("primevendor")).clear();
		driver.findElement(By.id("primevendor")).sendKeys("sreenu");
		driver.findElement(By.id("contactdetails")).clear();
		driver.findElement(By.id("contactdetails")).sendKeys("keethu");
		driver.findElement(By.id("endclient")).clear();
		driver.findElement(By.id("endclient")).sendKeys("karishma");
		Thread.sleep(5000);*/
		//click on 2nd page
		driver.findElement(By.linkText("2")).click();
		Thread.sleep(2000);
		//click 1
		driver.findElement(By.linkText("1")).click();
		Thread.sleep(5000);
		//click next
		driver.findElement(By.linkText("Next")).click();
		Thread.sleep(2000);
		//click previous
		driver.findElement(By.linkText("Previous")).click();
		
		
	}

}
