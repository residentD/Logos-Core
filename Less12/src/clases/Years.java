package clases;


public class Years {
	private String yeName;
	
	public Years(String yeName) {
		super();
		this.yeName = yeName;
	}

	public String getYeName() {
		return yeName;
	}

	public void setYeName(String yeName) {
		this.yeName = yeName;
	}

	@Override
	public String toString() {
		return "Years [yeName=" + yeName + "]";
	}
	
	
}
