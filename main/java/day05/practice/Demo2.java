
package day05.practice;
class Department {
	String deptName;
	int deptId;
	
}

class Student extends Department {
	String name;
	int id;
	Department department;
	
	Student(String name,int id, String Depname, int Dep){
		this.name = name;
		this.id = id;
		super.deptName = Depname;
		super.deptId = Dep;
		
	}
	
	String print(){
		String a = "Name is "+ name +" with id:" + id + "in the department of "+super.deptName+" in id :"+super.deptId ; 
		return a ;
	}
	// Create a constructor and assign depart and respective attributes
	// Add toString method to get the Student details. 
}

class Demo2{
	public static void main(String[] args) {
	
		
		Department dep = new Student("isac",110,"ghss",001);
		System.out.println(((Student) dep).print());
	}
}