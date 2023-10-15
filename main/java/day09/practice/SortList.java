package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortList {
	static ArrayList<Integer> arr=new ArrayList<Integer>();
	public static boolean getElements() {
		System.out.println("Give total no of elements");
		   Scanner scan=new Scanner(System.in);
		   
		   int a=scan.nextInt();
		   
		   for(int i=0;i<a;i++) {
			   arr.add(scan.nextInt());
		   }
		   return true;
	}
	static public boolean viewsortedElements() {
		Collections.sort(arr);
		   System.out.println(arr);
		   return true;
	}
   public static void main(String[] args) {
	  
	   SortList.getElements();
	   SortList.viewsortedElements();
}
}
