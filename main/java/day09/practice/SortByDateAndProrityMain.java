package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByDateAndProrityMain {
	public static void main(String[] args) {
         LocalDate input=LocalDate.of(2023,2,22);
		Tasks acct1 = new Tasks(1, "code", input,5);
		 LocalDate input1=LocalDate.of(2023,2,24);
		Tasks acct2 = new Tasks(2, "run", input1,5);
		 LocalDate input2=LocalDate.of(2023,2,23);
		Tasks acct3 = new Tasks(4, "jog", input2,5);
		 LocalDate input3=LocalDate.of(2023,2,23); 
			Tasks acct4 = new Tasks(4, "sleep", input2,4);
 
		List<Tasks> list = new ArrayList<Tasks>();
		list.add(acct1);
		list.add(acct2);
		list.add(acct3);
		list.add(acct4);

		
		Collections.sort(list);
		
		//Printing numbers sorted by balance
		System.out.println(list);

	}

}
