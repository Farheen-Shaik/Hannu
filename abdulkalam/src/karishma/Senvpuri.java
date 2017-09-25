package karishma;

import java.util.Scanner;

public class Senvpuri {

	
	public static void main(String[] args)
	{
		//get data from keyboard
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a word");	
	    String s=sc.nextLine();
	    //read those data into this class
		StringBuffer buffer = new StringBuffer(s);
		//reverse the given data
		buffer.reverse();
	    //print the reversed data
	    System.out.println(buffer);
		   
		
	
	}
	

}





















































