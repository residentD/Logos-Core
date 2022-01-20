package Database;

public class AutoMechanism implements Comparable<AutoMechanism> {
	private String machiName;
	private int machiPrice;

	public AutoMechanism(String machiName, int machiPrice) {
		super();
		this.machiName = machiName;
		this.machiPrice = machiPrice;
	}

	public String getMachiName() {
		return machiName;
	}

	public void setMachiName(String machiName) {
		this.machiName = machiName;
	}

	public int getMachiPrice() {
		return machiPrice;
	}

	public void setMachiPrice(int machiPrice) {
		this.machiPrice = machiPrice;
	}

	@Override
	public int compareTo(AutoMechanism o) {
		if (this.getMachiName().compareToIgnoreCase(o.getMachiName()) > 0) {
			return 1;
		} else if (this.getMachiName().compareToIgnoreCase(o.getMachiName()) < 0) {
			return -1;
		} else {
			if (this.getMachiPrice() > o.getMachiPrice()) {
				return 1;
			} else if (this.getMachiPrice() < o.getMachiPrice()) {
				return -1;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "WarMechanism [machiName=" + machiName + ", machiPrice=" + machiPrice + "]";
	}


}
