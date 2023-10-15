package day06.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTask {
	@Test
	public void addTasksTset() {
		Assertions.assertTrue(Tasks.tasks.add("isac"));
	    }
	@Test
	public void addTasksTest() {
		Assertions.assertTrue(Tasks.addTasks("Study"));
	    }
	@Test
	public void addTasksnull() { 
		try {
			Tasks.addTasks(""); 
			Assertions.fail("Failure");
		}
		catch(Exception e) {
			Assertions.assertEquals("Name should not be null or empty",e.getMessage());
		}
		
	    }


	@Test
	public void addProrityTest() {
		Assertions.assertTrue(Tasks.priority.add("High"));
	    }
	@Test
	public void addProrityTestMethod() {
		Assertions.assertTrue(Tasks.addProirty("High"));
	    }
	@Test
	public void addproritynull() {
		try {
			Tasks.addProirty("");
			Assertions.fail("Failure");
		}
		catch(Exception e) {
			Assertions.assertEquals("Prority should not be null or empty",e.getMessage());
		}
		
	    }
	@Test
	public void DisplayTest() {
		Assertions.assertTrue(Tasks.displayTasks());
	    }
	
	@Test
	public void getTaskTest() {
		Assertions.assertTrue(Tasks.getTask());
	    }
}
