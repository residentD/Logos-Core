package Less1;

public class Trash {
	
public static void main(String[] args) {
		
		int n = 5656;
		Byte b = 120;
		short s = 1500;
		long l = 564774;
		float f = 1;
		double d = 1.35;
		char c = 'h';
		boolean b1 = true;
		
		System.out.println("максимальне значення = " + Byte.MAX_VALUE + "          мінімальне значення = " + Byte.MIN_VALUE);
		System.out.println("максимальне значення = " + Integer.MAX_VALUE + "   мінімальне значення = " + Integer.MIN_VALUE);
		System.out.println("максимальне значення =  " + Short.MAX_VALUE + "        мінімальне значення = " + Short.MIN_VALUE);
		System.out.println("максимальне значення =  " + Long.MAX_VALUE + "     мінімальне значення = " + Long.MIN_VALUE);
		System.out.println("максимальне значення =  " + Double.MAX_VALUE + "     мінімальне значення = " + Double.MIN_VALUE);
		
		
		int []maxMin = {25, 255, 6, -215, 25, 1045, 1044, -2, 687, 999};
		int max ;
		int min ;
		min = max= maxMin[0];
		
		for (int i = 1; i < 10; i++) {
			if (maxMin[i] < min)
				min = maxMin[i];
			if (maxMin[i] > max)
				max = maxMin[i];
		}
		System.out.println("мінімальне значення = " + min);
		System.out.println("максимальне значення = " + max);
	}

}
