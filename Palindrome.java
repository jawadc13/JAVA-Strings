import java.util.Scanner;
import java.lang.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner readsen = new Scanner(System.in);
		System.out.println("Please type in your sentence to detect palindromes: ");
		String input = readsen.nextLine();
		
		//System.out.println("This is what you've typed: " + input);
		
		
		StringBuilder str = new StringBuilder(input);
		StringBuilder reverse = str.reverse();
		
		
		//System.out.println("What you written in reverse: " + reverse);
		
		String firstmodified = input;
		firstmodified = firstmodified.replaceAll("[^a-zA-Z]","");
		
		
		String lastmodified = reverse.toString();
		lastmodified = lastmodified.replaceAll("[^a-zA-Z]","");
		
		int lettercount = 0;
		
		for(int i = 0; i < firstmodified.length(); i++)
		{
			char letter1 = firstmodified.charAt(i);
			char letter2 = lastmodified.charAt(i);
			
			if(letter1 != letter2)
			{
				break;
				
			}
			else
			{
				lettercount++;
			}
		}
		
		if(lettercount == firstmodified.length())
		{
			System.out.println("Your sentence is a Palindrome!(ignoring special characters and spaces~)");
		}
		else
		{
			System.out.println("Your sentence is NOT a Palindrome!");
		}
	}

}
