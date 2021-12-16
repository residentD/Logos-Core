package Class;

public class Methods {
	
	public void plus (double a, double b) throws MyException {

		if ((a < 0) & (b < 0)){
			throw new IllegalArgumentException();
		}else if (((a == 0) & (b != 0)) | ((a != 0) & (b == 0))) {
			throw new ArithmeticException();			
		}else if ((a == 0) & (b == 0)) {
			throw new IllegalArgumentException();
		} else if((a > 0) & (b > 0)) {
		    throw new MyException("MyException");
		}else {System.out.println(a - b);}
	}
	
	public void minus (double a, double b) throws MyException {

		if ((a < 0) & (b < 0)){
			throw new IllegalArgumentException();
		}else if (((a == 0) & (b != 0)) | ((a != 0) & (b == 0))) {
			throw new ArithmeticException();			
		}else if ((a == 0) & (b == 0)) {
			throw new IllegalArgumentException();
		} else if((a > 0) & (b > 0)) {
		    throw new MyException("MyException");
		}else {System.out.println(a - b);}
	}
	
	public void multiply (double a, double b) throws MyException {

		if ((a < 0) & (b < 0)){
			throw new IllegalArgumentException();
		}else if (((a == 0) & (b != 0)) | ((a != 0) & (b == 0))) {
			throw new ArithmeticException();			
		}else if ((a == 0) & (b == 0)) {
			throw new IllegalArgumentException();
		} else if((a > 0) & (b > 0)) {
		    throw new MyException("MyException");
		}else {System.out.println(a * b);}
	}
	
	public void divide (double a, double b) throws MyException {

		if ((a < 0) & (b < 0)){
			throw new IllegalArgumentException();
		}else if (((a == 0) & (b != 0)) | ((a != 0) & (b == 0))) {
			throw new ArithmeticException();			
		}else if ((a == 0) & (b == 0)) {
			throw new IllegalArgumentException();
		} else if((a > 0) & (b > 0)) {
		    throw new MyException("MyException");
		}else {System.out.println(a / b);}
	}
	

}
