package clases;

import java.util.Random;

public class Rando {
	
	public static int getInt(int min, int max) {
		if(min >= max) {
			throw new IllegalArgumentException("min value it's not correct");
		}
		
		Random ran = new Random();
		return ran.nextInt(max - min + 1) + min;
	}

}
