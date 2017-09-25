package karishma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTests 
{

	
	@Test
	public void getSTM()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.softwaretestingmaterial.com/parallel-test-execution-testng/");
		
	}
	@Test
	public void getGmail()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://mail.google.com/mail/u/0/#inbox");
		
	}

}
