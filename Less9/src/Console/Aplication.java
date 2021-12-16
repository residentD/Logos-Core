/**
 * Less9
 * 
 * */
package Console;

import Class.Menu;
import Class.Methods;
import Class.MyException;

/**
 * @since JDK 11
 * @version 1.1
 * */

public class Aplication {
	
	/**
	 * @exception MyException main
	 * */

	public static void main(String[] args) throws MyException {
		Menu.play();
		
		Methods m = new Methods();
		
		m.plus(500, -800);
		m.minus(-1540, 654);
		m.multiply(657, -5411);
		m.divide(544, -222);
		m.plus(0, 0);
	    m.minus(-2, -5);
		m.multiply(657, 5411);
		m.divide(0, 222);
	}

}
