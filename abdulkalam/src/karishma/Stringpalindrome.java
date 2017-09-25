package karishma;

public class Stringpalindrome 
{

	
	public static void main(String[] args)
	{
		
		 m();
		
	}	
		
		
		
		
		public static void m()
		{
			
		
		String s="madam",rev="";
		char[] ch=s.toCharArray();
			System.out.println(ch);
			for(int j=ch.length-1;j>=0;j--)
			{
				//System.out.print(ch[j]);
				rev=rev+s.charAt(j);
			
			}
			System.out.println(rev);
			 //String rev=ch;
			if(s.equals(rev))
			{
				System.out.println("given string is palindrome");
			}
			else
			{
				System.out.println("given string is not a palindrome");
			}
		
	}
		
}


