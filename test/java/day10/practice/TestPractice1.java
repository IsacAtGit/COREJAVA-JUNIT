package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPractice1 {
	@Test
	 void testIsValidEmail() throws InvalidEmailException {
		Assertions.assertTrue(EmailValidator.isValidEmail("isac@fssa.freshworks.com"));
	}
	@Test
	 void testInValidEmail() throws InvalidEmailException {
		try {
			EmailValidator.isValidEmail("freshworks.com");
		}catch(InvalidEmailException e) {
			Assertions.assertEquals("Invalid email format: "+EmailValidator.mail, e.getMessage());
		}
		
	}
	
}