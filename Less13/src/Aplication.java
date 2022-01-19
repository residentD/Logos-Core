import java.util.Scanner;

import Base.Base;
import VerhRada.VerhRada;

public class Aplication {
	
	public static void main(String[] args) {
		
		VerhRada verhRada = VerhRada.getInst();
		
		
		boolean go = true;
		Scanner scanner = new Scanner(System.in);
		String menu = "\nEnter 1 add frakcia\n"
				+ "Enter 2 del konkretny frakcia\n"
				+ "Enter 3 show all frakcia\n"
				+ "Enter 4 show konkretny frakcia\n"
				+ "Enter 5 add deputata do frakcia\n"
				+ "Enter 6 remove deputata konkretny frakcia\n"
				+ "Enter 7 show spisok habarnikiv\n"
				+ "Enter 8 show top habarnik\n"
				+ "Enter 0 exit\n"
				+ "Enter 9 to base\n";
		
		while (go) {
			System.out.println(menu);
			String input = scanner.next();
			switch (input) {
			case "0":{
				go = false;
				break;
			}
			
			case "1":{
				verhRada.addFrakcia();
				break;
			}
				
			case "2":{
				verhRada.removeFrakcia();
				break;
			}
			
			case "3":{
				verhRada.showAllFrakcions();
				break;
			}
			
			case "4":{
				verhRada.showFrakcia();
				break;
			}
			
			case "5":{
				verhRada.addDeputatDoFrakcia();
				break;
			}
			case "6":{
				verhRada.removeDeputatDoFrakcia();
				break;
			}
			case "7":{
				verhRada.showHabarnik();
				break;
			}
			case "8":{
				verhRada.showTopHabarnik();
				break;
			}
			case "9":{
				Base.bases();				
				break;
			}

			default:
				System.out.println("Невірне значення");
				break;
			}
		}
				
				
		
	}

}
