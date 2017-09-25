package admin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssetTracking {

	
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://124.123.41.5:8081/bamsa/");
				//maximize window
				driver.manage().window().maximize();
				Thread.sleep(5000);
				//click dev nd test departmnt
				driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/ul/div[7]/div[1]/li/a")).click();
				Thread.sleep(5000);
				//do login
				driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT18");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123");
				driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
				//click on asset tracking
				driver.findElement(By.xpath("//*[@id='assets']/a")).click();
				//Fill fields
				//Select s=new Select(driver.findElement(By.xpath("//*[@id='Marque']")));
				//s.selectByVisibleText("Asset");
				//Select s1=new Select(driver.findElement(By.xpath("//*[@name='tag']")));
				//s1.selectByVisibleText("")
				//clcik view all
				/*driver.findElement(By.linkText("View All")).click();
				driver.findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys("E540090");
				//clcik on license
				driver.findElement(By.xpath("//*[@title='License']/span")).click();
				driver.findElement(By.xpath("(//*[@type='search'])[2]")).sendKeys("QTP22");
				//click on acce
				driver.findElement(By.xpath("//*[@title='Accessory']/span")).click();
				driver.findElement(By.xpath("(//*[@type='search'])[3]")).sendKeys("pds9");
				//click on consumable
				driver.findElement(By.xpath("//*[@title='consumable']/span")).click();
				driver.findElement(By.xpath("(//*[@type='search'])[4]")).sendKeys("Internet");
				//click on component
				driver.findElement(By.xpath("//*[@title='component']/span")).click();
				driver.findElement(By.xpath("(//*[@type='search'])[5]")).sendKeys("RM0091");*/
				//click create new
				driver.findElement(By.linkText("Create New")).click();
				//enter fields
				driver.findElement(By.id("asset_tag")).sendKeys("65ghuhbn");
				driver.findElement(By.id("model_select_id")).sendKeys("567F");
				Select s=new Select(driver.findElement(By.id("status_select_id")));
				s.selectByVisibleText("Out for Repair");
				Select s1=new Select(driver.findElement(By.xpath("(//*[@name='branchname'])[1]")));
				s1.selectByVisibleText("Panjagutta");
				driver.findElement(By.id("serial")).sendKeys("sa4sdrtdtjfyyfjjygftjdjrsnfdxfcjgftydrsfcxgcjhjhyurtesefxfxfhgyte3ewxfghvfxdxfcxfcfgdtr");
				driver.findElement(By.id("name")).sendKeys("dfergtr");
				driver.findElement(By.name("purchasedate")).click();
				Select s2=new Select(driver.findElement(By.className("ui-datepicker-year")));
				s2.selectByValue("2016");
				Select s3=new Select(driver.findElement(By.className("ui-datepicker-month")));
				s3.selectByVisibleText("Jan");
				driver.findElement(By.linkText("6")).click();
				driver.findElement(By.name("supplier_id")).sendKeys("987");
				driver.findElement(By.id("order_number")).sendKeys("3267");
				driver.findElement(By.id("purchase_cost")).sendKeys("32000");
				driver.findElement(By.id("warranty_months")).sendKeys("50");
				driver.findElement(By.xpath("(//*[@id='notes'])[1]")).sendKeys("ydhfaifagfe");
				driver.findElement(By.id("file-upload")).click();
				Thread.sleep(5000);
				//Browse file
				Robot r=new Robot();
				StringSelection f=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f, null);
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				//click save
				driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
				//click logout
				//driver.findElement(By.xpath("//*[@class='ts-account']/a")).click();
				//driver.findElement(By.linkText("Logout")).click();

				
		
	}

}
