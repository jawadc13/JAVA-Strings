package maven_jawad;

import static org.junit.Assert.*;

import org.junit.Test;

public class VowelsTest {

	
	public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("This is Test Case 1");
    }
	
	
	
	
	@Test
	public void testVowels() {
		
		int result;
		result = Vowels.vowelcheck("cat");

		assertEquals(1, result);
		System.out.println("Test 'cat' has passed");
	}

	@Test
	public void testVowelsCAPS() {
		
		int result;
		result = Vowels.vowelcheck("JUNIT TESTING IS CONFUSING ME");
		
		assertEquals(9, result);
		System.out.println("Test 'LETTERS IN CAPS' has passed");
	}
	
	
	@Test
	public void testNoVowels() {
		
		int result;
		result = Vowels.vowelcheck("bcg wrt pwd qnh");
		
		assertEquals(0, result);
		System.out.println("Test 'No Vowels' has passed");
	}
	
	
}
