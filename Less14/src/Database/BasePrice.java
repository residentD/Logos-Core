package Database;

import java.util.HashSet;
import java.util.TreeSet;

public class BasePrice {

	public static void go() {

		AutoMechanism auto;
		HashSet<AutoMechanism> hashSet = new HashSet<AutoMechanism>();
		TreeSet<AutoMechanism> treeSetAll = new TreeSet<AutoMechanism>();
		TreeSet<AutoMechanism> treeSetPrice = new TreeSet<AutoMechanism>(new MechanismPriceCompar());

		auto = new AutoMechanism("BMW X1 xDrive20i", 10500);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("BMW X1 xDrive25i", 9600);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("BMW X1 sDrive16d", 12000);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("BMW X1 xDrive18d", 11750);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("Mercedes A-Class W169", 15000);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("Mercedes A-Class W176", 17000);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("Mercedes AMG GT С190", 14500);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("Mercedes AMG GT Roadster R190", 50000);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("AUDI A3 Sedan", 35000);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("AUDI A4 Sedan", 25000);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("AUDI A5 Sedan", 28000);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("AUDI A6 Sedan", 35000);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("Volkswagen Passat", 9500);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("Volkswagen Polo", 7500);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("Volkswagen Golf", 13700);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);
		auto = new AutoMechanism("Volkswagen Taos", 12100);
		hashSet.add(auto);
		treeSetAll.add(auto);
		treeSetPrice.add(auto);

		System.out.println("Невідсортований set");
		for (AutoMechanism autoMechanism : hashSet) {
			System.out.println(autoMechanism);
		}
		System.out.println();
		System.out.println("Сортировка по всем полям");
		for (AutoMechanism autoMechanism : treeSetAll) {
			System.out.println(autoMechanism);
		}
		System.out.println();
		System.out.println("Сортировка price");
		for (AutoMechanism autoMechanism : treeSetPrice) {
			System.out.println(autoMechanism);
		}
	}

}
