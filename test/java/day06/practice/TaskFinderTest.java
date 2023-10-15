package day06.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TaskFinderTest { 
	
		@Test
		public void testAddTask() {
		Assertions.assertTrue(finder.taskadd("Study"));
	}
		
		@Test
	public void testValidTask() {
			finder.taskadd("Study");
		Assertions.assertTrue(finder.findTaskByName("study"));
	}
		@Test
		public void testInValidaddTask() {
			try {
				finder.taskadd("");
			}
			catch(Exception e) {
				Assertions.assertEquals("TaskName cant be null",e.getMessage());
			}
				
			
		}
		@Test
		public void testInValidTask() {
			  
		Assertions.assertFalse(finder.findTaskByName("note"));
	}
}
