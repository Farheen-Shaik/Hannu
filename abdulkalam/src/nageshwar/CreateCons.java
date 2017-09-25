package nageshwar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateCons {

	
	public static void main(String[] args) throws InterruptedException
	{

		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.169.30:8080/bamsa/login");
		//maximize window
		driver.manage().window().maximize();
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
		//clcik on create new
		driver.findElement(By.linkText("Create New")).click();
		//clcik on consumable
		driver.findElement(By.xpath("//*[@title='consumable']/span")).click();
		//fill fields
		driver.findElement(By.xpath("//*[@id='consumable_tag']")).sendKeys("dbfuywah");
		driver.findElement(By.xpath("//*[@id='consumable']")).sendKeys("sdfuerhf");
		driver.findElement(By.xpath("(//*[@id='category'])[2]")).sendKeys("dshfgywe");
		Select s=new Select(driver.findElement(By.xpath("(//*[@name='branchname'])[4]")));
		s.selectByVisibleText("Panjagutta");
		driver.findElement(By.xpath("(//*[@id='manufacturer'])[3]")).sendKeys("dsbfyuehf");
		driver.findElement(By.xpath("(//*[@id='model_select_id'])[3]")).sendKeys("sdmfw6347");
		driver.findElement(By.xpath("//*[@id='itemno']")).sendKeys("47ejwfn");
		driver.findElement(By.xpath("(//*[@name='purchasedate'])[4]")).click();
		Select s1=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		s1.selectByVisibleText("2014");
		Select s2=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		s2.selectByVisibleText("Jul");
		driver.findElement(By.linkText("4")).click();
		driver.findElement(By.xpath("(//*[@id='order_number'])[4]")).sendKeys("2hadf6");
		driver.findElement(By.xpath("(//*[@id='purchase_cost'])[4]")).sendKeys("4485992235.00");
		driver.findElement(By.xpath("(//*[@id='Quantity_number'])[2]")).sendKeys("79");
		driver.findElement(By.xpath("(//*[@type='submit'])[4]")).click();
		
		
	}

}
