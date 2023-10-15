package day08.solved;

import java.util.HashMap;

public class ModifyingAHashMapDemo {
	public static void main(String[] args) {

		// Task: store department name and no of employees working in the department
		HashMap<String, Integer> deptMap = new HashMap<String, Integer>();
		deptMap.put("HR", 5);
		deptMap.put("ADMIN", 10);
		deptMap.put("DEVELOPERS", 300);


		// Modifying a particular count
		int hrCount = deptMap.get("HR");
		hrCount += 1;
		deptMap.put("HR", hrCount);

		// Iterate
		for (String deptName : deptMap.keySet()) { 

			int count = deptMap.get(deptName); 
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}
	}
}
