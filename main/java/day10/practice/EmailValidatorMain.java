package day10.practice;

public class EmailValidatorMain { 
	public static void main(String[] args) {
		String email = "isacexample.com"; 
		try {
			if (EmailValidator.isValidEmail(email)) {
				System.out.println("Valid email: " + email);
			}
		} catch (InvalidEmailException e) {
		   
		  System.out.println(e.getMessage());
		}
	}
}
