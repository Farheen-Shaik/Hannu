package karishma;

public class Star1 {

	
	public static void main(String[] args) 
	{
		for(int i=5;i>=4;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			for(int k=1;k<i;k++)
			{
				System.out.println("  "+"*");
			}
			
		}
		
		
	}

}
