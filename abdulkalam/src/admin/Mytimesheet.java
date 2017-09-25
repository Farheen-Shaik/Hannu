package admin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mytimesheet {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		// Create FireFox browser object.

		WebDriver driver = new ChromeDriver();

		driver.get("http://124.123.41.5:8081/bamsa");
		driver.findElement(By.xpath("//*[@class='fa fa-laptop']")).click();
		       driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT18");  
		       //pay attention here By.name or By.id, see  the page source properly
		       driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123");
		       driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		               //driver.findElement(By.xpath("//*[@id='clockin']")).click();
		               driver.findElement(By.xpath("(//*[@href='/bamsa/clockDetails'])[2]")).click();
		              //To select list in drop down.
		               Select s=new Select(driver.findElement(By.xpath("html/body/div[2]/div[1]/div[3]/div/div/div[2]/div/div[1]/label/select")));
		                s.selectByVisibleText("25");
		                Thread.sleep(5000);
		                //JavascriptExecutor js=(JavascriptExecutor) driver;
		               // js.executeScript("window.scrollTo(0,document.body.scrollheight)");
		               //To scroll down
		                WebElement e=driver.findElement(By.linkText("Previous"));
		                JavascriptExecutor js= (JavascriptExecutor) driver;
		                js.executeScript("arguments[0].scrollIntoView();", e);
		                // To enter text
		               driver.findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys("44m");
		               //To click absent tab
		               driver.findElement(By.xpath("//*[@id='absent']")).click();
		              Thread.sleep(5000);
		              Select k=new Select (driver.findElement(By.xpath("//*[@id='myTables_length']/label/select")));
		              k.selectByVisibleText("50");
		              Thread.sleep(5000);
		            //To scroll down
		              WebElement e1=driver.findElement(By.linkText("Previous"));
		              JavascriptExecutor j= (JavascriptExecutor) driver;
		              j.executeScript("arguments[0].scrollIntoView();", e1);
		              Thread.sleep(5000);
		              // To enter text
		               driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[2]/div[1]/div/div[2]/label/input")).sendKeys("surya");
		               Thread.sleep(5000);
		               // To click close button
		               driver.findElement(By.xpath("(//*[@type='button'])[4]")).click();
		               Thread.sleep(5000);
		               //To click presentes tab
		               driver.findElement(By.xpath("//*[@id='present']")).click();
		               Thread.sleep(5000);
		               // To enter text
		               driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[2]/div/div[2]/label/input")).sendKeys("sandeep");
		               Thread.sleep(5000);
		               // To click close button
		               driver.findElement(By.xpath("(//*[@type='button'])[6]")).click();
		               //click dashboard
		               driver.findElement(By.xpath("html/body/div[2]/nav/ul/li[1]/a")).click();	
		               	
		            
		
	}

}
