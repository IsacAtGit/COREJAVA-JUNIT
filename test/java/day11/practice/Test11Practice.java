package day11.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test11Practice{

	@Test
	public void testValidTask() throws DAOException {
		Task task1 = new Task("Learn java", "Completed");
		Assertions.assertTrue(TaskDo.createTask(task1));

	}

	@Test
	public void testInValidTask() {

		try {
			Task task1 = null;
			TaskDo.createTask(task1);
		}

		catch (DAOException ex) {
			Assertions.assertEquals("Task object cannot be null", ex.getMessage());
		}
	}

}
