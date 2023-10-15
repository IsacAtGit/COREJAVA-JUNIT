package day10.practice;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPractice2 {
	User u1 = new User(1, "isac", "isac@gmail.com");

	@Test
	public void testadd() throws UserAlreadyExistsException {

		Assertions.assertTrue(FindExistingUser.register(u1));

	}
	@Test
	public void testhashid()  {
		System.out.println(u1.hashCode());
		Assertions.assertEquals(32,u1.hashCode());
    
	}
	
	@Test
	public void testadddup() throws UserAlreadyExistsException {
     try {
    	 FindExistingUser.register(u1);
 		FindExistingUser.register(u1); 
     }
     catch(UserAlreadyExistsException e) {
    	 Assertions.assertEquals("User already exist", e.getMessage());
     }
		
	}
}
