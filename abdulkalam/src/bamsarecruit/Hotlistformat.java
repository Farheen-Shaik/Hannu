package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotlistformat {

	
	public static void main(String[] args) throws InterruptedException
	{
		//launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://192.168.0.35:8080/bamsarecruit/");
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
				//click hotlist format
				driver.findElement(By.xpath("//*[@class='offer offer-success']")).click();
				Thread.sleep(3000);
				//fill fields
				driver.findElement(By.xpath("//*[@id='to']")).clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='to']")).sendKeys("karishma.prodesign@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='cc']")).sendKeys("sandeep.prodesign@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='bcc']")).sendKeys("sangeeth.prodesign@gmail.com");
				Thread.sleep(2000);
				//give subject
				driver.findElement(By.xpath("//*[@id='subject']")).sendKeys("Reg: attendance");
				
				//click none selected
				driver.findElement(By.xpath("(//*[@title='None selected'])[1]")).click();
				//select first name
				driver.findElement(By.xpath("(//*[@class='checkbox'])[2]")).click();
				//select last name
				driver.findElement(By.xpath("(//*[@class='checkbox'])[3]")).click();
				//select gender
				driver.findElement(By.xpath("(//*[@class='checkbox'])[5]")).click();
				//click non selecetd
				driver.findElement(By.xpath("//*[@title='None selected']")).click();
				Thread.sleep(3000);
				//slect 3rd one
				//driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/form/div[5]/div[2]/span/div/ul/li[3]/a/label")).click();
				Thread.sleep(3000);
				//click preview
				//driver.findElement(By.xpath("//*[@id='btnSelected']")).click();
				Thread.sleep(3000);
                //switch to frame
				driver.switchTo().frame(0);
				Thread.sleep(5000);
				/*driver.switchTo().frame(2);
				Thread.sleep(3000);*/
				driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("skjsi");
				//back to page
				driver.switchTo().defaultContent();
				//scroll down
				WebElement e=driver.findElement(By.xpath("//*[@type='submit']"));
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();",e);
				Thread.sleep(5000);
				//click send
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				
		
		

	}

}
