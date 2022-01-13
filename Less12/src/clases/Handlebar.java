package clases;

public class Handlebar {
	private static String[] materials = {"Tryapka", "Leather", "Aluminium", "Titan", "Sunya isolenta"};
	
	private int diametr;
	private String material;
	

	public Handlebar(int diametr, String material) {
		super();
		this.diametr = diametr;
		this.material = material;
	    }
	
	public Handlebar() {
		super();
		this.diametr = Rando.getInt(25, 50);
		this.material = materials[Rando.getInt(0, materials.length - 1)];
	}

	@Override
	public String toString() {
		return "Handlebar [diametr=" + diametr + ", material=" + material + "]";
	}

	
	
	
	
}
