import Classs.PalindromFiveReverse;
import Classs.Replacement;

public class Aplication {

	public static void main(String[] args) {
		
		PalindromFiveReverse.poli("корок");
		PalindromFiveReverse.poli("КОрОК");
		PalindromFiveReverse.poli("корокК");
		PalindromFiveReverse.poli("шалом");
		PalindromFiveReverse.poli("Rotor");
		
		System.out.println("-------------------------------");
		
		System.out.println(Replacement.replaced("коли дожруть коня"));
		System.out.println(Replacement.replaced("То мабуть його з Кетчупом"));
		System.out.println(Replacement.replaced("КОЛИ ДОЖРУТЬ КОНЯ"));
				
		
	}
	
	
}
