package VerhRada;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Deputat.Deputat;
import Frakcia.Frakcia;

public class VerhRada {

	private static VerhRada inst;
	private ArrayList<Frakcia> frakcions;

	private VerhRada() {
		frakcions = new ArrayList<Frakcia>();
	};

	public static VerhRada getInst() {
		if (inst == null) {
			inst = new VerhRada();
		}
		return inst;
	}

	public ArrayList<Frakcia> getFrakcions() {
		return frakcions;
	}

	public void setFrakcions(ArrayList<Frakcia> frakcions) {
		this.frakcions = frakcions;
	}

	public void showAllFrakcions() {
		System.out.println("Наявні фракції");
		Iterator<Frakcia> iterator = this.frakcions.iterator();
		while (iterator.hasNext()) {
			Frakcia frakcia = (Frakcia) iterator.next();
			System.out.println(frakcia.getFrakName());
		}
	}

	public void addFrakcia() {
		this.showAllFrakcions();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву нової фракції: ");
		String frName = scanner.nextLine();
		this.frakcions.add(new Frakcia(frName));
	}

	public void removeFrakcia() {
		this.showAllFrakcions();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції remove: ");
		String frName = scanner.nextLine();
		Iterator<Frakcia> iterator = this.frakcions.iterator();
		while (iterator.hasNext()) {
			Frakcia frakcia = iterator.next();
			if (frakcia.getFrakName().equalsIgnoreCase(frName)) {
				System.out.println("Фракція " + frakcia.getFrakName() + "removed.");
				iterator.remove();
			}
		}
	}

	public void showFrakcia() {
		this.showAllFrakcions();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції: ");
		String frName = scanner.nextLine();
		Iterator<Frakcia> iterator = this.frakcions.iterator();
		while (iterator.hasNext()) {
			Frakcia frakcia = iterator.next();
			if (frakcia.getFrakName().equalsIgnoreCase(frName)) {
				System.out.println(frakcia);
			}
		}
	}

	public void addDeputatDoFrakcia() {
		this.showAllFrakcions();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції щоб додати депутата: ");
		String frName = scanner.nextLine();
		Iterator<Frakcia> iterator = this.frakcions.iterator();
		while (iterator.hasNext()) {
			Frakcia frakcia = iterator.next();
			if (frakcia.getFrakName().equalsIgnoreCase(frName)) {
				frakcia.addDeputat();
			}
		}
	}

	public void removeDeputatDoFrakcia() {
		this.showAllFrakcions();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції щоб remove депутата: ");
		String frName = scanner.nextLine();
		Iterator<Frakcia> iterator = this.frakcions.iterator();
		while (iterator.hasNext()) {
			Frakcia frakcia = iterator.next();
			if (frakcia.getFrakName().equalsIgnoreCase(frName)) {
				frakcia.removeDeputat();				
			}
		}
	}
	
	public void showHabarnik() {
		Iterator<Frakcia> iterator = this.frakcions.iterator();
		while (iterator.hasNext()) {
			Frakcia frakcia = iterator.next();
			frakcia.showAllHabarnik();
		}
	}
	
	public void showTopHabarnik() {
		ArrayList<Deputat> habarDeputat = new ArrayList<Deputat>();
		Iterator<Frakcia> iterator = this.frakcions.iterator();
		while (iterator.hasNext()) {
			Frakcia frakcia = iterator.next();
			if (frakcia.getDeputaty().size() > 0) {
				habarDeputat.add(frakcia.getTopHabarnik());
			}
		}
	}
	
}
