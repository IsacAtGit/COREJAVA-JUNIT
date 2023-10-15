package day08.practice;

import java.util.Map;
import java.util.TreeMap;

public class HashWorks{
	static Map <String,Integer> countMap=new TreeMap<String,Integer>();//{}
	static boolean getarr(String [] arr) throws IllegalArgumentException{
		
		if(arr==null) {
			throw new IllegalArgumentException("Array Cant Be Null");
		}
		for(int i=0;i<arr.length;i++) {
			if(countMap.get(arr[i].toLowerCase())==null) {
				
				countMap.put(arr[i].toLowerCase(), 1); 
			}
			else {
				int count=countMap.get(arr[i].toLowerCase());
				count++;
				countMap.put(arr[i].toLowerCase(), count);
			}
		}
		return true;
	}
	
	static boolean viewMap() { 
		for(String x:countMap.keySet()) {
			System.out.println(countMap.get(x));
		}
		
		return true;
	}
} 
