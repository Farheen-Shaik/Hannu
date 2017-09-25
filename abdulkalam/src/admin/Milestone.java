package admin;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Milestone {

	
	public static void main(String[] args) throws InterruptedException
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://124.123.41.5:8081/bamsa/");
				//maximize window
				driver.manage().window().maximize();
				//click dev nd test departmnt
				driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/ul/div[7]/div[1]/li/a")).click();
				Thread.sleep(5000);
				//do login
				driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT18");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123");
				driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
				//click on milestone
				driver.findElement(By.xpath("//*[@id='milestones']/a")).click();
				//clcik on view details
				driver.findElement(By.xpath("(//*[@type='button'])[12]")).click();
				//clcik on close
				//driver.findElement(By.xpath("html/body/div[3]/div[1]/button")).click();
				//clcik on performance
				WebElement myDynamicElement = (new WebDriverWait(driver, 10))
						  .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='dvTable']/table/tbody/tr[2]/td[4]/input")));
						myDynamicElement.click();
				//driver.findElement(By.xpath("")).click();
				//click on download
				Thread.sleep(10000);		
				//driver.findElement(By.xpath("//*[@class='export-main']/a")).click();
				//driver.findElement(By.xpath("//*[@id='chartdiv']/div/div[2]/ul/li/a")).click();
				//MOVE ONE WINDOW TO OTHER WINDOW	
				ArrayList<String> x=new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(x.get(1));
				//clcik on download as
				driver.findElement(By.xpath("//*[@class='export-main']/a")).click();
				driver.findElement(By.xpath(".//*[@id='chartdiv']/div/div[2]/ul/li/ul/li[1]/a")).click();
				driver.findElement(By.xpath(".//*[@id='chartdiv']/div/div[2]/ul/li/ul/li[1]/ul/li[1]/a")).click();
				

		
	}

}
