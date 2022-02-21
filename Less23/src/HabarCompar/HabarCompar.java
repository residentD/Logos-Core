package HabarCompar;

import java.util.Comparator;

import Deputat.Deputat;

public class HabarCompar implements Comparator<Deputat> {

	@Override
	public int compare(Deputat o1, Deputat o2) {

		if (o1.getHabar() > o2.getHabar()) {
			return -1;
		} else if (o1.getHabar() < o2.getHabar()) {
			return 1;
		}
		return 0;
	}

}
