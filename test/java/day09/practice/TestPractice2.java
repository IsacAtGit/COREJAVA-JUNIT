package day09.practice;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPractice2 {
	int id=6; 
	Task obj=new Task();
	LocalDate inputdate=LocalDate.of(2023,2,22);
	Task obj2=new Task(1,"play",inputdate);
	
	 Task acct1 = new Task(1, "play", inputdate);
	@Test 
    public void testsetid() {
    	obj.setId(6);
    	Assertions.assertEquals(id, obj.getId());
    }
	@Test
    public void testsetname() {
    	obj.setName("Study"); 
    	Assertions.assertEquals("Study", obj.getName());
    }
	@Test
    public void testsetdate() {
		LocalDate input= LocalDate.of(2022,12,2);
    	obj.setDate(input);
    	Assertions.assertEquals(input, obj.getDate());
    }
	@Test
    public void testConstructor() {
    	Assertions.assertEquals(inputdate, acct1.getDate());
    	Assertions.assertEquals(1, acct1.getId());
    	Assertions.assertEquals("play", acct1.getName());
    }
	
	@Test
    public void testCompare1() { 
    	
    	Assertions.assertEquals(0, obj2.compareTo(acct1));
    }
	 
	@Test
    public void testCompare2() { 
		LocalDate date=LocalDate.of(2023,2,23);
		Task obj3=new Task(1,"play",date);
    	Assertions.assertEquals(-1, obj3.compareTo(acct1));
    }
	@Test 
    public void testCompare3() { 
		LocalDate date=LocalDate.of(2023,2,21);
		Task obj3=new Task(1,"play",date);
    	Assertions.assertEquals(1, obj3.compareTo(acct1));
    }
	
	@Test
    public void testtostring() { 
    	
    	Assertions.assertEquals("Account [id" + obj2.getId() + ", name=" + obj2.getName() + ", date=" + obj2.getDate() + "]", obj2.toString());
    }
	
}
