package maven_jawad;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordsTest {
	
	public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("This is Test Case 1");
    }
	
	
	
	
	@Test
	public void testWords() {
		
		int result;
		result = Words.wordcheck("hello this should be 6 words");

		assertEquals(6, result);
		System.out.println("Test '6 words' has passed");
	}

	@Test
	public void testWordsCAPS() {
		
		int result;
		result = Words.wordcheck("JUNIT TESTING IS CONFUSING ME");
		
		assertEquals(5, result);
		System.out.println("Test 'LETTERS IN CAPS' has passed");
	}
	
	
	@Test
	public void testNoWords() {
		
		int result;
		result = Words.wordcheck("");
		
		assertEquals(0, result);
		System.out.println("Test 'No words' has passed");
	}
	
	
}