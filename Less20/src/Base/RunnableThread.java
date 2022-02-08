package Base;

import java.math.BigInteger;
import java.util.Scanner;

public class RunnableThread implements Runnable {

	private int numbCount;
	private int chislo;

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("RunnableThread");
		System.out.println("Тиць число - ");
		this.numbCount = scanner.nextInt();
		Fibonaci fibonaci = new Fibonaci(this.numbCount);
		BigInteger[] array = fibonaci.getFiboNumb();

		System.out.println("потік Runnable - ");
		for (int i = array.length - 1; i >= 0; i--) {
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

	public RunnableThread(){
		super();
		this.chislo = 500;
	}
	
	
}
