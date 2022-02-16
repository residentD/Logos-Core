package lgs;

public class Amphibia {
	
	Lambda lamb = message -> System.out.println(message);
	
	
	public void eats() {
				
		lamb.say("Amphibia - їсть");
	}
	
	public void sleep() {
		
		lamb.say("Amphibia - спить");
	}
	
	public void swim() {
		
		lamb.say("Amphibia - плаває");
	}
	
	public void jump() {
		
		lamb.say("Amphibia - пригає");
	}

}

interface Lambda {
	void say(String message);	
	
}