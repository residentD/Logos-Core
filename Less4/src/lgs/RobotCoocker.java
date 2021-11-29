package lgs;

public class RobotCoocker extends Robot {
	
	RobotCoocker(String name) {
		super(name);		
	}

	@Override
	public void Work() {
		System.out.println("Я " + this.name + " – я просто готую");
		
	}	
}
