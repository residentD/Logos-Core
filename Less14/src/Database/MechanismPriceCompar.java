package Database;

import java.util.Comparator;

public class MechanismPriceCompar implements Comparator<AutoMechanism> {

	@Override
	public int compare(AutoMechanism o1, AutoMechanism o2) {
		if (o1.getMachiPrice() > o2.getMachiPrice()) {
			return 1;
		} else if (o1.getMachiPrice() < o2.getMachiPrice()) {
			return -1;
		} else {
			return 0;
		}
	}
}
