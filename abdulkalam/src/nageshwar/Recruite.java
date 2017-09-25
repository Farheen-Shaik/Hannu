package nageshwar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recruite {

	
	public static void main(String[] args) throws InterruptedException
	{

		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.0.40:8080/bamsarecruit/");
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
		driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		driver.findElement(By.xpath("//*[@id='editd']")).click();
		driver.findElement(By.xpath("//*[@href='/bamsarecruit/broadcast?rqid=10']")).click();
		driver.findElement(By.xpath("//*[@title='None selected']")).click();
		driver.findElement(By.xpath("(//*[@class='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//*[@class='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//*[@class='checkbox'])[6]")).click();
		//click  preview
		driver.findElement(By.xpath("//*[@id='btnSelected']")).click();
		//find tinymce iframe
		 // = driver.findElement(By.cssSelector(".col_right iframe"));

		//switch to iframe
		//driver.switchTo().frame(1); 
		//driver.findElement(By.xpath("//*[@id='tinymce']/table/tbody/tr[2]/td[2]")).sendKeys("Teaam lead");
		//driver.switchTo().defaultContent();
		driver.switchTo().frame("content_ifr");
		driver.findElement(By.id("tinymce")).sendKeys("Hello");
		driver.switchTo().defaultContent();
		
		
	}

}
