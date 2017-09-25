package karishma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dineshonjava.com/2013/02/variable-and-datatype-in-java.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		if(driver.getPageSource().contains("when instance  variables are given accessibility"))
		{
			System.out.println("Text present");
		}
		else
		{
			System.out.println("Text not present");
		}
		driver.close();
	}
}