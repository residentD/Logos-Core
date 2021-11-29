package lgs;

import java.util.Iterator;

public class Aplication {
	public static void main(String[] args) {
		
		Robot r = new Robot("Robo");
		CoffeRobot r1 = new CoffeRobot("Robocoffee");
		RobotDancer r2 = new RobotDancer("Dancer");
		RobotCoocker r3 = new RobotCoocker("Robocoocker");
		r.Work();
		r1.Work();
		r2.Work();
		r3.Work();
		
		Robot [] robots = {r, r1, r2, r3};
		
		for (int i = 0; i < robots.length; i++) {
			robots[i].Work();
		}
		
		Animals anim = new Animals("Кудяплик", 25, 66);
		
		System.out.println("Тип тварини = " + anim.getType() + " Вік тварини = " + anim.getAge() + "років" + " Швидкість тварини + " + anim.getSpeed() + "км/год");
		
		anim.setType("Чибіс");
		anim.setAge(18);
		anim.setSpeed(35);
		
		System.out.println("Тип тварини = " + anim.getType() + " Вік тварини = " + anim.getAge() + "років" + " Швидкість тварини + " + anim.getSpeed() + "км/год");
	}

}
