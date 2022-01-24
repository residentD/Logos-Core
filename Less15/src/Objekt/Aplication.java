package Objekt;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		ZooClub zooClub = new ZooClub();
		zooClub.baseDate();
		String message = "Enter number case: \n" + "1 - add club person \n" + "2 - add pet to person \n"
				+ "3 - remove pet club person \n" + "4 - remove club person \n" + "5 - remove all pet - name \n"
				+ "6 - remove all pet - type \n" + "7 - display club \n" + "0 - exit \n";

		while (true) {
			String menu;
			String persName;
			int persAge;
			String petName;
			String petType;
			Scanner scanner = new Scanner(System.in);
			System.out.println(message);
			menu = scanner.nextLine();

			switch (menu) {
			case "1": {
				System.out.println("Enter new person name: ");
				persName = scanner.nextLine();
				System.out.println("Enter person age: ");
				persAge = scanner.nextInt();
				zooClub.addPerson(persName, persAge);
				break;
			}

			case "2": {
				System.out.println("Enter person name: ");
				persName = scanner.nextLine();
				System.out.println("Enter pet name: ");
				petName = scanner.nextLine();
				System.out.println("Enter pet type: ");
				petType = scanner.nextLine();
				zooClub.addPetPerson(persName, petName, petType);
				break;
			}

			case "3": {
				System.out.println("Enter person name: ");
				persName = scanner.nextLine();
				System.out.println("Enter pet name: ");
				petName = scanner.nextLine();
				zooClub.removePetFromPerson(persName, petName);
				break;
			}

			case "4": {
				System.out.println("Enter person name: ");
				persName = scanner.nextLine();
				zooClub.removePerson(persName);
				break;
			}

			case "5": {
				System.out.println("Enter pet name: ");
				petName = scanner.nextLine();
				zooClub.removePetName(petName);
				break;
			}

			case "6": {
				System.out.println("Enter pet type: ");
				petType = scanner.nextLine();
				zooClub.removePetType(petType);
				break;
			}

			case "7": {
				System.out.println(zooClub.toString());
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

}
