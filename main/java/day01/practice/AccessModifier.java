package day01.practice;

public class AccessModifier {
	private String a = "a";
	private static String b = "b";
	private static String c = "c";
	private static String d = "d";
	
	 String geta(){
		return a;
	}
	static String getb(){
			return b;
		}
	 static String getc(){
			return c;
		}
	
	public static void main(String[] args) {
		AccessModifier obj=new AccessModifier();
		System.out.println(obj.geta()); //method by getting obj
		System.out.println(AccessModifier.getb()); // getting by static and constructor
		System.out.println(AccessModifier.getc());
		System.out.println(d);		 //direct call by static
	}
}
