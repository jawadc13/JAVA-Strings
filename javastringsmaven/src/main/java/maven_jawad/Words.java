package maven_jawad;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner readsen = new Scanner(System.in);
		System.out.println("Please type in your sentence to detect how many words there are: ");
		String input = readsen.nextLine();
		
		System.out.println("This is what you've typed: " + input);
		
		StringTokenizer tokens = new StringTokenizer(input);
		System.out.println("Number of words: " + tokens.countTokens());
		
	}
	
	
	public static int wordcheck(String input){
		
		
		StringTokenizer tokens = new StringTokenizer(input);
		
			return tokens.countTokens();
	}

}



