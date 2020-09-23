package maven_jawad;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("This is Test Case 1");
    }
	
	
	
	
	@Test
	public void testPalindrome() {
		
		int result;
		result = Palindrome.palindromecheck("how woh");

		assertEquals(1, result);
		System.out.println("Test 'basic palindrome' has passed");
	}

	@Test
	public void testPalindromeCAPS() {
		
		int result;
		result = Palindrome.palindromecheck("HOW WOH");
		
		assertEquals(1, result);
		System.out.println("Test 'LETTERS IN CAPS' has passed");
	}
	
	
	@Test
	public void testNoPalindrome() {
		
		int result;
		result = Palindrome.palindromecheck("");
		
		assertEquals(0, result);
		System.out.println("Test 'No palindromes' has passed");
	}
	
	
}