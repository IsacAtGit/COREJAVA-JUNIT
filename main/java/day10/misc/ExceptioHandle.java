package day10.misc;
class divider{
	public static int Divisor(int a ,int b) throws Exception {
		if(b<=0) {
			throw new IllegalArgumentException("savu da");
		}
		return a/b;
	}
}
public class ExceptioHandle {
   public static void main(String[] args) {
	try {
		divider.Divisor(5,0);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
