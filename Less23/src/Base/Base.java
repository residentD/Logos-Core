package Base;



import Deputat.Deputat;
import Frakcia.Frakcia;
import VerhRada.VerhRada;

public class Base {

	public static void bases() {
		VerhRada rada = VerhRada.getInst();
		

		Frakcia frakcia = new Frakcia("Соплежуї");

		Deputat deputat = new Deputat(75.2, 175, "Кавілл", "Генрі", true);
		deputat.setHabar(1500);
		frakcia.getDeputaty().add(deputat);
		deputat = new Deputat(75.2, 175, "Беті", "Джої", true);
		deputat.setHabar(275);
		frakcia.getDeputaty().add(deputat);
		deputat = new Deputat(75.2, 175, "Шаффер", "Анна", true);
		deputat.setHabar(3500);
		frakcia.getDeputaty().add(deputat);
		deputat = new Deputat(75.2, 175, "Феррен", "Імон", false);
		frakcia.getDeputaty().add(deputat);
		deputat = new Deputat(75.2, 175, "Сімсон", "Меція", false);
		frakcia.getDeputaty().add(deputat);

		rada.getFrakcions().add(frakcia);

		frakcia = new Frakcia("Халяль");

		deputat = new Deputat(75.2, 175, "Кларк", "Емілія", true);
		deputat.setHabar(850);
		frakcia.getDeputaty().add(deputat);
		deputat = new Deputat(75.2, 175, "Тернер", "Софі", true);
		deputat.setHabar(1200);
		frakcia.getDeputaty().add(deputat);
		deputat = new Deputat(75.2, 175, "Гіді", "Ліна", false);
		frakcia.getDeputaty().add(deputat);
		deputat = new Deputat(75.2, 175, "Аллен", "Альфі", false);
		frakcia.getDeputaty().add(deputat);

		rada.getFrakcions().add(frakcia);

		frakcia = new Frakcia("Лупаті");

		deputat = new Deputat(75.2, 175, "Россум", "Еммі", true);
		deputat.setHabar(6900);
		frakcia.getDeputaty().add(deputat);
		deputat = new Deputat(75.2, 175, "Каткоскі", "Ітен", true);
		deputat.setHabar(1200);
		frakcia.getDeputaty().add(deputat);
		deputat = new Deputat(75.2, 175, "Кенні", "Емма", false);
		frakcia.getDeputaty().add(deputat);
		deputat = new Deputat(75.2, 175, "Фішер", "Ноель", false);
		frakcia.getDeputaty().add(deputat);
		
		rada.getFrakcions().add(frakcia);
	}

}
