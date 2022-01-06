
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import clases.Auto;
import clases.Rando;

public class Aplication {

	public static void main(String[] args) {

		/**
		 * Random massive
		 **/

		Integer[] arreyRando = new Integer[20];
		for (int i = 0; i < arreyRando.length; i++) {
			arreyRando[i] = ((int) (Math.random() * 100) + 1);
		}
		System.out.println("Не сортований массив");
		System.out.println(Arrays.toString(arreyRando));
		Arrays.sort(arreyRando);
		System.out.println("----------------------------------");
		System.out.println("Сортований массив на збільшення");
		System.out.println(Arrays.toString(arreyRando));
		System.out.println("----------------------------------");
		System.out.println("Сортований массив на зменьшення");
		Arrays.sort(arreyRando, Collections.reverseOrder());
		System.out.println(Arrays.toString(arreyRando));

		Auto[][] autos = new Auto[Rando.getInt(2, 9)][Rando.getInt(2, 9)];

		for (int i = 0; i < autos.length; i++) {
			for (int j = 0; j < autos[i].length; j++) {
				autos[i][j] = new Auto();

			}

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
					System.out.println(Arrays.deepToString(autos));
					break;
				}

				case "2": {
					Auto auto = new Auto();
					for (int i = 0; i < autos.length; i++) {
						Arrays.fill(autos[i], auto);
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
