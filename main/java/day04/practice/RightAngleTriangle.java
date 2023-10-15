package day04.practice;

public class RightAngleTriangle extends Polygon {
	protected double base;
	protected double height;
	public RightAngleTriangle(double base,double height) throws Exception {
		super(3);
		if(base <= 0 || height <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.base = base;
		this.height = height;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 1.0/2.0*(this.base*this.height);
	}
	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		
		double c = Math.round(Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)));
		double circumference = base + height + c;
		return circumference;
	}

}