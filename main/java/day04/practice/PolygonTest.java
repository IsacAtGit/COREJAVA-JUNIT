package day04.practice;

public class PolygonTest {
	public static void main(String[] args) {
		Polygon rec;
		try {
			
			rec = new Rectangle (10, 5);
			System.out.println(rec.calculateArea());
			System.out.println(rec.circumference());
			Polygon ratt = new RightAngleTriangle(20.0,30.0);
			System.out.println(ratt.calculateArea()); 
			System.out.println(ratt.circumference()); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
