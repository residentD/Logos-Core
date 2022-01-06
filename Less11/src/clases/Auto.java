package clases;

public class Auto {
	private Handlebar handlebar;
	private Engine engine;

	int power;
	int years;

	public Auto() {
		super();
		this.handlebar = new Handlebar();
		this.engine = new Engine();
		this.power = Rando.getInt(70, 300);
		this.years = Rando.getInt(1969, 2021);
	}

	public Auto(Handlebar handlebar, Engine engine, int power, int years) {
		super();
		this.handlebar = handlebar;
		this.engine = engine;
		this.power = power;
		this.years = years;
	}

	@Override
	public String toString() {
		return "Auto [handlebar=" + this.handlebar.toString() + ", engine="
				+ this.engine.toString() + ", power="
				+ power + ", years=" + years + "]";
	}

}
