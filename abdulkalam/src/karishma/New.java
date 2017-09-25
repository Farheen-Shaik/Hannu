package karishma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class New {

	@Test
	public void doTest( ) throws IOException, InterruptedException
	{
		//input file
		File f1=new File("C:\\karishma\\files\\note.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		//output file
		File f2=new File("C:\\karishma\\files\\result.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		String l=br.readLine();
		while(l!=null)
		{
			String p[]=l.split(",");
			System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://124.123.41.5:8081/bamsa/login");
			//maximize window
			//driver.manage().window().maximize();
			Thread.sleep(5000);
			//do login
			driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys(p[0]);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys(p[2]);
			driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
			//Validate uid nd pwd
			if(p[1].equals("valid") && p[3].equals("valid") && driver.findElement(By.xpath("//*[@id='dashboard']/a")).isDisplayed())
			{
				bw.write("login credentials are valid");
				bw.newLine();
			}
			else if(p[1].equals("valid") && p[3].equals("invalid") && driver.findElement(By.xpath("//*[@class='form']/h5[1]")).isDisplayed())
			{
			    bw.write("password is invalid");
			    bw.newLine();
			}
			else if(p[1].equals("invalid") && p[3].equals("valid") && driver.findElement(By.xpath("//*[@class='form']/h5[1]")).isDisplayed())
			{
				bw.write("userid is invalid");
				bw.newLine();
			}
			else if(p[1].equals("valid") && p[3].equals("invalid") && ExpectedConditions.alertIsPresent()!=null)
			{
				bw.write("password is blank");
				bw.newLine();
			}
			else if(p[1].equals("invalid") && p[3].equals("valid") && ExpectedConditions.alertIsPresent()!=null)
			{
				bw.write("userid is blank");
			}
			else
			{
				bw.write("Test failed");
			}
			//to get next line
			l=br.readLine();
			driver.close();
		}
		bw.close();
		br.close();
		fw.close();
		fr.close();

		
		
		
		
	}

}
