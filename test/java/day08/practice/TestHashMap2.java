package day08.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHashMap2 {
	@Test
   public void testadd() {
	   Assertions.assertTrue(Holdmethods.addMethods());
   }
	
	@Test
	   public void testview() {
		   Assertions.assertTrue(Holdmethods.View());
	   }
}
