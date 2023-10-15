package day07.practice;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoveDup {
	LocalDate input= LocalDate.of(2022,10,9);
	   Task task1 = new Task(1, "Study", input);
	   TreeSetDemo2 demo = new TreeSetDemo2();
	@Test
   public void createarr() {
	   LocalDate input= LocalDate.of(2022,10,9);
	   Task task1 = new Task(1, "Study", input);
   }
	@Test
	public void getId() {
		Assertions.assertEquals(task1.getId(),1);
	}
	@Test
	public void getName() {
		Assertions.assertEquals(task1.getName(),"Study");
	}
    @Test
	public void getDeadline() {
    	Assertions.assertEquals(task1.getDeadline(),input);
	}
    @Test
    public void testAdd() {
		Assertions.assertTrue(TreeSetDemo2.add(task1));
	}
    
    @Test
    public void print() {
		Assertions.assertTrue(TreeSetDemo2.printTasks());
	}
}
