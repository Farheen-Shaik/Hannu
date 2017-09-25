package admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAcc {

	
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
		//MAXIMIZE 
		driver.manage().window().maximize();
		//click on asset tracking
		driver.findElement(By.xpath("//*[@id='assets']/a")).click();
		//clcik on create new
		driver.findElement(By.linkText("Create New")).click();
		//click on acce
		driver.findElement(By.xpath("//*[@title='Accessory']/span")).click();
		//fill fields
		driver.findElement(By.id("accessory_tag")).sendKeys("uhn46");
		Select s=new Select(driver.findElement(By.xpath("(//*[@name='branchname'])[3]")));
		s.selectByVisibleText("Panjagutta");
		driver.findElement(By.xpath("(//*[@id='software'])[2]")).sendKeys("dhfywdb");
		driver.findElement(By.xpath("(//*[@id='category'])[1]")).sendKeys("jhgefeh");
		driver.findElement(By.xpath("(//*[@id='manufacturer'])[2]")).sendKeys("hf7whwa");
		driver.findElement(By.xpath("(//*[@id='model_select_id'])[2]")).sendKeys("sdmfw6347");
		driver.findElement(By.xpath("(//*[@name='purchasedate'])[3]")).click();
		Select s1=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		s1.selectByVisibleText("2014");
		Select s2=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		s2.selectByVisibleText("Jul");
		driver.findElement(By.linkText("4")).click();
		driver.findElement(By.xpath("(//*[@id='order_number'])[3]")).sendKeys("2hadf6");
		driver.findElement(By.xpath("(//*[@id='purchase_cost'])[3]")).sendKeys("4485992235.00");
		driver.findElement(By.id("Quantity_number")).sendKeys("79");
		driver.findElement(By.xpath("(//*[@type='submit'])[3]")).click();
		

		
	}

}
