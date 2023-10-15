package day06.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {
    
   static ArrayList<String> tasks = new ArrayList<>();
    static ArrayList<String> priority = new ArrayList<>();
    static Tasks taskManager = new Tasks();
    static Scanner scan = new Scanner(System.in);
    static String yes = "yes";

    public static boolean addTasks(String name) throws IllegalArgumentException {
    	name=name.toLowerCase().trim();
    	if(name.equals("")) {
    		throw new IllegalArgumentException("Name should not be null or empty");
    	}
    	else {
    		tasks.add(name);
    	       return true;
    	}
       
    }
    public static boolean addProirty(String level) throws IllegalArgumentException {
    	level=level.toLowerCase().trim();
    	if(level.equals("")) {
    		throw new IllegalArgumentException("Prority should not be null or empty");
    	}
    	else {
    		priority.add(level);
 	       return true;
    	}
     }
    
    public static boolean displayTasks() {
        for (int j = 0; j < tasks.size(); j++) {
            System.out.println(j + " " + tasks.get(j) + " Priority Level: " + priority.get(j));
        }
        return true;
    }
  static  boolean getTask() {
  	  
        while (yes.equals("yes")) {
            System.out.println("Add your task:");
            String taskName = scan.nextLine();
            taskManager.addTasks(taskName);
           
            
            System.out.println("Add priority level:");
            String priorityLevel = scan.nextLine();
            taskManager.addProirty(priorityLevel);
            
            System.out.println("Continue? (yes/no)");
            yes = scan.nextLine();
        }
        taskManager.displayTasks();
        return true;
        
    }
    
    public static void main(String[] args) {
        getTask();
    }
}

