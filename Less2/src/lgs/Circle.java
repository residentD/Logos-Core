package lgs;

public class Circle {
	
	private double radius;
	private double diametr;
	
	public Circle(double radius) {
		this.radius = radius;
		this.diametr = radius * 2;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public double getLength() {
		return 2 * Math.PI * (this.diametr / 2);
	}

}
