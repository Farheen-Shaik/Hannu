package nageshwar;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateBranch {

	
	public static void main(String[] args) throws InterruptedException
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://192.168.30:8080/bamsa/login");
				//maximize window
				driver.manage().window().maximize();
				Thread.sleep(5000);
				//click dev nd test departmnt
				//driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/ul/div[7]/div[1]/li/a")).click();
				//Thread.sleep(5000);
				//do login
				driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT01");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("2862PDT01");
				driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
				//MAXIMIZE 
				driver.manage().window().maximize();
				//click on asset tracking
				driver.findElement(By.xpath("//*[@id='assets']/a")).click();
				//click on create branch
				driver.findElement(By.xpath("//*[@onclick='getperform()']")).click();
				//MOVE ONE WINDOW TO OTHER WINDOW	
				ArrayList<String> x=new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(x.get(1));
				//fill fields
				driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Ongole");
				driver.findElement(By.xpath("//*[@name='state']")).sendKeys("AP");
				//click save
				driver.findElement(By.xpath("//*[@type='submit']")).click();

				
		
	}

}
