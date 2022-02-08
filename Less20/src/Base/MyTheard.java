package Base;

import java.math.BigInteger;
import java.util.Scanner;

public class MyTheard extends Thread {
	private int numbCount;
	private int chislo;
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("MyThread");
		System.out.println("Тиць число - ");
		this.numbCount = scanner.nextInt();
		Fibonaci fibonaci = new Fibonaci(this.numbCount);
		BigInteger[] array = fibonaci.getFiboNumb();
		
		System.out.println("потік Thread - ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
			
			try {
				Thread.sleep(this.chislo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Fin");
		System.out.println("--------------------------");
		
	}
	public MyTheard() {
		super();
		this.chislo = 500;
	}
	

}
