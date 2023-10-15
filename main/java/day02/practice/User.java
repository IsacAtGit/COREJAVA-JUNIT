package day02.practice;

class UserDetail {
	private int id;
	private String name;
	private String email;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

public class User {
	public static void main(String[] args) {
		 UserDetail obj=new UserDetail();
		 obj.setName("isac");
		 obj.setId(10);
		 obj.setPassword("isac@2002");
		 obj.setEmail("isacdevaabishek2@gmail.com");
		 
		 System.out.println(obj.getEmail());
		 System.out.println(obj.getPassword());
		 System.out.println(obj.getId());
		 System.out.println(obj.getName());
	  }
}
