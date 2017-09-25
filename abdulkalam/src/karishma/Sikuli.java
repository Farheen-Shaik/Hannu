package karishma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Sikuli {

	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		//maximize window
		driver.manage().window().maximize();
		//click search
		driver.findElement(By.xpath("//*[@name='search_query']")).sendKeys("un mela oru kannu");
		driver.findElement(By.xpath("//*[@id='search-btn']")).click();
		Thread.sleep(5000);
		//click link
		driver.findElement(By.linkText("Rajinimurugan - Un Mele Oru Kannu Video | Sivakarthikeyan, Keethi Suresh| Imman")).click();
		Thread.sleep(5000);
		//click pause
		
		/*ScreenImage si=s.capture();
		BufferedImage bi=si.getImage();
		File f1=new File("C:\\karishma\\files\\screenshot.png");
		ImageIO.write(bi,"png",f1);?*/
		/*
		Screen s=new Screen();
		Location l=new Location(200,200);
		s.wheel(l,Button.LEFT,0);
		s.click("C:\\karishma\\files\\pause.png");
		Thread.sleep(10000);
		s.wheel(l,Button.LEFT,0);
		s.click("C:\\karishma\\files\\play.png");
		Thread.sleep(10000);
		s.wheel(l,Button.LEFT,0);
		s.click("C:\\karishma\\files\\volume.png");
		Thread.sleep(10000);
		s.wheel(l,Button.LEFT,0);
		s.click("C:\\karishma\\files\\maximize.png");
		Thread.sleep(10000);
		//close site
		driver.close();
		*/
	}

}
