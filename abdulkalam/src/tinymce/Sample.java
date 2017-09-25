package tinymce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	
	public static void main(String[] args) 
	{
		        //launch browser and site
				System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://localhost/balaji/login.php");
				//maximize window
				driver.manage().window().maximize();
		
	}

}
