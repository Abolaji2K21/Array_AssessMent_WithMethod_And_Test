import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	
	public class LargestNumberInArray_sTest{
	@Test

		public void testToSeeIfThisWorks(){
		
		LargestNumberInArray_s input = new LargestNumberInArray_s();
		
		int[] array = {30, 45, 67, 98, 57, 42};
			
		int expected = 98;

		assertEquals(expected, input.LargestNumberIn_Array(int[] array));
		
		
		}	



	}