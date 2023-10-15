package day04.misc;

abstract class Person {
	protected int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void printDetails() {
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
	}
}

public class Student extends Person {
	
	float marks;
	
	public Student(int age, String name, float marks) {
		super(age, name);
		this.marks = marks;
		this.age = 10;
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Marks: " + this.marks);
		
	}
	public static void main(String[] args) {
		Person s1 = new Student(15, "Ram", 90.5f);
		s1.printDetails();
	}
	
}

class FSSAStudent extends Student {
	double stipend;
	
	public FSSAStudent(int age, String name, float marks,double stipend) {
		super(age,name,marks);
		this.stipend = stipend;
	}
}
