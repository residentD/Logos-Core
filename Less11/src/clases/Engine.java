package clases;

public class Engine {

	private int cilinders;

	public Engine() {
		super();
		this.cilinders = Rando.getInt(2, 16);
	}

	public Engine(int cilinders) {
		super();
		this.cilinders = cilinders;
	}

	@Override
	public String toString() {
		return "[cilinders=" + cilinders + "]";
	}

}
