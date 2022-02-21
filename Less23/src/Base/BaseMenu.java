package Base;

import java.util.Scanner;
import java.util.function.Consumer;

import VerhRada.VerhRada;

public class BaseMenu {
	
	static VerhRada verhRada = VerhRada.getInst();
	static boolean isGo = true;
	static int statMenu = 0;
	
	public static void go() {
		
		while (isGo) {
			
			menuSpisok.accept(statMenu);
			menuBase.accept(statMenu);
			
		}		
	}
	
	static void printMenu(String msg) {
		System.out.println(msg.toString());
	}
	
	static Consumer<Integer> menuSpisok = statMenu ->{
		String msg = "";
			
			switch (statMenu) {
			case 0:{
				
			msg = "\nEnter 1 add frakcia\n"
						+ "Enter 2 del konkretny frakcia\n"
						+ "Enter 3 show all frakcia\n"
						+ "Enter 4 show konkretny frakcia\n"
						+ "Enter 5 add deputata do frakcia\n"
						+ "Enter 6 remove deputata konkretny frakcia\n"
						+ "Enter 7 show spisok habarnikiv\n"
						+ "Enter 8 show top habarnik\n"
						+ "Enter 0 exit\n"
						+ "Enter 9 to base\n";
				break;				
			}
				

			default:{
				msg = "Incorrect input, try again.";
				break;
			}
				
			}
			System.out.println(msg);
			
	};
	
	static Consumer<Integer> menuBase = statMenu -> {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		switch (input) {
		case "0":{
			statMenu = 0;
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
	
	};

}
