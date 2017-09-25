package services;

import org.apache.axis2.AxisFault;

import services.GetGoldPriceStub.ArrayOfString;
import services.GetGoldPriceStub.GetCurrentGoldPrice;
import services.GetGoldPriceStub.GetCurrentGoldPriceResponse;

public class Goldrate {

	
	public static void main(String[] args) throws AxisFault 
	{
		//create object to stubclass
		GetGoldPriceStub driver=new GetGoldPriceStub("http://www.freewebservicesx.com/GetGoldPrice.asmx?WSDL");
		//create object to request to set inputs
		GetCurrentGoldPrice req=new GetCurrentGoldPrice();
		req.setUserName("");
		req.setPassword("");
		//create object to response and get output
		GetCurrentGoldPriceResponse res=new GetCurrentGoldPriceResponse();
		ArrayOfString a=res.getGetCurrentGoldPriceResult();
		String b[]=a.localString;
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
	}

}
