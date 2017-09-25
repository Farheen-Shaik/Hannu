package advisory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecretaryDashboard {

	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://124.123.41.5:8081/advisory/");
				//maximize window
				driver.manage().window().maximize();
				//do login
				driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("501");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
				driver.findElement(By.xpath("//*[@value='Sign in']")).click();
				//click on documents
				/*driver.findElement(By.xpath("//*[@href='/advisory/sdocument']")).click();
				//give file name
				driver.findElement(By.xpath("//*[@id='exampleInputEmail2']")).sendKeys("pan");
				//click on browse
				driver.findElement(By.xpath("//*[@name='picture']")).click();
				//send file name to clipboard
				StringSelection f1=new StringSelection("Libraries\\Documents\\Prodesign-logo");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f1, null);
				//send clipboard data to screen
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(5000);
				//click save
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				//click submit
				driver.findElement(By.xpath("//*[@type='submit']")).click();*/
				//click on vehicel parking
				driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[4]")).click();
				//click on community parking
				driver.findElement(By.xpath("//*[@href='/advisory/cparking']")).click();
				Thread.sleep(5000);
				//click on register vehicle
				driver.findElement(By.linkText("REGISTER VEHICLE ")).click();
				Thread.sleep(5000);
				//fill fields
				driver.findElement(By.xpath("(//*[@name='vno'])[1]")).sendKeys("6");
				driver.findElement(By.xpath("//*[@name='vehicleno']")).sendKeys("hzsjhf747vgfxb");
				driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("786");
				driver.findElement(By.xpath("//*[@name='details']")).sendKeys("hsbgcyw hjsdwusdu hewwgdy");
				//click save
				driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
				Thread.sleep(3000);
				//handle alert
				driver.switchTo().alert().accept();
				
				
				
				
				
				//click on community documents
				//driver.findElement(By.xpath("//*[@href='/advisory/bcdocument']")).click();
				//click on personal document
				driver.findElement(By.xpath("//*[@href='/advisory/pdocument']")).click();
				//give file name
				driver.findElement(By.xpath("//*[@id='exampleInputEmail2']")).sendKeys("aadhar");
				Thread.sleep(5000);
				//click browse file
				driver.findElement(By.xpath("//*[@name='picture']")).click();
				Thread.sleep(5000);
				//send filename to clipboard
				StringSelection f=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f, null);
				//send clipboard data to screen
	            Robot r=new Robot();		
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(5000);
				//click save
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				//delete file
				driver.findElement(By.xpath("(//*[@class='fa fa-trash'])[1]")).click();
				//click on meetings
				driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[5]")).click();
				//click on meeting schedules
				driver.findElement(By.xpath("//*[@href='/advisory/pmeetingschedule']")).click();
				Thread.sleep(5000);
				//click on requestng meeting
				driver.findElement(By.xpath("(//*[@class='img-thumbnail'])[1]")).click();
				Thread.sleep(5000);
				//fill fields
				driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("16/07/2017");
				driver.findElement(By.xpath("//*[@name='stime']")).sendKeys("11");
				driver.findElement(By.xpath("//*[@name='magenda']")).sendKeys("To discuss issues of our apartment");
				//click submit
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				//click on meeting list
				driver.findElement(By.xpath("(//*[@href='/advisory/pmeetinglist'])[5]")).click();
				Thread.sleep(5000);
				//click on approved
				driver.findElement(By.xpath("(//*[@type='submit'])[4]")).click();
				//click on meetings
				driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[5]")).click();
				//click on mom
				driver.findElement(By.xpath("//*[@href='/advisory/pmom']")).click();
				//click on payment
				driver.findElement(By.xpath("//*[@href='/advisory/ppayment']")).click();
				//fill fields
				driver.findElement(By.xpath("//*[@name='pname']")).sendKeys("shahrukh");
				driver.findElement(By.xpath("//*[@name='pemail']")).sendKeys("shahrukh@gmail.com");
				driver.findElement(By.xpath("//*[@name='pphoneno']")).sendKeys("8756436789");
				driver.findElement(By.xpath("//*[@name='pamount']")).sendKeys("5000");
				Select s=new Select(driver.findElement(By.xpath("//*[@name='ppaymentmode']")));
				s.selectByVisibleText("Wallets");
				driver.findElement(By.xpath("//*[@name='pmessage']")).sendKeys("ashdgwqyg jashgd7w nsgdqwd ahasashwqd bhudhqw");
				driver.findElement(By.xpath(".//*[@id='contact']/fieldset[7]/a")).click();
				//MOVE ONE WINDOW TO OTHER WINDOW	
				ArrayList<String> x=new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(x.get(1));
				//fill fields
				driver.findElement(By.xpath("//*[@type='text']")).sendKeys("hheww shdsid qwhed8w bdiuwh");
				driver.findElement(By.xpath("//*[@type='number']")).sendKeys("5000");
				//click pay
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				//fill oder fields
				driver.findElement(By.xpath("//*[@type='text']")).sendKeys("shahrukh");
				driver.findElement(By.xpath("//*[@type='email']")).sendKeys("shahrukh@gmail.com");
				driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("8756436789");
				//click next
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				Thread.sleep(5000);
				//click on debit card
	            driver.findElement(By.xpath("(//*[@class='btn btn-block push--bottom text-left'])[1]")).click();
				Thread.sleep(5000);
				//switch to frame
				driver.switchTo().frame(0);
				//fill fields
				driver.findElement(By.xpath("//*[@name='cardNumberMask']")).sendKeys("409124567890");
				driver.findElement(By.xpath("//*[@class='name_on_card']")).sendKeys("karish");
				driver.findElement(By.xpath("//*[@class='card_exp_month']")).sendKeys("12");
				driver.findElement(By.xpath("//*[@class='card_exp_year']")).sendKeys("22");
				driver.findElement(By.name("cardSecurityCode")).sendKeys("3000");
				//click checkout
				driver.findElement(By.xpath("//*[@id='common_pay_btn']")).click();
				//back to page
				driver.switchTo().defaultContent();
				//click pay
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				//click next
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				Thread.sleep(5000);
				//click on credit card
	            driver.findElement(By.xpath("(//*[@class='btn btn-block push--bottom text-left'])[2]")).click();
				Thread.sleep(5000);
				//switch to frame
				driver.switchTo().frame(0);
				//fill fields
				driver.findElement(By.xpath("//*[@name='cardNumberMask']")).sendKeys("409124567890");
				driver.findElement(By.xpath("//*[@class='name_on_card']")).sendKeys("karish");
				driver.findElement(By.xpath("//*[@class='card_exp_month']")).sendKeys("12");
				driver.findElement(By.xpath("//*[@class='card_exp_year']")).sendKeys("22");
				driver.findElement(By.name("cardSecurityCode")).sendKeys("3000");
				//click checkout
				driver.findElement(By.xpath("//*[@id='common_pay_btn']")).click();
				Thread.sleep(5000);
				//back to page
				driver.switchTo().defaultContent();
				//click pay
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				//click next
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				Thread.sleep(5000);
		        //click on netbanking
				driver.findElement(By.linkText("Net Banking")).click();

		
	}

}
