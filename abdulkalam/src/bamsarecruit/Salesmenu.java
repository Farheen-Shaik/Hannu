package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesmenu {

	
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
				//click sales activity
				driver.findElement(By.xpath("(//*[@class='parent'])[3]")).click();
				Thread.sleep(5000);
				//click on hotlist details
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/viewopening'])[2]")).click();
				Thread.sleep(5000);
				//click on red button
				driver.findElement(By.xpath("//*[@class='dice-menu']/li[1]")).click();
				Thread.sleep(5000);
				//click on 1st one
				driver.findElement(By.xpath("//*[@class='dice-menu']/li[2]")).click();
				Thread.sleep(5000);
				//click sales activity
				driver.findElement(By.xpath("(//*[@class='parent'])[3]")).click();
				Thread.sleep(5000);
				//click on hotlist details
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/viewopening'])[2]")).click();
				Thread.sleep(5000);
				//click on red button
				driver.findElement(By.xpath("//*[@class='dice-menu']/li[1]")).click();
				Thread.sleep(5000);
				//click on 2nd one
				driver.findElement(By.xpath("//*[@class='dice-menu']/li[3]")).click();
				Thread.sleep(5000);
				//click sales activity
				driver.findElement(By.xpath("(//*[@class='parent'])[3]")).click();
				Thread.sleep(5000);
				//click on hotlist details
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/viewopening'])[2]")).click();
				Thread.sleep(5000);
				//click on red button
				driver.findElement(By.xpath("//*[@class='dice-menu']/li[1]")).click();
				Thread.sleep(5000);
				//click on 3rd one
				driver.findElement(By.xpath("//*[@class='dice-menu']/li[4]")).click();
				Thread.sleep(5000);
				//click sales activity
				driver.findElement(By.xpath("(//*[@class='parent'])[3]")).click();
				Thread.sleep(5000);
				//click on hotlist details
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/viewopening'])[2]")).click();
				Thread.sleep(5000);
				//click on red button
				driver.findElement(By.xpath("//*[@class='dice-menu']/li[1]")).click();
				Thread.sleep(5000);
				//click on 4th one
				driver.findElement(By.xpath("//*[@class='dice-menu']/li[5]")).click();
				Thread.sleep(5000);
				//click back to dashboard
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/rdashboard'])[2]")).click();
				Thread.sleep(3000);
				//click ceo
				driver.findElement(By.xpath("html/body/div[1]/ul/li/a/i")).click();
				Thread.sleep(5000);
				//click logout
				driver.findElement(By.linkText("Logout")).click();
				
				
		
	}

}
