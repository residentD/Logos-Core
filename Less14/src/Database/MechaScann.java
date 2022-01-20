package Database;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class MechaScann {

	public static HashSet<Mechanism> mechanisms = new HashSet<Mechanism>();
	

	public static void go() {

		String input;
		Scanner scanner = new Scanner(System.in);

		scanData();

		String mMenu = "\nEnter number actions:\n"
		+ "1 - All auto\n"
				+ "2 - Add auto\n"
		+ "3 - Remove auto\n"
				+ "4 - Replace auto\n" 
		+ "5 - Sorted name \n" 
				+ "6 - Sorted lenght \n" 
		+ "7 - Sorted width \n"
				+ "8 - Sorted weight \n" 
		+ "9 - i- element\n" 
				+ "0 - Exit\n";

		while (true) {
			System.out.println(mMenu);
			input = scanner.nextLine();

			switch (input) {
			case "1": {
				showAllAuto();
				break;
			}
			case "2": {
				addAuto();
				break;
			}
			case "3": {
				removeAuto("Enter name auto remove.", "removed");
				break;
			}
			case "4": {
				removeAuto("Enter name auto replace.", "replaced");
				addAuto();
				break;
			}
			case "5": {
				sortedAuto(new MechaComparator(1));
				break;
			}
			case "6": {
				sortedAuto(new MechaComparator(2));
				break;
			}
			case "7": {
				sortedAuto(new MechaComparator(3));
				break;
			}
			case "8": {
				sortedAuto(new MechaComparator(4));
				break;
			}
			case "9": {
				showIndex();
				break;
			}
			case "0": {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("Невірне значення");
				break;
			}

			}

		}

	}
	
	public static void scanData() {
		
		mechanisms.add(new Mechanism("BMW X1 xDrive20i", 1507, 4447, 1826));
		mechanisms.add(new Mechanism("BMW X1 xDrive25i", 1508, 4447, 1826));
		mechanisms.add(new Mechanism("BMW X1 sDrive16d", 1480, 4400, 1800));
		mechanisms.add(new Mechanism("BMW X1 xDrive18d", 1505, 4460, 1830));
		mechanisms.add(new Mechanism("Mercedes A-Class W169", 1605, 4600, 1900));
		mechanisms.add(new Mechanism("Mercedes A-Class W176", 1620, 4700, 1910));
		mechanisms.add(new Mechanism("Mercedes AMG GT С190", 1700, 4550, 1750));
		mechanisms.add(new Mechanism("Mercedes AMG GT Roadster R190", 1750, 4800, 1625));
		mechanisms.add(new Mechanism("AUDI A3 Sedan", 1680, 4900, 1640));
		mechanisms.add(new Mechanism("AUDI A4 Sedan", 1780, 5100, 1670));
		mechanisms.add(new Mechanism("AUDI A5 Sedan", 1800, 5010, 1625));
		mechanisms.add(new Mechanism("AUDI A6 Sedan", 1760, 5150, 1700));
		mechanisms.add(new Mechanism("Volkswagen Passat", 1480, 3900, 1300));
		mechanisms.add(new Mechanism("Volkswagen Polo", 1280, 3500, 1200));
		mechanisms.add(new Mechanism("Volkswagen Golf", 1200, 3200, 1150));
		mechanisms.add(new Mechanism("Volkswagen Taos", 1390, 4000, 1440));	
		
	}
	
	
	public static void showAllAuto() {
		if (mechanisms.size() > 0) {
			for (Mechanism mechanism : mechanisms) {
				System.out.println(mechanism);
			}
			
		}else {
			System.out.println("Список порожній");
		}
	}
	
	public static void addAuto() {
		Mechanism mechanism = createMech();
		mechanisms.add(mechanism);
		System.out.println(mechanism.getName() + " add");
	}
	
	public static void removeAuto(String messIn, String messOut) {
		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.println(messIn);
		System.out.println("Name: ");
		name = scanner.nextLine();
		Iterator<Mechanism> iterator = mechanisms.iterator();
		while (iterator.hasNext()) {
			Mechanism mechanism = iterator.next();
			if (mechanism.getName().equalsIgnoreCase(name)) {
				System.out.println(mechanism.getName() + " " + messOut);
				iterator.remove();
			}
		}
		
	}
	
	public static void sortedAuto(MechaComparator compar) {
		TreeSet<Mechanism> treeSet = new TreeSet<Mechanism>(compar);
		Iterator<Mechanism> iterator = mechanisms.iterator();
		while (iterator.hasNext()) {
			Mechanism mechanism = iterator.next();
			treeSet.add(mechanism);
		}
		for (Mechanism mechanism : treeSet) {
			System.out.println(mechanism);
		}
		
	}
	
	public static void showIndex() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть індекс ");
		int iIndex = scanner.nextInt();
		int index = 0;
		Iterator<Mechanism> iterator = mechanisms.iterator();
		while (iterator.hasNext()) {
			Mechanism mechanism = iterator.next();
			index ++;
			if (index == iIndex) {
				System.out.println(mechanism);
			}
		}
	}
	
	public static Mechanism createMech() {
		String name;
		double weight;
		double lenght;
		double width;
		Scanner scanner = new Scanner(System.in);
		System.out.println("'Введіть нові параметри");
		System.out.println("Name: ");
		name = scanner.nextLine();
		System.out.println("Weight: ");
		weight = scanner.nextDouble();
		System.out.println("Lenght: ");
		lenght = scanner.nextDouble();
		System.out.println("widht: ");
		width = scanner.nextDouble();
		
		return new Mechanism(name, weight, lenght, width);
	}

}
