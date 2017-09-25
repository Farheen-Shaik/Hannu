package nageshwar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Forloop {

	
	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\karishma\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		//launch browser
		WebDriver driver=new FirefoxDriver();
		//launch site
		driver.get("http://124.123.41.5:8081/bamsa/");
		//clcik on dev nd test deparrt
		driver.findElement(By.xpath("//*[@class='fa fa-laptop']")).click();
		//do login
		driver.findElement(By.xpath("(//*[@name='username'])[2]")).sendKeys("PDT01");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("2862PDT01");
		driver.findElement(By.xpath("//*[@id='loginform']/button")).click();
		//do clock-in
		//driver.findElement(By.id("clockin")).click();
		//clcik my timesheet
		driver.findElement(By.xpath("//*[@id='clockdetails']/a")).click();
		//enter employee id nd click submit
		driver.findElement(By.id("name")).sendKeys("PDT25");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//search for particular date
		driver.findElement(By.xpath(".//*[@id='myTable_filter']/label/input")).sendKeys("2017-06-24");
		for(int i=1;i<=13;i++){
    	driver.findElement(By.xpath("//*[@id='mytask']/a")).click();

			//Lol bamsa = new Lol();
			System.out.println("Iteration no"+i);
			//bamsa.portfolioRenewalSearch(i,driver);
			driver.findElement(By.xpath("(//*[@id='opener'])[1]")).click();
    		//select project
    		Select s=new Select(driver.findElement(By.id("projectname")));
    		s.selectByVisibleText("BAMSA");
    		//Write in descriptn box
    		driver.findElement(By.id("taskd")).sendKeys("dgaetaujtykdyuujrtyrtutyjtyuiuy rteruyrtutykj ryrturyjtyi tuytjiytjed");
    		//deadline
    		driver.findElement(By.id("deadlineof")).click();
    		//select year
    		Select s1=new Select(driver.findElement(By.className("ui-datepicker-year")));
    		s1.selectByValue("2017");
    		//select mnth
    		Select s2=new Select(driver.findElement(By.className("ui-datepicker-month")));
    		s2.selectByVisibleText("Jul");
    		//pic a date
    		driver.findElement(By.linkText("31")).click();
    		//clcik submit
    		driver.findElement(By.xpath("//*[@onclick='assignTask()']")).click();
    		//clcik ok of succes msg
    		 //Alert alert = driver.switchTo().alert();
    	       
    	        //alert.accept();
    		Robot r=new Robot();
    		r.keyPress(KeyEvent.VK_ENTER);
    		r.keyRelease(KeyEvent.VK_ENTER);
		}
		}
		
		
		
		
	
	public void portfolioRenewalSearch(int portfolioId,WebDriver driver) throws Exception {

        try {
        	
    		
        	//click tasks
    		//clcik on java
    		driver.findElement(By.xpath("//*[@href='/bamsa/Newtask?sid="+portfolioId+"']/h2")).click();
    		//assign task to an employee
    		
    		
        } catch (AssertionError Ae) {
            Ae.printStackTrace();
        }
		
	}

}
