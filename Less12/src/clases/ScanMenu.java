package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class ScanMenu {

	private static boolean start;
	private static Scanner scanner = new Scanner(System.in);

	public static void play() {
		
		String input = "0";

		setStart(true);

		while (start()) {

			startMenu();
			input = scanner.next();
			
			startCase(input);

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
		ArrayList<Month> months = ArList.getMonths();

		switch (menuCase) {
		case "1": {
			for (Month month : months) {

				if (month.getYears().getYeName().equals(input)) {
					System.out.println(month.getMonName());
				}
			}
			break;
		}
		case "2": {
			for (Month month : months) {

				if (month.getDayC() == Integer.parseInt(input)) {
					System.out.println(month.getMonName());
				}
			}
			break;
		}
		case "3": {
			for (Month month : months) {

				if (month.getDayC() < Integer.parseInt(input)) {
					System.out.println(month.getMonName());
				}
			}
			break;
		}
		case "4": {
			for (Month month : months) {

				if (month.getDayC() > Integer.parseInt(input)) {
					System.out.println(month.getMonName());
				}
			}
			break;
		}
		case "5": {
			int yearsN = -1;
			ArrayList<Years> year = ArList.getYears();
			
			for (int i = 0; i < year.size(); i++) {
				if (year.get(i).getYeName().equals(input)) {
					yearsN = i;
				}
			}
			if (yearsN == -1) {
				System.out.println("невірний сезон");
				break;
			}else if (yearsN == year.size() - 1) {
				yearsN = 0;
			}else {
				yearsN++;
			}
			System.out.println(year.get(yearsN).getYeName());
			break;
		}
		case "6": {
			int yearsN = -1;
			ArrayList<Years> year = ArList.getYears();
			
			for (int i = 0; i < year.size(); i++) {
				if (year.get(i).getYeName().equals(input)) {
					yearsN = i;
				}
			}
			if (yearsN == -1) {
				System.out.println("невірний сезон");
				break;
			}else if (yearsN == 0) {
				yearsN = year.size() - 1;
			}else {
				yearsN--;
			}
			System.out.println(year.get(yearsN).getYeName());
			break;
		}
		case "7": {
			for (Month month : months) {

				if (month.getDayC() % 2 == 0) {
					System.out.println(month.getMonName());
				}
			}
			break;
		}
		case "8": {
			for (Month month : months) {

				if (month.getDayC() % 2 != 0) {
					System.out.println(month.getMonName());
				}
			}
			break;
		}
		case "9": {
			for (Month month : months) {

				if (month.getMonName().equals(input)) {
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
		ScanMenu.start = start;
	}
	
}
