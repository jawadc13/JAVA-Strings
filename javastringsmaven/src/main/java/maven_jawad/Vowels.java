package maven_jawad;
import java.util.*;


public class Vowels {

	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int vowelsct = 0;
		char[] voweltype = {'a','e','i','o','u','A','E','I','O','U'};
		
		Scanner readsen = new Scanner(System.in);
		System.out.println("Please type in your sentence to detect vowels: ");
		String input = readsen.nextLine();
		
		System.out.println("This is what you've typed: " + input);
		
		for(int i = 0; i< input.length(); i++)
		{
			for(int j = 0; j < 10; j++)
			{
				char letter = input.charAt(i);
				
				if(letter == voweltype[j])
				{
					vowelsct++;
					continue;
				}
			}
		}
		
		System.out.println("Number of vowels: " + vowelsct);
		
	}



public static int vowelcheck(String input){
	int results;
	int vowelsct = 0;
	
	char[] voweltype = {'a','e','i','o','u','A','E','I','O','U'};
	for(int i = 0; i< input.length(); i++)
	{
		for(int j = 0; j < 10; j++)
		{
			char letter = input.charAt(i);
			
			
			if(letter == voweltype[j])
			{
				vowelsct++;
				continue;
			}
		}
	}
	
		return vowelsct;
}

}
