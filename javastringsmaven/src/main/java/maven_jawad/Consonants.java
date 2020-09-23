package maven_jawad;
import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Not gonna lie this one gave me a hard time haha!
		
		int consct = 0;
		char[] constype = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z','B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
		
		Scanner readsen = new Scanner(System.in);
		System.out.println("Please type in your sentence to detect consonants: ");
		String input = readsen.nextLine();
		
		System.out.println("This is what you've typed: " + input);
		//char[] starword =;
		String starword = "";
		int[] array = new int[input.length() + 1];

		
		for(int i = 0; i< input.length(); i++)
		{
			for(int j = 0; j < 21; j++)
			{
				char letter = input.charAt(i);
				
				if(letter == constype[j])
				{
					consct++;
					array[i] = 1;
					//starword = starword + "*";
				 break;
					
				}
				
			}
		}
		
		for(int k = 0; k< input.length(); k++)
		{
			if(array[k] ==  1)
			{
				starword = starword + "*";
			}
			else
			{
				starword = starword + input.charAt(k);
			}
		}
		
		System.out.println("Number of consonants: " + consct);
		
		System.out.println("Consonants starred out: " + starword);
		
	}
	
	public static int consonantcheck(String input)
	{
		int consct = 0;
		char[] constype = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z','B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
		String starword = "";
		int[] array = new int[input.length() + 1];
		
		
		for(int i = 0; i< input.length(); i++)
		{
			for(int j = 0; j < 21; j++)
			{
				char letter = input.charAt(i);
				
				if(letter == constype[j])
				{
					consct++;
					array[i] = 1;
					//starword = starword + "*";
				 break;
					
				}
				
			}
		}
		
		for(int k = 0; k< input.length(); k++)
		{
			if(array[k] ==  1)
			{
				starword = starword + "*";
			}
			else
			{
				starword = starword + input.charAt(k);
			}
		}
		return consct;
		
		
	}
	

}
