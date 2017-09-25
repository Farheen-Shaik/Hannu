package karishma;

import org.testng.annotations.Test;

public class AllTests {
  @Test(priority=2)
  public void m1()  
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
  @Test(priority=1)
  public void m2()
  {
	  for(int i=1;i<6;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
				System.out.println();
			
		}
  }
		
}
