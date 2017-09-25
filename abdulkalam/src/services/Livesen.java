package services;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import services.Live_Sensex_Bse_IndexStub.ArrayOfString;
import services.Live_Sensex_Bse_IndexStub.GetLiveSensex;
import services.Live_Sensex_Bse_IndexStub.GetLiveSensexResponse;

public class Livesen {

	
	public static void main(String[] args) throws RemoteException
	{
		//create object to stub class
		Live_Sensex_Bse_IndexStub driver=new Live_Sensex_Bse_IndexStub("http://freewebservicesx.com/live-sensex-bse-index.asmx?WSDL");
		//create object to request and set inputs
		GetLiveSensex req=new GetLiveSensex();
		req.setUserName("mindq@gmail.com");
		req.setPassword("mindq");
		//create object to response and get output
		GetLiveSensexResponse res=driver.getLiveSensex(req);
		ArrayOfString a=res.getGetLiveSensexResult();
		String b[]=a.localString;
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
