package services;

import org.apache.axis2.AxisFault;

import services.TempConvertStub.FahrenheitToCelsius;
import services.TempConvertStub.FahrenheitToCelsiusResponse;

public class Tempc {

	
	public static void main(String[] args) throws AxisFault
	{
		//create object to stub class
		TempConvertStub driver=new TempConvertStub("https://www.w3schools.com/xml/tempconvert.asmx?WSDL");
		//create object to request and set inputs
		FahrenheitToCelsius req=new FahrenheitToCelsius();
		req.setFahrenheit("45");
		//create object to response to get outputs
		FahrenheitToCelsiusResponse res=new FahrenheitToCelsiusResponse();
		System.out.println(res.getFahrenheitToCelsiusResult());
		
		
		
	}

}
