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
		
		System.out.println("���������� �������� = " + Byte.MAX_VALUE + "          �������� �������� = " + Byte.MIN_VALUE);
		System.out.println("���������� �������� = " + Integer.MAX_VALUE + "   �������� �������� = " + Integer.MIN_VALUE);
		System.out.println("���������� �������� = " + Short.MAX_VALUE + "        �������� �������� = " + Short.MIN_VALUE);
		System.out.println("���������� �������� = " + Long.MAX_VALUE + "     �������� �������� = " + Long.MIN_VALUE);
		System.out.println("���������� �������� = " + Double.MAX_VALUE + "     �������� �������� = " + Double.MIN_VALUE);
		
		
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
		System.out.println("�������� �������� = " + min);
		System.out.println("����������� �������� = " + max);
	}

}
