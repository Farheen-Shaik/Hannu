package karishma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class Parallel 
{
	@Test
	public void getSTM() throws InterruptedException
	{
		System.setProperty("webdriver.opera.driver", "C:\\karishma\\operadriver_win64\\operadriver.exe");
	    WebDriver driver=new OperaDriver();
	    driver.get("http://www.softwaretestingmaterial.com/parallel-test-execution-testng/");
	    Thread.sleep(10000);
		
	}
	@Test
	public void getGmail() throws InterruptedException
	{
		System.setProperty("webdriver.opera.driver", "C:\\karishma\\operadriver_win64\\operadriver.exe");
	    WebDriver driver=new OperaDriver();
	    driver.get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(10000);
	}
}
