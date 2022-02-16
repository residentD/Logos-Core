package lgs;

public abstract class Pet {
	
	public abstract void voice();
	
	Voice voiLamb = message -> System.out.println(message);	

}

interface Voice{
	void voiPet(String message);
}