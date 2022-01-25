package Ceppelin;

import java.util.Objects;

public class Ceppelin {

	private String nameCeppelin;
	private String model;

	public Ceppelin(String nameCeppelin, String model) {
		super();
		this.nameCeppelin = nameCeppelin;
		this.model = model;
	}	

	public String getNameCeppelin() {
		return nameCeppelin;
	}

	public void setNameCeppelin(String nameCeppelin) {
		this.nameCeppelin = nameCeppelin;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameCeppelin, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ceppelin other = (Ceppelin) obj;
		return Objects.equals(nameCeppelin, other.nameCeppelin) && model == other.model;
	}

	@Override
	public String toString() {
		return "Ceppelin [nameCeppelin=" + nameCeppelin + ", years=" + model + "]";
	}

}
