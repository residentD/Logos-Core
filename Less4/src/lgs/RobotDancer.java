package lgs;

public class RobotDancer extends Robot {
	
	RobotDancer(String name) {
		super(name);		
	}

	@Override
	public void Work() {
		System.out.println("Я " + this.name + " – я просто танцюю");
		
	}	

}
