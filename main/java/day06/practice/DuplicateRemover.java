package day06.practice;

import java.util.ArrayList;
import java.util.List;

class addTask{
	 List<String> cityList = new ArrayList<String>();
	 boolean addTasks(String taskName) throws IllegalArgumentException {
		if(taskName.equals("")) {
			throw new IllegalArgumentException("TaskName can't be null");
			
		}
	
		cityList.add(taskName); 
		return true;
	}
}



class viewTask extends addTask {
	
      boolean	viewTasks(){
		for(int i=0;i<cityList.size();i++) {
			
			for(int j=1;j<cityList.size();j++) {  
				
				if(cityList.get(i).equals(cityList.get(j))) {
					cityList.remove(j);  //removing the duplicate items
					
				}
			}
		}
		System.out.println(cityList);
		return true;
	}
	static boolean Startpro(String Name) {
		viewTask obj=new viewTask();
		 obj.addTasks(Name);	
		 obj.addTasks(Name);	
		 obj.viewTasks();
		 
		 return true;
	}
}

public class DuplicateRemover {
  public static void main(String[] args) {
	  viewTask.Startpro("Study");
  }
}
