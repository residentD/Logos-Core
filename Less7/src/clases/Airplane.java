package clases;

public abstract class Airplane {
	
	private double lenght;
	private double width;
	private double weight;
	
	
	public Airplane(double lenght, double width, double weight) {
		super();
		this.lenght = lenght;
		this.width = width;
		this.weight = weight;
	}
	
	public abstract void startMotor();
	public abstract void takeoff();
	public abstract void landing();
	

}
