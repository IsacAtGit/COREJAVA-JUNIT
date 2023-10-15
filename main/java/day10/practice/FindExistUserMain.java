package day10.practice;

public class FindExistUserMain {
	
	public static void main(String[] args) throws UserAlreadyExistsException {
		User user1 = new User(1,"isac","deva@fssa.fresworks.com");
		User user2 = new User(2,"isacc","deeva@fssa.fresworks.com");
		try {
			FindExistingUser.register(user1);
			FindExistingUser.register(user2);
		} catch (UserAlreadyExistsException e) {
			throw new UserAlreadyExistsException(e.getMessage());
		}
	}
}