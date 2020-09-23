package maven_jawad;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConsonantsTest {

	public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("This is Test Case 1");
    }
	
	
	
	
	@Test
	public void testConsonants() {
		
		int result;
		result = Consonants.consonantcheck("hello this is a test");

		assertEquals(10, result);
		System.out.println("Test 'basic consonant test' has passed");
	}

	@Test
	public void testConsonantsCAPS() {
		
		int result;
		result = Consonants.consonantcheck("jUnIt TeStInG IS CONFUSING ME");
		
		assertEquals(0, result);
		System.out.println("Test 'LETTERS IN CAPS' has passed");
	}
	
	
	@Test
	public void testNoConsonants() {
		
		int result;
		result = Consonants.consonantcheck("aeiou aeiou");
		
		assertEquals(0, result);
		System.out.println("Test 'No Consonants' has passed");
	}
	
	
}
