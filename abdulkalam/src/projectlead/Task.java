package projectlead;

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

public class Task {

	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		 //launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://124.123.41.5:8081/bamsa/");
		//maximize window
		driver.manage().window().maximize();
		Robot r=new Robot();
		//click dev nd test departmnt
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/ul/div[7]/div[1]/li/a")).click();
		Thread.sleep(5000);
		//do login
		driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT36");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("4197PDT36");
		driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		//MAXIMIZE 
		driver.manage().window().maximize();
		//click on asset tracking
		driver.findElement(By.xpath("//*[@id='assets']/a")).click();
		//click on dashboard
		driver.findElement(By.xpath("//*[@id='dashboard']/a")).click();
		//click tasks
		driver.findElement(By.xpath("//*[@href='/bamsa/Mytask']")).click();
		//click dashboard
		driver.findElement(By.xpath("//*[@id='dashboard']/a")).click();
		//click tasks
		driver.findElement(By.xpath("//*[@id='mytask']/a")).click();
		//click on java
		//driver.findElement(By.xpath("//*[@href='/bamsa/Newtask?sid=1']/h2")).click();
		//click on assign task
		driver.findElement(By.linkText("Assign Task")).click();
		//click on task
		/*driver.findElement(By.xpath("(//*[@id='opener'])[1]")).click();
		driver.findElement(By.xpath("(//*[@id='tp'])[1]")).click();
		Select P=new Select(driver.findElement(By.xpath("//*[@id='projectname']")));
		P.selectByVisibleText("BAMSA");
		driver.findElement(By.xpath("//*[@id='taskd']")).sendKeys("hjgdywes gbfuhs geydw 3y87482b d fwbwhdwehn");
		driver.findElement(By.xpath("//*[@id='deadlineof']")).click();
		Select x=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		x.selectByValue("2018");
		Select y=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		y.selectByVisibleText("Jul");
		driver.findElement(By.linkText("7")).click();
		Thread.sleep(5000);
		//click on submit
		driver.findElement(By.xpath("(//*[@type='button'])[12]")).click();
		//press enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//click on close
		driver.findElement(By.xpath("//*[@title='Close']")).click();*/
		//click on create proj
		driver.findElement(By.xpath("//*[@onclick='getperform()']")).click();
		//MOVE ONE WINDOW TO OTHER WINDOW	
		ArrayList<String> u=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(u.get(1));
		driver.manage().window().maximize();
		//enter fields
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("vywduwyetsbvwy");
		driver.findElement(By.xpath("//*[@name='pdescription']")).sendKeys("dfysbyud2326324 dbyha weqndasvu ehwhdkqwif");
		driver.findElement(By.xpath("//*[@name='deadline']")).click();
		Select s=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		s.selectByValue("2015");
		Select s1=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		s1.selectByVisibleText("Jul");
		driver.findElement(By.linkText("7")).click();
		Thread.sleep(5000);
		//browse image
		driver.findElement(By.xpath("//*[@id='picture']")).click();
		Thread.sleep(5000);
		StringSelection f=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//click submit
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		//switch to back
		ArrayList<String> x1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(x1.get(0));
		//click on task status
		driver.findElement(By.linkText("Task Status")).click();
		//click on excel
		driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();
		//click pdf
		//driver.findElement(By.xpath("(//*[@type='button'])[2]")).click();
		//serach box
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("PDT18");
		//edit status
		driver.findElement(By.xpath("//*[@id='sign']")).click();
		driver.findElement(By.xpath("//*[@type='number']")).clear();
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("56");
		driver.findElement(By.xpath("//*[@id='reason']")).sendKeys("hjdgwyaifduhdyg nbsdsvftywageufdgwea hjbssdyfgaeuhf ");
		//click submit
		driver.findElement(By.xpath("(//*[@type='button'])[4]")).click();
		
		
		

	}

}
