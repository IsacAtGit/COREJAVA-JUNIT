package day09.practice;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPractice3 {
	int id=6;
	Tasks obj=new Tasks();
	LocalDate inputdate=LocalDate.of(2023,2,22);
	Tasks obj2=new Tasks(1,"play",inputdate,5);
	
	 Tasks acct1 = new Tasks(1, "play", inputdate,5); 
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
    public void testsetPrority() {
    	obj.setPrority(5); 
    	Assertions.assertEquals(5, obj.getPriority());
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
		LocalDate date=LocalDate.of(2023,2,22);
		Tasks obj3=new Tasks(1,"play",date,5);
    	Assertions.assertEquals(0, obj3.compareTo(acct1));
    }
	
	@Test
    public void testCompare1minus() { 
		LocalDate date=LocalDate.of(2023,2,22);
		Tasks obj3=new Tasks(1,"play",date,6);
    	Assertions.assertEquals(-1, obj3.compareTo(acct1));
    }
	
	@Test
    public void testCompare1plus() { 
		LocalDate date=LocalDate.of(2023,2,22);
		Tasks obj3=new Tasks(1,"play",date,4);
    	Assertions.assertEquals(1, obj3.compareTo(acct1));
    }
	 
	@Test
    public void testCompare2() { 
		LocalDate date=LocalDate.of(2023,2,23);
		Tasks obj3=new Tasks(1,"play",date,5);
    	Assertions.assertEquals(1, obj3.compareTo(acct1));
    }
	@Test 
    public void testCompare3() { 
		LocalDate date=LocalDate.of(2023,2,21);
		Tasks obj3=new Tasks(1,"play",date,5);
    	Assertions.assertEquals(-1, obj3.compareTo(acct1));
    }
	
	@Test
    public void testtostring() { 
    	
    	Assertions.assertEquals("Tasks [id" + obj2.getId() + ", name=" + obj2.getName() + ", date=" + obj2.getDate() + "]", obj2.toString());
    }
	
}
