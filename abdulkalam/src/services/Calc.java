package services;

import java.rmi.RemoteException;

//import org.apache.axis2.AxisFault;

import services.CalculatorStub.Add;
import services.CalculatorStub.AddResponse;
import services.CalculatorStub.Divide;
import services.CalculatorStub.DivideResponse;
import services.CalculatorStub.Multiply;
import services.CalculatorStub.MultiplyResponse;
import services.CalculatorStub.Subtract;
import services.CalculatorStub.SubtractResponse;

public class Calc {

	
	public static void main(String[] args) throws RemoteException 
	{
		//create object to stubclass
		CalculatorStub driver=new CalculatorStub("http://www.dneonline.com/calculator.asmx?WSDL");
		//create object to request to set inputs
		Add a=new Add();
		a.setIntA(70);
		a.setIntB(140);
		//create object to response to get output
		AddResponse ar=driver.add(a);
		System.out.println(ar.getAddResult());
		//create object to request to set inputs
		Subtract s=new Subtract();
		s.setIntA(70);
		s.setIntB(140);
		//create object to response to get output
		SubtractResponse sr=driver.subtract(s);
		System.out.println(sr.getSubtractResult());
		//create object to request to set inputs
		Multiply m=new Multiply();
		m.setIntA(70);
		m.setIntB(140);
		//create object to response to get output
		MultiplyResponse mr=driver.multiply(m);
		System.out.println(mr.getMultiplyResult());
		//create object to request to set inputs
		Divide d=new Divide();
		d.setIntA(70);
		d.setIntB(140);
		//create object to response to get output
		DivideResponse dr=driver.divide(d);
		System.out.println(dr.getDivideResult());
			
		
	}

}
