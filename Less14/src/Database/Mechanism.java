package Database;

public class Mechanism implements Comparable<Mechanism> {

	private String name;
	private double weight;
	private double lenght;
	private double width;

	public Mechanism(String name, double weight, double lenght, double width) {
		super();
		this.name = name;
		this.weight = weight;
		this.lenght = lenght;
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int compareTo(Mechanism o) {
		if (this.getName().compareToIgnoreCase(o.getName()) > 0) {
			return 1;
		} else if (this.getName().compareToIgnoreCase(o.getName()) < 0) {
			return -1;
		} else {
			if (this.getLenght() > o.getLenght()) {
				return 1;
			} else if (this.getLenght() < o.getLenght()) {
				return -1;
			} else if (this.getWidth() > o.getWidth()) {
				return 1;
			} else if (this.getWidth() < o.getWidth()) {
				return -1;
			} else if (this.getWeight() > o.getWeight()) {
				return 1;
			} else if (this.getWeight() < o.getWeight()) {
				return -1;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Mechanism [name=" + name + ", weight=" + weight + ", lenght=" + lenght + ", width=" + width + "]";
	}

}
