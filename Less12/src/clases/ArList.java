package clases;

import java.util.ArrayList;

public class ArList {

	private static final ArrayList<Years> years = new ArrayList<Years>() {
		{
			add(new Years("WINTER"));
			add(new Years("SPRING"));
			add(new Years("SUMMER"));
			add(new Years("AUTUMN"));
		}
	};

	private static final ArrayList<Month> months = new ArrayList<Month>() {
		{
			add(new Month("JANUARY", years.get(0), 31));
			add(new Month("FEBRUARY", years.get(0), 28));
			add(new Month("MARCH", years.get(1), 31));
			add(new Month("APRIL", years.get(1), 30));
			add(new Month("MAY", years.get(1), 31));
			add(new Month("JUNE", years.get(2), 30));
			add(new Month("JULY", years.get(2), 31));
			add(new Month("AUGUST", years.get(2), 31));
			add(new Month("SEPTEMBER", years.get(3), 30));
			add(new Month("OCTOBER", years.get(3), 31));
			add(new Month("NOVEMBER", years.get(3), 30));
			add(new Month("DECEMBER", years.get(0), 31));
		}
	};

	public static ArrayList<Years> getYears() {
		return years;
	}

	public static ArrayList<Month> getMonths() {
		return months;
	}

}
