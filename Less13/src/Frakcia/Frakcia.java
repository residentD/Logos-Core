package Frakcia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import Deputat.Deputat;
import HabarCompar.HabarCompar;

public class Frakcia {
	private String frakName;
	private ArrayList<Deputat> deputaty;

	public Frakcia(String frakName) {
		super();
		this.frakName = frakName;
		this.deputaty = new ArrayList<Deputat>();
	}

	public String getFrakName() {
		return frakName;
	}

	public void setFrakName(String frakName) {
		this.frakName = frakName;
	}

	public ArrayList<Deputat> getDeputaty() {
		return deputaty;
	}

	public void setDeputaty(ArrayList<Deputat> deputaty) {
		this.deputaty = deputaty;
	}

	@Override
	public String toString() {
		return "Frakcia [frakName=" + frakName + ", deputaty=" + deputaty + "]";
	}

	public void addDeputat() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write first name");
		String frName = scanner.next();
		System.out.println("Write last name");
		String lnName = scanner.next();
		System.out.println("Write weight");
		double weight = scanner.nextDouble();
		System.out.println("Write height");
		double height = scanner.nextDouble();
		System.out.println("Це хабар? : ");
		String habar = scanner.next();
		boolean habarnik = false;
		if (habar.equalsIgnoreCase("yes") || habar.equalsIgnoreCase("Так") || habar.equalsIgnoreCase("true")) {
			habarnik = true;
		}

		this.deputaty.add(new Deputat(weight, height, frName, lnName, habarnik));
		Collections.sort(this.deputaty);
	}

	public void removeDeputat() {
		for (int i = 0; i < deputaty.size(); i++) {
			System.out.println(deputaty.get(i).getFullName());
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write first name");
		String frName = scanner.next();
		System.out.println("Write last name");
		String lnName = scanner.next();
		Iterator<Deputat> iterator = this.deputaty.iterator();

		while (iterator.hasNext()) {
			Deputat nextDeputat = iterator.next();
			if (nextDeputat.getFirstName().equalsIgnoreCase(frName)
					&& nextDeputat.getLastName().equalsIgnoreCase(lnName)) {
				System.out.println("Deputat " + nextDeputat.getFullName() + " removed " + this.getFrakName());
				iterator.remove();
			}
		}
	}

	public void showAllHabarnik() {
		Iterator<Deputat> iterator = deputaty.iterator();
		while (iterator.hasNext()) {
			Deputat nextDeputat = iterator.next();
			if (nextDeputat.isHabarnik()) {
				System.out.println(nextDeputat.getFullName());
			}
		}
	}

	public void showTopHabarnik() {
		Collections.sort(this.deputaty, new HabarCompar());
		System.out.println(this.deputaty.get(0).getFullName());
	}

	public Deputat getTopHabarnik() {
		Collections.sort(this.deputaty, new HabarCompar());
		return this.deputaty.get(0);
	}

	public void showAllDeputat() {
		Collections.sort(this.deputaty);
		Iterator<Deputat> iterator = deputaty.iterator();
		while (iterator.hasNext()) {
			Deputat nextDeputat = iterator.next();
			System.out.println(nextDeputat.getFullName());
		}
	}

	public void removeAllDeputat() {
		this.deputaty.clear();
	}

}
