package maven_jawad;

import static org.junit.Assert.*;

import org.junit.Test;

public class LastLetterCountTest {

	public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("This is Test Case 1");
    }
	
	
	
	
	@Test
	public void testLastLetterCount() {
		
		int result;
		result = LastLetterCount.lastlettercountcheck("hello this is A TESTY");

		assertEquals(4, result);
		System.out.println("Test 'Basic LastLetterCount' has passed");
	}

	@Test
	public void testLastLetterCountCAPS() {
		
		int result;
		result = LastLetterCount.lastlettercountcheck("JUNIT TESTING IS CONFUSING ME");
		
		assertEquals(3, result);
		System.out.println("Test 'LETTERS IN CAPS' has passed");
	}
	
	
	@Test
	public void testNoLastLetterCount() {
		
		int result;
		result = LastLetterCount.lastlettercountcheck("bcg wrt pwd qnh");
		
		assertEquals(0, result);
		System.out.println("Test 'No LastLetterCount' has passed");
	}
	
	
}
