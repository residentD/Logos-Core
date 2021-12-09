package clases;

import interfaces.NucBomb;
import interfaces.Stels;
import interfaces.Turbo;

public class Sy27 extends Airplane implements NucBomb, Stels, Turbo {

	private String name;
	private int topSpeed;
	private String color;
	private ControlAir controlAir = new ControlAir();

	public Sy27(String name, int topSpeed, String color) {
		super(17.2, 15.3, 1210);
		this.name = name;
		this.topSpeed = topSpeed;

	}

	public void flyUp() {
		this.controlAir.flyUp(this.name);
	}

	public void flyDown() {
		this.controlAir.flyDown(this.name);
	}

	public void flyLeft() {
		this.controlAir.flyLeft(this.name);
	}

	public void flyRight() {
		this.controlAir.flyRight(this.name);
	}

	@Override
	public void turbo() {
		double pushTurbo = controlAir.getRando(10, 30);
		System.out.format("Швидкість після прискорення %.2f %n " , this.topSpeed * pushTurbo);

	}

	@Override
	public void stels() {
		int minut = (int) controlAir.getRando(1, 60);
		System.out.println("Режим стелсу " + minut + " хвилин");

	}

	@Override
	public void nucBomb() {
		int bombs = (int) controlAir.getRando(1, 10);
		System.out.println("Кількість бомб " + bombs);
	}

	@Override
	public void startMotor() {
		int second = (int) controlAir.getRando(20, 88);
		System.out.println("Час до старту " + second + " сек");
	}

	@Override
	public void takeoff() {
		double km = controlAir.getRando(1, 1000);
		System.out.format("Вистачить палива на %.2f %n ", km);
	}

	@Override
	public void landing() {
		System.out.println("Літак " + this.name + " приземлився");

	}

}
