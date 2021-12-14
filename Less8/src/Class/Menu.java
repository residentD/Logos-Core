package Class;

import java.util.Scanner;

import Enumeration.Month;
import Enumeration.Years;

public class Menu {

	private static boolean start;
	private static Scanner scanner = new Scanner(System.in);

	public static void play() {

		setStart(true);

		while (start()) {

			startMenu();
			startCase(scanner.next());

		}
	}

	static void startMenu() {
		System.out.println("Тиць номер:");
		System.out.println("1 - Місяці з одной пори року");
		System.out.println("2 - Місяці з однаковою кількістю днів");
		System.out.println("3 - Місяці з меньшою кількістю днів");
		System.out.println("4 - Місяці з більшою кількістю днів");
		System.out.println("5 - Наступна пора року");
		System.out.println("6 - Попередня пора року");
		System.out.println("7 - Місяці з парною кількістю днів");
		System.out.println("8 - Місяці з непарною кількістю днів");
		System.out.println("9 - Чи має місяць парну кількість днів");
		System.out.println("0 - Exit");
	}

	static void startCase(String menuCase) {

		switch (menuCase) {
		case "0": {
			System.out.println("Закінчення");
			setStart(false);
			break;
		}
		case "1": {
			System.out.println("Ввести сезон");
			actions(menuCase, scanner.next());
			break;
		}
		case "2": {
			System.out.println("Ввести кількість днів");
			actions(menuCase, scanner.next());
			break;
		}
		case "3": {
			System.out.println("Ввести кількість днів");
			actions(menuCase, scanner.next());
			break;
		}
		case "4": {
			System.out.println("Ввести кількість днів");
			actions(menuCase, scanner.next());
			break;
		}
		case "5": {
			System.out.println("Ввести сезон");
			actions(menuCase, scanner.next());
			break;
		}
		case "6": {
			System.out.println("Ввести сезон");
			actions(menuCase, scanner.next());
			break;
		}
		case "7": {
			System.out.println("ввести будь-яке значення");
			actions(menuCase, scanner.next());
			break;
		}
		case "8": {
			System.out.println("ввести будь-яке значення");
			actions(menuCase, scanner.next());
			break;
		}
		case "9": {
			System.out.println("Ввести місяць");
			actions(menuCase, scanner.next());
			break;
		}
		default:
			System.out.println("Коряве значення");
			break;
		}

	}

	static void actions(String menuCase, String input) {
		input = input.toUpperCase();
		Month[] months = Month.values();

		switch (menuCase) {
		case "1": {
			for (Month month : months) {

				if (month.getYearsSt().equals(input)) {
					System.out.println(month.name());
				}
			}
			break;
		}
		case "2": {
			for (Month month : months) {

				if (month.getDayC() == Integer.parseInt(input)) {
					System.out.println(month.name());
				}
			}
			break;
		}
		case "3": {
			for (Month month : months) {

				if (month.getDayC() < Integer.parseInt(input)) {
					System.out.println(month.name());
				}
			}
			break;
		}
		case "4": {
			for (Month month : months) {

				if (month.getDayC() > Integer.parseInt(input)) {
					System.out.println(month.name());
				}
			}
			break;
		}
		case "5": {
			int yearsN = -1;
			Years[] year = Years.values();
			
			for (int i = 0; i < year.length; i++) {
				if (year[i].name().equals(input)) {
					yearsN = i;
				}
			}
			if (yearsN == -1) {
				System.out.println("невірний сезон");
				break;
			}else if (yearsN == year.length - 1) {
				yearsN = 0;
			}else {
				yearsN++;
			}
			System.out.println(year[yearsN]);
			break;
		}
		case "6": {
			int yearsN = -1;
			Years[] year = Years.values();

			for (int i = 0; i < year.length; i++) {
				if (year[i].name().equals(input)) {
					yearsN = i;
				}
			}
			if (yearsN == -1) {
				System.out.println("невірний сезон");
				break;
			}else if (yearsN == year.length - 1) {
				yearsN = 0;
			}else {
				yearsN--;
			}
			System.out.println(year[yearsN]);
			break;
		}
		case "7": {
			for (Month month : months) {

				if (month.getDayC() % 2 == 0) {
					System.out.println(month.name());
				}
			}
			break;
		}
		case "8": {
			for (Month month : months) {

				if (month.getDayC() % 2 != 0) {
					System.out.println(month.name());
				}
			}
			break;
		}
		case "9": {
			for (Month month : months) {

				if (month.name().equals(input)) {
					System.out.println(month.getDayC() % 2 == 0);
				}
			}
			break;
		}		

		}
	}

	private static boolean start() {
		return start;
	}

	private static void setStart(boolean start) {
		Menu.start = start;
	}

}
