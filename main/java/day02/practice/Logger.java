package day02.practice;
class node{
	int val=1;
	int node(){
		System.out.println(val);
		return  val;
	}
}
public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		
		System.out.println("Info: " + msg);
	}
	
	public static void error (String msg) {
		
		System.out.println("error: " + msg);
	}
	
	public static void debug (int msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (int msg) {
		
		System.out.println("Info: " + msg);
	}
	
	public static void error (int msg) {
		
		System.out.println("error: " + msg);
	}
	
     public static void main(String[] args) {
		
	error(10);
	error("error");
	debug(10);
	debug("ten");
	info("information");
	info(100);
	}

	
}