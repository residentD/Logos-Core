import java.util.ArrayList;
import java.util.List;

public class Aplication {

	public static void main(String[] args) {


		List<Integer> listInt = new ArrayList<>();
		List listObj = new ArrayList<>();

		listObj.add(456415);
		listObj.add(224114);
		listObj.add("ghfgdd");
		listObj.add("String");
		
		

		/*
		 * При компіляції generic стають об’єктами 
		 */
		listInt.addAll(listObj);

		for (int i = 0; i < listInt.size(); i++) {
			System.out.println(listInt.get(i));
		}

		System.out.println();
	}
}
