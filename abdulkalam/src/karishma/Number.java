package karishma;

import java.io.Reader;

public class Number {

	
	/*public static void main(String[] args) 
	{
		int n=456;
		System.out.println(n);
		int r=0; 

		while(n!=0) { 
		r = r*10 + n%10; 
		n = n/10; 
		} 

		System.out.println(r);
		
	}*/
	
public static void main(String[] args)
{
    int n[]={1,2,3,4,5,6};
    for(int j=0;j<n.length;j++)
    {
    System.out.print(n[j]);
    }
    System.out.println();
    for(int i=n.length-1;i>=0;i--)
    {
    	System.out.print(n[i]);
    }
   
    
    
    
	
}
}
