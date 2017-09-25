package advisory;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecretaryPayment {

	
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://124.123.41.5:8081/advisory/");
		//maximize window
		driver.manage().window().maximize();
		//do login
		driver.findElement(By.xpath("//*[@name='villano']")).sendKeys("501");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		Thread.sleep(5000);
		//click on payment
		driver.findElement(By.xpath("//*[@href='/advisory/spayment']")).click();
		Thread.sleep(3000);
		//fill fields
		driver.findElement(By.xpath("//*[@name='pname']")).sendKeys("shahrukh");
		driver.findElement(By.xpath("//*[@name='pemail']")).sendKeys("shahrukh@gmail.com");
		driver.findElement(By.xpath("//*[@name='pphoneno']")).sendKeys("8756436789");
		driver.findElement(By.xpath("//*[@name='pamount']")).sendKeys("5000");
		Select s=new Select(driver.findElement(By.xpath("//*[@name='ppaymentmode']")));
		s.selectByVisibleText("Wallets");
		driver.findElement(By.xpath("//*[@name='pmessage']")).sendKeys("ashdgwqyg jashgd7w nsgdqwd ahasashwqd bhudhqw");
		driver.findElement(By.xpath(".//*[@id='contact']/fieldset[7]/a")).click();
		//MOVE ONE WINDOW TO OTHER WINDOW	
		ArrayList<String> x=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(x.get(1));
		//fill fields
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("hheww shdsid qwhed8w bdiuwh");
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("5000");
		//click pay
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//fill oder fields
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("shahrukh");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("shahrukh@gmail.com");
		driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("8756436789");
		//click next
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		//click on debit card
        driver.findElement(By.xpath("(//*[@class='btn btn-block push--bottom text-left'])[1]")).click();
		Thread.sleep(5000);
		//click change
		driver.findElement(By.xpath("(//*[@class='right'])[2]")).click();
		//click on debit card
        driver.findElement(By.xpath("(//*[@class='btn btn-block push--bottom text-left'])[1]")).click();
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame(0);
		//fill fields
		driver.findElement(By.xpath("//*[@name='cardNumberMask']")).sendKeys("6011291182019754");
		driver.findElement(By.xpath("//*[@class='name_on_card']")).sendKeys("karish");
		driver.findElement(By.xpath("//*[@class='card_exp_month']")).sendKeys("12");
		driver.findElement(By.xpath("//*[@class='card_exp_year']")).sendKeys("22");
		driver.findElement(By.name("cardSecurityCode")).sendKeys("300");
		//click checkout
		driver.findElement(By.xpath("//*[@id='common_pay_btn']")).click();
		Thread.sleep(5000);
		//back to page
		driver.switchTo().defaultContent();
		//click change
		driver.findElement(By.xpath("(//*[@class='right'])[2]")).click();
		//click on credit card
        driver.findElement(By.xpath("(//*[@class='btn btn-block push--bottom text-left'])[2]")).click();
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame(0);
		//fill fields
		driver.findElement(By.xpath("//*[@name='cardNumberMask']")).sendKeys("6011291182019754");
		driver.findElement(By.xpath("//*[@class='name_on_card']")).sendKeys("karish");
		driver.findElement(By.xpath("//*[@class='card_exp_month']")).sendKeys("12");
		driver.findElement(By.xpath("//*[@class='card_exp_year']")).sendKeys("22");
		driver.findElement(By.name("cardSecurityCode")).sendKeys("300");
		//click checkout
		driver.findElement(By.xpath("//*[@id='common_pay_btn']")).click();
		Thread.sleep(5000);
		//back to page
		driver.switchTo().defaultContent();
		//click change
		driver.findElement(By.xpath("(//*[@class='right'])[2]")).click();
		//click on netbanking
		driver.findElement(By.xpath("(//*[@class='btn btn-block push--bottom text-left'])[3]")).click();
		Thread.sleep(5000);
		//back to page
		driver.switchTo().defaultContent();
		//click change
		driver.findElement(By.xpath("(//*[@class='right'])[2]")).click();
		//click on emi
		driver.findElement(By.xpath("(//*[@class='btn btn-block push--bottom text-left'])[4]")).click();
		Thread.sleep(5000);
		//back to page
		driver.switchTo().defaultContent();
		//click change
		driver.findElement(By.xpath("(//*[@class='right'])[2]")).click();
		//click on wallets
		driver.findElement(By.xpath("(//*[@class='btn btn-block push--bottom text-left'])[5]")).click();
		Thread.sleep(5000);
		//back to page
		driver.switchTo().defaultContent();
		//click change
		driver.findElement(By.xpath("(//*[@class='right'])[2]")).click();
		//click on upi
		driver.findElement(By.xpath("(//*[@class='btn btn-block push--bottom text-left'])[6]")).click();
		Thread.sleep(5000);
		//back to page
		driver.switchTo().defaultContent();
		//click change
		driver.findElement(By.xpath("(//*[@class='right'])[2]")).click();
		
		
		
	}

}
