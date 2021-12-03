package Aplication;

import Interface2.MyCalculator;
import Money.*;

public class Aplication {

	public static void main(String[] args) {

		MoneyHour mHour = new MoneyHour("Валера", 17);
		MoneyMonth mMonth = new MoneyMonth("Жора", 4200);

		System.out.println(mHour.getName() + " - платня за годину = " + mHour.getSalery(1) + "баксів");
		System.out.println(mHour.getName() + " - платня за місяць робочих годин = " + mHour.getSalery(1 * 240) + "баксів");
		System.out.println(mMonth.getName() + " - платня за місяць = " + mMonth.getSalery(120) + "баксів");

		MyCalculator calc = new MyCalculator();

		System.out.println("додавання - " + calc.Pl(112, 45));
		System.out.println("віднімання - " + calc.Mn(512, 250));
		System.out.println("множення - " + calc.Mlp(665, 32));
		System.out.println("ділення - " + calc.Dvd(942, 25));

	}

}
