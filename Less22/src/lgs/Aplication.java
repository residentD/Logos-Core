package lgs;

public class Aplication {
	public static void main(String[] args) {
		
		Cow cow = new Cow();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		cow.voice();
		dog.voice();
		cat.voice();
		
		Overload load1 = new Overload("resident", 256, "men");
		Overload load2 = new Overload("Grisha", 110);
		
		System.out.println(load1);
		System.out.println(load2);
		
		Amphibia frog = new Frog();
		
		frog.eats();
		frog.sleep();
		frog.swim();
		frog.jump();
			
	}

}
