package karishma;

public class Word
{

	
	public static void main(String [] args) 
	{
		String s="hi how are you";
		System.out.println(s);
		String s1[]=s.split(" ");
		char[] c=null;
		for(int i=0;i<s1.length;i++)
		{
			c=s1[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				
				System.out.print(c[j]);
				
			}
			System.out.print(" ");
			
			
		}
		
	}
	 
	

}
