package karishma;

public class Test3 extends  Array {

	
	public static void main(String[] args) 
	{
		String s="hi how are you";
		System.out.println(s);
		String[] s1=s.split(" ");
		char[] c=null;
		for(int i=0;i<s1.length;i++)
		{
		System.out.println(s1[i]);
		c=s1[i].toCharArray();
		
		for(int k=0;k<s1.length;k++)
		{
		System.out.println(s1[i]);
		c=s1[i].toCharArray();
		
		for(int j=c.length-1;j>=0;j--)
		{
			
			System.out.print(c[j]);
			
			
		}
		System.out.println();
		
		}
		Array a=new Array();
		a.f();
		
		}
	
		
	
	}

}
