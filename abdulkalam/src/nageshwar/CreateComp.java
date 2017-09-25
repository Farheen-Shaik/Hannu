package nageshwar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateComp {

	
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.30:8080/bamsa/login");
		Thread.sleep(5000);
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
		//click on component
		driver.findElement(By.xpath("//*[@title='component']/span")).click();
		//fill fields
		driver.findElement(By.xpath("//*[@id='component_tag']")).sendKeys("2ncdh47");
		driver.findElement(By.xpath("//*[@id='component']")).sendKeys("bsdfyue");
		driver.findElement(By.xpath("(//*[@id='category'])[3]")).sendKeys("dnbfyewh");
		Select s=new Select(driver.findElement(By.xpath("(//*[@name='branchname'])[5]")));
		s.selectByVisibleText("Panjagutta");
		driver.findElement(By.xpath("//*[@id='serialno']")).sendKeys("sdbfgw3");
		driver.findElement(By.xpath("(//*[@name='purchasedate'])[5]")).click();
		Select s1=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		s1.selectByVisibleText("2014");
		Select s2=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		s2.selectByVisibleText("Jul");
		driver.findElement(By.linkText("4")).click();
		driver.findElement(By.xpath("(//*[@id='order_number'])[5]")).sendKeys("2hadf6");
		driver.findElement(By.xpath("(//*[@id='purchase_cost'])[5]")).sendKeys("4485992235.00");
		//clcik save
		driver.findElement(By.xpath("(//*[@type='submit'])[5]")).click();
		

		
	}

}
