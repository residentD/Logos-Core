package lgs;

public class Robot {

	protected String name;

	Robot(String name) {
		this.name = name;
	}
	
	public void Work() {
		System.out.println("Я " + name + " – я просто працюю");
	}

}
