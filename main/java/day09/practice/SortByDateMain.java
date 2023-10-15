package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByDateMain {
	public static void main(String[] args) {
         LocalDate input=LocalDate.of(2023,2,22);
         Task acct1 = new Task(1, "code", input);
		 LocalDate input1=LocalDate.of(2023,2,24);
		 Task acct2 = new Task(2, "study", input1);
		 LocalDate input2=LocalDate.of(2023,2,23);
		 Task acct3 = new Task(4, "play", input2);

		List<Task> list = new ArrayList<Task>();
		list.add(acct1);
		list.add(acct2);
		list.add(acct3); 

		Collections.sort(list); //sort uses comparable interface
		
		//Printing numbers sorted by balance
		System.out.println(list); 

	}

}
