package Aplicat;



import clases.Sy27;

public class Aplication {

	
	public static void main(String[] args) {
		
		
		Sy27 sy27 = new Sy27("Кудяплик", 850, "іржавий");
		
		sy27.flyUp();
		sy27.flyDown();
		sy27.flyLeft();
		sy27.flyRight();
		sy27.startMotor();
		sy27.takeoff();
		sy27.nucBomb();
		sy27.stels();
		sy27.turbo();
		sy27.landing();
		
		//System.out.format("%.4f",randome.getRando(1, 52));
	}
}
