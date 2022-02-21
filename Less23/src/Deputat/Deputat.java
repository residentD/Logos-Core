package Deputat;

import java.util.Scanner;

import Human.Human;

public class Deputat extends Human implements Comparable<Deputat> {

	private String firstName;
	private String lastName;
	private boolean habarnik;
	private double habar;

	public Deputat(double weight, double height, String firstName, String secondName, boolean habarnik) {
		super(weight, height);
		this.firstName = firstName;
		this.lastName = secondName;
		this.habarnik = habarnik;
		this.habar = 0;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	public boolean isHabarnik() {
		return habarnik;
	}

	public void setHabarnik(boolean habarnik) {
		this.habarnik = habarnik;
	}

	public double getHabar() {
		return habar;
	}

	public void setHabar(double habar) {
		this.habar = habar;
	}

	@Override
	public String toString() {
		return "\neDeputat [firstName=" + firstName + ", lastName=" + lastName + ", habarnik=" + habarnik + ", habar="
				+ habar + "]";
	}

	public void giveHabar() {
		if (!this.habarnik) {
			System.out.println("Цей депутат не бере хабарів");
		} else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Введіть суму хабаря");
			double habarSum = scanner.nextDouble();
			if (habarSum > 5000) {
				System.out.println("Поліція ув’язнить депутата");
			} else {
				this.habar += habarSum;
			}
		}
	}

	@Override
	public int compareTo(Deputat o) {
		if (this.getFirstName().compareToIgnoreCase(o.getFirstName()) > 0) {
			return 1;

		} else if (this.getFirstName().compareToIgnoreCase(o.getFirstName()) < 0) {
			return -1;

		} else {
			if (this.getLastName().compareToIgnoreCase(o.getLastName()) > 0) {
				return 1;

			} else if (this.getLastName().compareToIgnoreCase(o.getLastName()) < 0) {
				return -1;
			}

		}
		return 0;

	}
	
}