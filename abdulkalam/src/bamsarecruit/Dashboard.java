package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard {

	
	public static void main(String[] args) throws InterruptedException 
	{
		        //launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://192.168.0.35:8080/bamsarecruit/");
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
				Thread.sleep(5000);
				//click openings
				driver.findElement(By.xpath("//*[@id='editd']")).click();
				Thread.sleep(3000);
				//click back to dashboard
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/rdashboard'])[2]")).click();
				Thread.sleep(2000);
				//click candidate
				driver.findElement(By.xpath("//*[@id='candids']")).click();
				Thread.sleep(3000);
				//click back to dashboard
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/rdashboard'])[2]")).click();
				Thread.sleep(2000);
				//click reqlist contacts
				driver.findElement(By.xpath("//*[@id='contactids']")).click();
				Thread.sleep(3000);
				//click back to dashboard
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/rdashboard'])[2]")).click();
				Thread.sleep(2000);
				//click on sales activity
				driver.findElement(By.xpath("(//*[@data-toggle='tab'])[2]")).click();
				Thread.sleep(3000);
				//click on hotlist candidates
				driver.findElement(By.xpath("//*[@id='hotid']/button")).click();
				Thread.sleep(3000);
				//click back to dashboard
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/rdashboard'])[2]")).click();
				Thread.sleep(2000);
				//click on sales activity
				driver.findElement(By.xpath("(//*[@data-toggle='tab'])[2]")).click();
				Thread.sleep(3000);
				//click on submissions
				driver.findElement(By.xpath("//*[@id='sendmailid']/button")).click();
				Thread.sleep(3000);
				//click  dashboard
				driver.findElement(By.xpath("//*[@id='rdashboard']/a")).click();
				Thread.sleep(2000);
				//click on sales activity
				driver.findElement(By.xpath("(//*[@data-toggle='tab'])[2]")).click();
				Thread.sleep(3000);
				//click on hotlist contacts
				driver.findElement(By.xpath("//*[@id='contactid']/button")).click();
				Thread.sleep(3000);
				//click back to dashboard
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/rdashboard'])[2]")).click();
				Thread.sleep(2000);
				
				
				
		
	}

}
