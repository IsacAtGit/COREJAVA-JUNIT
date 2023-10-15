package day06.practice;
import java.util.ArrayList;
class finder{
	static ArrayList<String> tasks= new ArrayList<String>();//new arraylist
	static boolean findTaskByName(String name) {
		String taskname=name.toLowerCase();
		
		for(int i=0;i<tasks.size();i++) {
			//array is iterated
			if(tasks.get(i).equals(taskname)) {
				System.out.println(tasks.get(i) +" found");
				return true; //if task available return true
			}
	}
		return false;
	}
	
	static boolean taskadd(String taskName) throws IllegalArgumentException{
		 taskName=taskName.toLowerCase();
		if(taskName.equals("")) {
			throw new IllegalArgumentException("TaskName cant be null");
		}
		tasks.add(taskName.toLowerCase());
		return true;
		
	}
}
public class taskFinder {
	public static void main(String[] args) {
		finder.taskadd("study");
		 finder.findTaskByName("Study"); 
	  } 
}
