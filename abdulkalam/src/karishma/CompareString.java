package karishma;

public class CompareString {

	
	public static void main(String[] args) 
	{
		String s1="karishma";
		String s2="Karishma";
		if(s1.equals(s2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
		
	}

}
