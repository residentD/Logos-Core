package lgs;

public class Rectangle {
	
	private int w;
	private int h;	
	
	public Rectangle() {
		this.h = 25;
		this.w = 15;
	}
	
	Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public int getArea() {
		return (this.h * this.w);		
	}
	
	public int getPerimetr() {
		return (2 * (this.h + this.w));
	}
	
	public void resConsole(String res) {
				
		switch (res) {
		case "Perimetr":
			System.out.println("Периметр прямокутника = " + this.getPerimetr());			
			break;
		case "area":
			System.out.println("Площа прямокутника = " + this.getArea());
			break;

		default:
			System.out.println("Каряві значення");
			break;
		}

	}

}
