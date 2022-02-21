package VerhRada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;

import Deputat.Deputat;
import Frakcia.Frakcia;
import HabarCompar.HabarCompar;

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
		frakcions.stream().peek(e -> System.out.println(e.getFrakName())).collect(Collectors.toList());

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

		frakcions.stream().peek(e -> e.showAllHabarnik()).collect(Collectors.toList());

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
		Collections.sort(habarDeputat, new HabarCompar());
		System.out.println(habarDeputat.get(0).getFullName());
	}

}
