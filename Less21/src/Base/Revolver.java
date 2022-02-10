package Base;

import java.time.LocalDate;

public class Revolver {
	
	@MyAnotacia("Revolver name")
	private String name;
	@MyAnotacia("Calibr")
	private int calibr;
	@MyAnotacia("Data vupysky")
	private LocalDate vupysk;
	
	private LocalDate newModel;
	
		
	public Revolver(String name, int calibr, LocalDate vupysk) {
		super();
		this.name = name;
		this.calibr = calibr;
		this.vupysk = vupysk;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCalibr() {
		return calibr;
	}


	public void setCalibr(int calibr) {
		this.calibr = calibr;
	}


	public LocalDate getVupysk() {
		return vupysk;
	}


	public void setVupysk(LocalDate vupysk) {
		this.vupysk = vupysk;
	}


	public LocalDate getNewModel() {
		return newModel;
	}


	public void setNewModel(LocalDate newModel) {
		this.newModel = newModel;
	}
	
	public void nModel() {
		this.newModel = LocalDate.now();
	}


	@Override
	public String toString() {
		return "Revolver [name=" + name + ", calibr=" + calibr + ", vupysk=" + vupysk + ", newModel=" + newModel + "]";
	}
	
	
	
	
	
}
