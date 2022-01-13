import java.util.Scanner;

import clases.ScanAuto;
import clases.ScanMenu;

public class Aplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean runs = true;
		String input;

		while (runs) {
			System.out.println("1 - scanner Auto");
			System.out.println("2 - scanner Menu");
			System.out.println("0 - Exit");
			input = scanner.next();

			switch (input) {

			case "0": {
				System.out.println("Вихід");
				runs = false;
				break;
			}
			case "1": {
				ScanAuto.go();
				break;
			}
			case "2": {
				ScanMenu.play();
				break;
			}

			default:
				break;
			}
		}

	}

}
