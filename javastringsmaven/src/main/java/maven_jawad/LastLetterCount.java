package maven_jawad;
import java.util.Scanner;

public class LastLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This one was also pretty difficult :O
		//This one took most of my day surprisingly and I may turn it in broken since its still giving me trouble at 2 AM
		
		int endings = 0;
		int endingy = 0;
		char[] keywords = {'S','s'};
		char[] keywordy = {'Y','y'};
		
		
		Scanner readsen = new Scanner(System.in);
		System.out.println("Please type in your sentence to detect the last letters of each word: ");
		String input = readsen.nextLine();
		
		System.out.println("This is what you've typed: " + input);
		input = input.toLowerCase();
		int[] arrays = new int[input.length() + 1];
		int[] arrayy = new int[input.length() + 1];
		String strarray[] = input.split(" ");
		
		
		for(int i = 0; i < input.length(); i++)
		{
			char letter = input.charAt(i);
			
			if(letter == 's' )
			{
				endings++;
				arrays[i] = 1;
				continue;
			}
			if(letter == 'y')
			{
				endingy++;
				arrayy[i] = 1;
				continue;
			}
		}
		
		
		
		
/*		for(int i = 0; i< input.length(); i++)
		{
			for(int j = 0; j < 4; j++)
			{
				char letter = input.charAt(i);
				
				if(letter == keywords[j])
				{
					char spacecheck = input.charAt(i+1);
					if(spacecheck )
					{
						endings++;
						array[i] = 1;
						continue;
					}
					{
						
					}
				}
			}
		}
*/		
		System.out.println("Number of last letters containing s: " + endings +"and last letters containing y: " + endingy);
		
	}
	public static int lastlettercountcheck(String input)
	{
		int endings = 0;
		int endingy = 0;
		char[] keywords = {'S','s'};
		char[] keywordy = {'Y','y'};
		
	input = input.toLowerCase();
	int[] arrays = new int[input.length() + 1];
	int[] arrayy = new int[input.length() + 1];
	String strarray[] = input.split(" ");
	
	
	for(int i = 0; i < input.length(); i++)
	{
		char letter = input.charAt(i);
		
		if(letter == 's' )
		{
			endings++;
			arrays[i] = 1;
			continue;
		}
		if(letter == 'y')
		{
			endingy++;
			arrayy[i] = 1;
			continue;
		}
	
		
	}
	
	int total = endings + endingy;
	
	return total;
	
	}
}
