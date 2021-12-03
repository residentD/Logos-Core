package Money;

public class MoneyMonth implements Salery {

	private String name;
	private int salary;

	public String getName() {
		return name;
	}

	public MoneyMonth(String name, int salery) {
		super();
		this.name = name;
		this.salary = salery;
	}

	@Override
	public int getSalery(int hours) {
		if (hours > 0) {
			return this.salary;
		} else {
			return 0;
		}
	}
}
