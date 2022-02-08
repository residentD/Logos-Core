import Base.MyTheard;
import Base.RunnableThread;

public class Aplication {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		MyTheard myThread = new MyTheard();
		
		RunnableThread runnableThread = new RunnableThread();
		Thread thread = new Thread(runnableThread);
		
		myThread.start();
		myThread.join();
		thread.start();
		thread.join();
		
	}
	

}
