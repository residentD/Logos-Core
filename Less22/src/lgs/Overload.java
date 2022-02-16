package lgs;

public class Overload {
	
	private String login;
	private int number;
	private String sex;
	
	public Overload(String login, int number, String sex) {
		super();
		this.login = login;
		this.number = number;
		this.sex = sex;
	}
	
	public Overload(String login, int number) {
		this(login, number, "sex");
	}

	@Override
	public String toString() {
		return "Overload [login=" + login + ", number=" + number + ", sex=" + sex + "]";
	}
	

	
	
}
