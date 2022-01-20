package Database;

import java.util.Comparator;

public class MechaComparator implements Comparator<Mechanism> {
	private int type;
	
	public MechaComparator(int type) {
		super();
		this.type = type;
	}

	@Override
	public int compare(Mechanism ar1, Mechanism ar2) {
		int res = 0;
		switch (this.type) {
		case 1:{
			res = (ar1.getName().compareToIgnoreCase(ar2.getName()) > 0) ? 1 : -1;
					break;
		}
		case 2:{
			res = (ar1.getLenght() > ar2.getLenght()) ? 1 : -1;
			break;
		}
		case 3:{
			res = (ar1.getWidth() > ar2.getWidth()) ? 1 : -1;
			break;
		}
		case 4:{
			res = (ar1.getWeight() > ar2.getWeight()) ? 1 : -1;
			break;
		}		
		}
				
		return res;
	}
	

}
