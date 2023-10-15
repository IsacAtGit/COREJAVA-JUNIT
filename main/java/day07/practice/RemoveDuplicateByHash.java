package day07.practice;

import java.util.ArrayList;
import java.util.TreeSet;

class TreeSetDemo {
	
	  static TreeSet<Integer> set ;
	 static boolean createTreeSet(ArrayList<Integer> list) {
		 set= new TreeSet<Integer>(list);
		 
		 return true;
	 }
	static boolean duplicatesRemoved() {
		 for (Integer i :  set) {
	            System.out.print(i+"\n");
	        }
		 
		 return true;
	 }
}
public class RemoveDuplicateByHash {
		static ArrayList createList() {
		 ArrayList<Integer> Array = new ArrayList<>();
		   Array.add(10);
		   Array.add(36);
		   Array.add(36);
		   Array.add(10);
		   Array.add(40);
		   Array.add(40);
		   return Array;
	}
	
	
   public static void main(String[] args) {
	   ArrayList<Integer> Array =createList();
	   TreeSetDemo.createTreeSet(Array);
	  TreeSetDemo.duplicatesRemoved();
}
}
