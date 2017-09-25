package services;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import services.Live_Sensex_Bse_IndexStub.ArrayOfString;
import services.Live_Sensex_Bse_IndexStub.GetLiveSensex;
import services.Live_Sensex_Bse_IndexStub.GetLiveSensexResponse;

public class EndToEnd {

	
	public static void main(String[] args) throws RemoteException, InterruptedException 
	{
		//get sensex value from site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.bseindia.com/");
		Thread.sleep(5000);
		String siteval=driver.findElement(By.xpath("//*[@class='newsensexvalue']")).getText();
		siteval=siteval.replace(","," ");
		System.out.println(siteval);
		driver.close();
		//get sensex value from service
		//create object to stub class
		Live_Sensex_Bse_IndexStub driver2=new Live_Sensex_Bse_IndexStub("http://freewebservicesx.com/live-sensex-bse-index.asmx?WSDL");
		//create object to request and set inputs
		GetLiveSensex req=new GetLiveSensex();
		req.setUserName("mindq@gmail.com");
		req.setPassword("mindq");
		//create object to response and get output
		GetLiveSensexResponse res=driver2.getLiveSensex(req);
		ArrayOfString a=res.getGetLiveSensexResult();
		String b[]=a.localString;
		String serviceval=b[0];
		System.out.println(serviceval);
		//End-to-end testing
		if(siteval.equals(serviceval))
		{
			System.out.println("Intersystem test passed");
		}
		else
		{
			System.out.println("Intersystem test failed");
		}

	}

}
