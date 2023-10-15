package day08.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHashMap1 {
   @Test 
   public void testadd() {
	   String [] arr= {"isac","isac","isac","deva","deva","abishek"};
		
		Assertions.assertTrue(HashWorks.getarr(arr));
   }
   @Test
   public void testaddnull() {
		try {
			HashWorks.getarr(null);
			Assertions.fail();
		}
		catch(Exception e) {
			Assertions.assertEquals(e.getMessage(), "Array Cant Be Null");
		}
   }
   @Test
   public void testview() {
		
		Assertions.assertTrue(HashWorks.viewMap());
   }
}
