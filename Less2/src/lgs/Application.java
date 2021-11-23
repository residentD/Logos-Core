package lgs;

public class Application {
	
	public static void main(String[] args) {
	
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(75, 35);
		
		r1.resConsole("Perimetr");
		r1.resConsole("area");
		
		r2.resConsole("Perimetr");
		r2.resConsole("area");
		
		Circle c = new Circle(125);
		
		System.out.println("Площа кола = " + c.getArea());
		System.out.println("Довжина кола = " + c.getLength());
		
	}
	
	

}
