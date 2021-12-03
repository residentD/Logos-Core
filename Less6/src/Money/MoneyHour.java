package Money;

public class MoneyHour implements Salery {
	private String name;
	private int salary;

	public String getName() {
		return name;
	}

	public MoneyHour(String name, int salery) {
		super();
		this.name = name;
		this.salary = salery;
	}

	@Override
	public int getSalery(int hours) {
		return this.salary * hours;
	}

}
