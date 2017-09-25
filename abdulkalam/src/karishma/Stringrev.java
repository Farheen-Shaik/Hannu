package karishma;



//import java.util.Scanner;

public class Stringrev 
{
   public static void reverseStringByWords(String string) 
	{
	    StringBuilder stringBuilder = new StringBuilder();
	    String[] words = string.split(" ");

	    for (int j = words.length-1; j >= 0; j--)
	    {
	        stringBuilder.append(words[j]).append(' ');
	    }
	    System.out.println("Reverse words: " + stringBuilder);
	}
	public static void main(String[] args)
	{
		Stringrev s=new Stringrev();
	    s.reverseStringByWords(null);
		
	}
}
