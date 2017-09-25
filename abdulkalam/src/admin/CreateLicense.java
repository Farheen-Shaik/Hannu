package admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLicense {

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
		//click create new
		driver.findElement(By.linkText("Create New")).click();
		//create license
		driver.findElement(By.xpath("//*[@title='License']/span")).click();
		//fill details
		driver.findElement(By.id("License_tag")).sendKeys("46sh");
		Select s1=new Select(driver.findElement(By.xpath("(//*[@name='branchname'])[2]")));
		s1.selectByVisibleText("Panjagutta");
		driver.findElement(By.xpath("(//*[@id='software'])[1]")).sendKeys("QTP");
		driver.findElement(By.id("product")).sendKeys("GYUDUW");
		driver.findElement(By.id("seats")).sendKeys("34");
		driver.findElement(By.xpath("(//*[@id='manufacturer'])[1]")).sendKeys("ysuwru");
		driver.findElement(By.id("Licensed")).sendKeys("cgjfggff");
		driver.findElement(By.id("Licensedemail")).sendKeys("dhfjdsf@shdf.com");
		driver.findElement(By.xpath("(//*[@name='purchasedate'])[2]")).click();
		Select s2=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		s2.selectByVisibleText("2015");
		Select s3=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		s3.selectByVisibleText("Jul");
		driver.findElement(By.linkText("6")).click();
		driver.findElement(By.xpath("(//*[@id='order_number'])[2]")).sendKeys("ferhn");
		driver.findElement(By.xpath("(//*[@id='purchase_cost'])[2]")).sendKeys("1354300.00");
		driver.findElement(By.name("expiraydate")).click();
		Select s4=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		s4.selectByVisibleText("2017");
		Select s5=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		s5.selectByVisibleText("Jul");
		driver.findElement(By.linkText("13")).click();
		driver.findElement(By.xpath("(//*[@id='notes'])[2]")).sendKeys("nuhnfjhuifweri8q3ythwndjfwnfewhcnndjfwe7weiurtjnjfiewdnngdnwjkvndycaso");
		//click save
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		
		
		
	}

}
