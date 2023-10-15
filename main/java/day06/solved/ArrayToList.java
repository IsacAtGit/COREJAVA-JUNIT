package day06.solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
  public static void main(String[] args) {
	  String[] deptNames = new String[3];
	  deptNames[0] = "CSE";
	  deptNames[1] = "EEE";
	  deptNames[2] = "MECH";
	  List list = new ArrayList<>(Arrays.asList(deptNames));
	  System.out.println(list);
	  list.add("isac");
	  System.out.println(list);
}
}
