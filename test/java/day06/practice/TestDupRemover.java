package day06.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDupRemover {
	viewTask obj = new viewTask();

	@Test
	public void addTasksTset() {
		Assertions.assertTrue(obj.addTasks("study"));
	}
	@Test
	public void StartproTset() {
		Assertions.assertTrue(obj.Startpro("Study"));
	}
	@Test
	public void viewTasksTset() {
		obj.addTasks("study");
		obj.addTasks("study");
		obj.addTasks("study");
		Assertions.assertTrue(obj.viewTasks()); 
	}

	@Test 
	public void addTasksEmpty() {
		try {
		obj.addTasks("");
	     } 
		catch(Exception e){
		Assertions.assertEquals(e.getMessage(), "TaskName can't be null");
	     }
	} 
//	@Test
//	public void addProrityTest() {
//		Assertions.assertTrue(Tasks.priority.add("High"));
//	    }
//	@Test
//	public void DisplayTest() {
//		Assertions.assertTrue(Tasks.displayTasks());
//	    }

}
