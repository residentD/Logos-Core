package clases;

import interfaces.Randomnes;

public class ControlAir implements Randomnes {

	public void flyUp(String name) {
		double distance = getRando(1, 150);
		System.out.format("airplane " + name + " move up %.2f %n", distance);

	}

	public void flyDown(String name) {
		double distance = getRando(1, 150);
		System.out.format("airplane " + name + " move down %.2f %n", distance);

	}

	public void flyLeft(String name) {
		double distance = getRando(1, 150);
		System.out.format("airplane " + name + " move left %.2f %n", distance);

	}

	public void flyRight(String name) {
		double distance = getRando(1, 150);
		System.out.format("airplane " + name + " move right %.2f %n", distance);

	}

	@Override
	public double getRando(int min, int max) {
		double rand = min + (double) (Math.random() * max);
		return rand;
	}

}