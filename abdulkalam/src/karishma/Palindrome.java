package karishma;

public class Palindrome 
{

	
	public static void main(String[] args) 
	{
		int n=121;
		int f=n;
		System.out.println(n);
		int r=0; 

		while(n!=0) 
		{ 
		r = r*10 + n%10; 
		n = n/10; 
		} 
		System.out.println(r);
		if(f!=r)
		{
			System.out.println("given number is not a palindrome");
		}
		else
		{
			System.out.println("given number is a palindrome");
		}
		
	}

}
