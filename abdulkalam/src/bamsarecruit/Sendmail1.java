package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendmail1 {

	
	public static  void main(String[] args) throws InterruptedException 
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://192.168.0.35:8080/bamsarecruit");
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
				//click on qucik view
				driver.findElement(By.xpath("(//*[@class='parent'])[1]")).click();
				Thread.sleep(3000);
				//click send mail
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/sendMail'])[1]")).click();
				Thread.sleep(5000);
				//Fill fields
				driver.findElement(By.name("to")).sendKeys("sandeep.prodesign@gmail.com");
				driver.findElement(By.name("cc")).sendKeys("karishma.prodesign@gmail.com");
				driver.findElement(By.name("bcc")).sendKeys("keerthi.prodesign@gmail.com");
				driver.findElement(By.name("subject")).sendKeys("Reg: Attendance");
				//tinymce
				//driver.findElement(By.id("tinymce")).sendKeys("gywe hgedyuw hgbdu7 shdue ysdhgu7fydehg");
				//var obj = ((IJavaScriptExecutor)WebDriver).ExecuteScript("tinyMCE.activeEditor.setContent('" + text + "');");
		
	}

}
