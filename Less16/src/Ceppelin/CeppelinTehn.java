package Ceppelin;

import java.util.Objects;

public class CeppelinTehn extends Ceppelin {

	private int propeller;
	private Ceppelin status;
	private boolean arma;

	public CeppelinTehn() {
		super("Rudy Kydyaplik", "Arma-1918");
		this.propeller = 4;
		this.arma = true;
		this.status = null;
	}

	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}

	public Ceppelin getStatus() {
		return status;
	}

	public void setStatus(Ceppelin status) {
		this.status = status;
	}

	public boolean isArma() {
		return arma;
	}

	public void setArma(boolean arma) {
		this.arma = arma;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(arma, propeller, status);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CeppelinTehn other = (CeppelinTehn) obj;
		return arma == other.arma && propeller == other.propeller && Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "CeppelinTehn [propeller=" + propeller + ", status=" + status + ", arma=" + arma + "]";
	}

	public void myMethod(String a, int... ints) {
		System.out.println(a);
		for (int i : ints) {
			System.out.println(i);
		}
	}

	public void myMethod(int... ints) {
		for (int i : ints) {
			System.out.println(i);
		}
	}

}
