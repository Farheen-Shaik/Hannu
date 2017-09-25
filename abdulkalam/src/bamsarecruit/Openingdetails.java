package bamsarecruit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Openingdetails {

	
	public static void main(String[] args) throws InterruptedException 
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
				//click sales activity
				driver.findElement(By.xpath("(//*[@class='parent'])[2]")).click();
				Thread.sleep(5000);
				//click on hotlist details
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/viewopening'])[1]")).click();
				Thread.sleep(5000);
				//handle dropdown
				Select s=new Select(driver.findElement(By.xpath("//*[@name='myTable_length']")));
				s.selectByValue("25");
				//search any keyword except s.no
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("pd23");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("hr recruitern");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Hawaii");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("dgfh");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("java,spring,sql");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("c,c++");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Monthly");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("4.0");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("ravi");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("arnavi");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("lavanya");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("---");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("pd28");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='search']")).sendKeys("2017-06-14");
				Thread.sleep(3000);
				//click back to dashboard
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/rdashboard'])[2]")).click();
				Thread.sleep(5000);
				//click red colour box
				driver.findElement(By.xpath("html/body/div[2]/div/div[1]/ul/li[1]")).click();
				Thread.sleep(3000);
				//click 1st one
				driver.findElement(By.xpath("html/body/div[2]/div/div[1]/ul/li[2]")).click();
				Thread.sleep(3000);
				//click red colour box
				driver.findElement(By.xpath("html/body/div[2]/div/div[1]/ul/li[1]")).click();
				Thread.sleep(3000);
				//click 2nd one
				driver.findElement(By.xpath("html/body/div[2]/div/div[1]/ul/li[3]")).click();
				Thread.sleep(3000);
				//click recactivity
				driver.findElement(By.xpath("(//*[@class='parent'])[2]")).click();
				Thread.sleep(3000);
				//click openings
				driver.findElement(By.xpath("//*[@href='/bamsarecruit/viewopening']")).click();
				Thread.sleep(3000);
				//click red colour box
				driver.findElement(By.xpath("html/body/div[2]/div/div[2]/ul/li[1]")).click();
				Thread.sleep(3000);
				//click 3rd one
				driver.findElement(By.xpath("html/body/div[2]/div/div[2]/ul/li[4]")).click();
				Thread.sleep(3000);
				//click recactivity
				driver.findElement(By.xpath("(//*[@class='parent'])[2]")).click();
				Thread.sleep(3000);
				//click openings
				driver.findElement(By.xpath("//*[@href='/bamsarecruit/viewopening']")).click();
				Thread.sleep(3000);
				//click red colour box
				driver.findElement(By.xpath("html/body/div[2]/div/div[2]/ul/li[1]")).click();
				Thread.sleep(3000);
				//click last one
				driver.findElement(By.xpath("html/body/div[2]/div/div[2]/ul/li[5]")).click();
				Thread.sleep(3000);
				//click recactivity
				driver.findElement(By.xpath("(//*[@class='parent'])[2]")).click();
				Thread.sleep(3000);
				//click openings
				driver.findElement(By.xpath("//*[@href='/bamsarecruit/viewopening']")).click();
				Thread.sleep(3000);
				//click back to dashboard
				driver.findElement(By.xpath("(//*[@href='/bamsarecruit/rdashboard'])[2]")).click();
				Thread.sleep(5000);
				//click red colour box
				driver.findElement(By.xpath("html/body/div[2]/div/div[1]/ul/li[1]")).click();
				Thread.sleep(3000);
				//click call button 
				driver.findElement(By.xpath("html/body/div[2]/div/div[1]/ul/li[6]")).click();
				Thread.sleep(3000);
		
	}

}
