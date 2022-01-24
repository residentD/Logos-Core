package Objekt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;

public class ZooClub {

	private HashMap<Person, ArrayList<Animal>> map;

	public ZooClub() {
		super();
		this.map = new HashMap<Person, ArrayList<Animal>>();
	}

	public void addPerson(String name, int age) {
		this.getMap().put(new Person(name, age), new ArrayList<Animal>());
	}

	public void addPerson(Person person) {
		this.getMap().put(person, new ArrayList<Animal>());
	}

	public void addPetPerson(String persName, String petName, String petType) {
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = this.map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(persName)) {
				entry.getValue().add(new Animal(petName, petType));
			}
		}

	}

	public void removePetFromPerson(String persName, String petName) {
		Iterator<Entry<Person, ArrayList<Animal>>> iteratorTop = this.map.entrySet().iterator();
		while (iteratorTop.hasNext()) {
			Entry<Person, ArrayList<Animal>> entry = iteratorTop.next();
			if (entry.getKey().getName().equalsIgnoreCase(persName)) {
				Iterator<Animal> iteratorBottom = entry.getValue().iterator();
				while (iteratorBottom.hasNext()) {
					Animal animal = iteratorBottom.next();
					if (animal.getName().equalsIgnoreCase(petName)) {
						iteratorBottom.remove();
					}
				}
			}
		}
	}

	public void removePerson(String name) {
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = this.map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)) {
				iterator.remove();
			}
		}
	}

	public void removePetName(String name) {
		Iterator<Entry<Person, ArrayList<Animal>>> iteratorTop = this.map.entrySet().iterator();
		while (iteratorTop.hasNext()) {
			Entry<Person, ArrayList<Animal>> entry = iteratorTop.next();
			Iterator<Animal> iteratorBottom = entry.getValue().iterator();
			while (iteratorBottom.hasNext()) {
				Animal animal = iteratorBottom.next();
				if (animal.getName().equalsIgnoreCase(name)) {
					iteratorBottom.remove();
				}
			}

		}
	}

	public void removePetType(String type) {
		Iterator<Entry<Person, ArrayList<Animal>>> iteratorTop = this.map.entrySet().iterator();
		while (iteratorTop.hasNext()) {
			Entry<Person, ArrayList<Animal>> entry = iteratorTop.next();
			Iterator<Animal> iteratorBottom = entry.getValue().iterator();
			while (iteratorBottom.hasNext()) {
				Animal animal = iteratorBottom.next();
				if (animal.getType().equalsIgnoreCase(type)) {
					iteratorBottom.remove();
				}
			}

		}
	}

	public void baseDate() {

		this.addPerson("Valera", 35);
		this.addPerson("Petro", 23);
		this.addPerson("Grisha", 25);
		this.addPerson("Stepan", 27);
		this.addPerson("Vinni", 18);
		this.addPetPerson("Koop", "Ryduj", "Cat");
		this.addPetPerson("Ben", "Paklya", "Cat");
		this.addPetPerson("Ben", "Dollar", "Dog");
		this.addPetPerson("Stiv", "Ponchig", "Dog");
		this.addPetPerson("Sten", "Pyshok", "Cat");
		this.addPetPerson("David", "Gold", "Fish");
		this.addPetPerson("David", "Ryby", "Hamster");

	}

	public HashMap<Person, ArrayList<Animal>> getMap() {
		return map;
	}

	public void setMap(HashMap<Person, ArrayList<Animal>> map) {
		this.map = map;
	}

	@Override
	public int hashCode() {
		return Objects.hash(map);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZooClub other = (ZooClub) obj;
		return Objects.equals(map, other.map);
	}

	@Override
	public String toString() {
		return "ZooClub [map=" + map + "]";
	}

}
