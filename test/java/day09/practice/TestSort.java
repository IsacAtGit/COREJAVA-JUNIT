package day09.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSort {
	@Test
    public void testadd() {
    	Assertions.assertTrue(SortList.getElements());
    }
	@Test
    public void testView() {
    	Assertions.assertTrue(SortList.viewsortedElements());
    }
}
