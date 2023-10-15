package day07.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoveDupbyHash {
	@Test
	public void addTasksTset() {
		ArrayList<Integer> Array = new ArrayList<>();
		 Array.add(10);
		   Array.add(36);
		   Array.add(36);
		   Array.add(10);
		   Array.add(40);
		   Array.add(40);
		Assertions.assertEquals(Array,RemoveDuplicateByHash.createList());
	}
	@Test
	public void viewTasksTset() {
		ArrayList<Integer> Array1 = new ArrayList<>();
		   Array1.add(10);
		   Array1.add(36);
		   Array1.add(10); 
		   TreeSetDemo.createTreeSet(Array1);
		Assertions.assertTrue(TreeSetDemo.duplicatesRemoved());
	}
	@Test
	public void viewout(){
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(10);
        arr2.add(20);
        arr2.add(30);
        TreeSetDemo.createTreeSet(arr2);
        // Call the method that prints the elements
        TreeSetDemo.duplicatesRemoved();
        // Get the printed output from System.out redirection
        String printedOutput = outputStream.toString();
        // Ensure that the printed output matches the expected output
        assertEquals("10\n20\n30\n", printedOutput);
	}
}
