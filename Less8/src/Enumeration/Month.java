package Enumeration;



public enum Month {
	JANUARY(Years.WINTER, 31), FEBRUARY(Years.WINTER,28), MARCH(Years.SPRING, 31), APRIL(Years.SPRING, 30), MAY(Years.SPRING, 31),
	JUNE(Years.SUMMER, 30), JULY(Years.SUMMER, 31), AUGUST(Years.SUMMER, 31), SEPTEMBER(Years.AUTUMN, 30), OCTOBER(Years.AUTUMN, 31),
	NOVEMBER(Years.AUTUMN, 30), DECEMBER(Years.WINTER, 31);
	
	int dayC;
	Years years;
	
	Month(Years years, int dayC) {
		this.years = years;
		this.dayC = dayC;
	}

	public int getDayC() {
		return dayC;
	}

	public Years getYears() {
		return years;
	}
	public String getYearsSt(){
		return years.toString();
	}

		
	
}
