package day03.practice;

public class User {

	private String name;

	private String email;

	private String password;

	// Default Constructor
	public User() {

	}

	// Creating a Constructor which accepts all the attributes: Constructor
	// Overloading
	public User(String email, String name, String password) {
		this.email = email;
		this.name = name;
		this.password =password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public static void main(String[] args) {

		// create user info using Setter methods and Default constructor
		User obj1 = new User();
		obj1.setEmail("isacdevasbishek2@gmail.com");
		obj1.setName("Isac");
		obj1.setPassword("Isac@2002");
      System.out.println("User1");
		System.out.println(obj1.getEmail() + "\n" + obj1.getName() + "\n"+ obj1.getPassword());
		
		System.out.println();
		// Create user info with Overloaded constructor accepting parameters
		System.out.println("User2");
		User obj12 = new User("devasbishek2002@gmail.com", "isacdev", "isacdev@2002");
		System.out.println(obj12.getEmail() + "\n" + obj12.getName() + "\n"+ obj12.getPassword());

	}
}

