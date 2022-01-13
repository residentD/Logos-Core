package clases;


public class Month {
	
	private String monName;
	private Years years;
	private int dayC;
	
	public Month(String monName, Years years, int dayC) {
		super();
		this.dayC = dayC;
		this.monName = monName;
		this.years = years;
	}

	public String getMonName() {
		return monName;
	}

	public void setMonName(String monName) {
		this.monName = monName;
	}

	public Years getYears() {
		return years;
	}

	public void setYears(Years years) {
		this.years = years;
	}

	public int getDayC() {
		return dayC;
	}

	public void setDayC(int dayC) {
		this.dayC = dayC;
	}

	@Override
	public String toString() {
		return "Month [monName=" + monName + ", years=" + years + ", dayC=" + dayC + "]";
	}		
		
	
}
