package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Hero {

	
	public static void main(String[] args) throws IOException 
	{
		//specify REST service Wadl with inputs
		URL u=new URL("http://www.herongyang.com/Service/Hello_REST.wadl");
		//connect to service
		HttpURLConnection con=(HttpURLConnection) u.openConnection();
		//get response from service
		InputStreamReader ir=new InputStreamReader(con.getInputStream());
		//store response in buffer
		BufferedReader br=new BufferedReader(ir);
		//display response line by line
		String output;
		while((output=br.readLine())!=null)
		{
			System.out.println(output);
		}
		//disconnect from service
		con.disconnect();
		
	}

}
