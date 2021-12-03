package Interface2;

import interface1.Numerable;

public class MyCalculator implements Numerable {

	@Override
	public double Pl(double x, double y) {
		return x + y;
	}

	@Override
	public double Mn(double x, double y) {
		return x - y;
	}

	@Override
	public double Mlp(double x, double y) {
		return x * y;
	}

	@Override
	public double Dvd(double x, double y) {
		return x / y;
	}
	

}
