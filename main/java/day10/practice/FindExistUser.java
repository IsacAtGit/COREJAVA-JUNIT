package day10.practice;

import java.util.ArrayList;
import java.util.Objects;

class User {
	private int id;
	private String name;
	private String emailId;
	public User(int id, String name, String email){
		this.id = id;
		this.name = name;
		this.emailId = email;
	}
	
    // Override the equals method to compare the fields of User objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        if(emailId==user.emailId) 
        	return true;
            return false;
    }

    // Don't forget to override hashCode whenever you override equals
    @Override
    public int hashCode() {
        return Objects.hash(this.emailId);
    }
} 


class UserAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserAlreadyExistsException(String message) {
		super(message);
	}
}

class FindExistingUser{
	public static ArrayList<User> userarr = new ArrayList<User>();

	public static boolean register(User user) throws UserAlreadyExistsException {
		if (userarr.contains(user)) {
			throw new UserAlreadyExistsException("User already exist");
		}
		userarr.add(user);
		System.out.println("added");
		return true;
	} 

}







