package Database;


import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		String input;
		boolean go = true;
		Scanner scanner = new Scanner(System.in);

		while (go) {
			System.out.println("Less 14");
			System.out.println("Push 1 - Auto price");
			System.out.println("Push 2 - sorted test");
			System.out.println("Push 0 - exit");
			input = scanner.nextLine();

			switch (input) {

			case "1":
				BasePrice.go();
				break;

			case "2":
				MechaScann.go();
				break;
			case "0":
				go = false;
				break;

			default:
				System.out.println("Невірне значення");
				break;
			}

		}

	}
	

}
