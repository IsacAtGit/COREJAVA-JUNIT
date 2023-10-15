package day05.misc;

abstract class Shape {
	public abstract void draw();
}

class Rectangle2 extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

class Square extends Rectangle2 {
	
	@Override

	public void draw() {
		System.out.println("Drawing a square");
	}
}

public class ShapeMultipleInhDemo {
	public static void main(String[] args) {
		Shape rec = new Square();
//		Square square = new Square();
	   
		rec.draw();
	
//		square.draw();
	}
}
