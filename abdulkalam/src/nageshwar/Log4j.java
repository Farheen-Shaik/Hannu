package nageshwar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		//read data from file
		File f=new File("Desktop\\log4j.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String x= br.readLine();
		//write result in excel sheet
		PatternLayout l=new PatternLayout("Log4j-karishma-%d-%p-%c-%M-%m.%n");
		FileAppender f1=new FileAppender(l,"D:\\kavita\\result.txt");
		Logger log=Logger.getLogger(Log4j.class.getName());
		log.addAppender(f1);
		while(x!=null)
		{
			String p[]=x.split(",");
			// open gmail site
			System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			//fill uid and click next
			driver.findElement(By.name("Email")).sendKeys(p[0]);
			driver.findElement(By.id("next")).click();
			Thread.sleep(5000);
			//validate userid
			if(p[1].equals("valid") && driver.findElement(By.name("Passwd")).isDisplayed())
			{
				log.info("Test passed for valid uid");
				driver.findElement(By.name("Passwd")).sendKeys(p[2]);
				driver.findElement(By.id("signIn")).click();
				Thread.sleep(12000);
				if(p[3].equals("valid") && driver.findElement(By.xpath("//*[text()='COMPOSE']")).isDisplayed())
				{
					log.info("Test passed for valid pwd");
					
				}
				else if(p[3].equals("invalid") && driver.findElement(By.id("errormsg_0_Passwd")).isDisplayed())
				{
					log.info("Test passed for invalid pwd");
				}
				else
				{
					log.error("Test failed for pwd");
				}
				
			}
			else if(p[1].equals("invalid") && driver.findElement(By.id("errormsg_0_Email")).isDisplayed())
			{
				log.info("Test passed for invalid uid");
			}
			else
			{
			    log.error("Test Failed for uid");
				
			}
			//close site
			driver.close();
			x=br.readLine();
			}
		   br.close();
		   fr.close();
		
		
	}

}
