package builder;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String u=sc.nextLine();
		System.out.println("Enter criteria");
		String uc=sc.nextLine();
		System.out.println("Enter password");
		String p=sc.nextLine();
		System.out.println("Enter criteria");
		String pc=sc.nextLine();
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/builder/admin_login.php");
		//maximize window
		driver.manage().window().maximize();
		//do login
		driver.findElement(By.name("username")).sendKeys(u);
		driver.findElement(By.name("password")).sendKeys(p);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//validate credentials
		if(uc.equals("valid") && pc.equals("valid") && driver.findElement(By.xpath("//*[@class='page-header']")).isDisplayed())
		{
			System.out.println("Test Passed for valid data");
		}
		else if(uc.equals("valid") && pc.equals("invalid"))
		{
			System.out.println("Test passed for invalid pwd");
		}
		//click on add agent
		driver.findElement(By.xpath("(//*[@class='text-center'])[3]")).click();
		Thread.sleep(5000); 
		//fill fields
		driver.findElement(By.xpath("(//*[@name='name'])[1]")).sendKeys("sandeep");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@name='username'])[1]")).sendKeys("sandy.prodesign@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@name='password'])[1]")).sendKeys("srk");
		Thread.sleep(3000);
		Select s=new Select(driver.findElement(By.xpath("//*[@name='project']")));
		s.selectByVisibleText("Spandana Estates");
		Thread.sleep(3000);
		//click save it
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		Thread.sleep(3000);
		//click agent
		driver.findElement(By.xpath("(//*[@class='text-center'])[1]")).click();
		Thread.sleep(5000);
		//delete agent
		driver.findElement(By.xpath("//*[@title='delete']")).click();
		//driver.close();
		
		
	
	}

}
