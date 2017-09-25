package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditEmployeedetails {

	
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
				//click registration form
				driver.findElement(By.xpath("//*[@href='/bamsarecruit/registration']")).click();
				Thread.sleep(5000);
				//click edit employee details
				driver.findElement(By.xpath("//*[@class='btn btn-info btn-xs btn3d pull-right']")).click();
				Thread.sleep(3000);
				Select s=new Select(driver.findElement(By.id("uid")));
				s.selectByVisibleText("PDT6");
				//Select s1=new Select(driver.findElement(By.id("hid")));
				//s1.selectByVisibleText("RC123");
				Select s2=new Select(driver.findElement(By.id("designation")));
				s2.selectByVisibleText("Director");
				//click submit
				driver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn3d']")).click();
				
		
	}

}
