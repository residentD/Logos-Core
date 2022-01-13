package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScanAuto {

	public static void go() {

		List<Auto> autos = new ArrayList<Auto>();
		int arSize = Rando.getInt(5, 10);
		for (int i = 0; i < arSize; i++) {

			autos.add(new Auto());

		}

		boolean go = true;
		try (Scanner scanner = new Scanner(System.in)) {
			while (go) {
				System.out.println("Тиць номер");
				System.out.println("1-показати массив");
				System.out.println("2-fill массив");
				System.out.println("0-exit");
				String inpStr = scanner.next();

				switch (inpStr) {

				case "0": {
					go = false;
					break;
				}

				case "1": {
					System.out.println(autos);
					break;
				}

				case "2": {
					Auto auto = new Auto();
					arSize = autos.size();
					autos.clear();
					for (int i = 0; i < arSize; i++) {
						autos.add(auto);
					}
					break;

				}

				default:
					System.out.println("Горбате значення");
				}

			}
		}

	}

}
