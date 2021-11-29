package lgs;

public class CoffeRobot extends Robot {

	CoffeRobot(String name) {
		super(name);		
	}

	@Override
	public void Work() {
		System.out.println("Я " + this.name + " – я варю каву");
		
	}	

	
	
}
