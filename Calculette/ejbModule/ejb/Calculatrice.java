package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calculatrice
 */
@Stateless
@LocalBean
public class Calculatrice implements CalculatriceRemote, CalculatriceLocal {

	public int addition(int x, int y) {
		int add = x + y;
		return add;
	}

	public int soustraction(int x, int y) {
		int sous = x - y;
		return sous;
	}

	public int division(int x, int y) {
		if (y != 0) {
			int div = x / y;
			return div;
		} else {
			System.out.println("division impossible");
			return 0;
		}
	}

	public int multiplication(int x, int y) {
		int mult = x * y;
		return mult;
	}

	/**
	 * Default constructor.
	 */
	public Calculatrice() {
		// TODO Auto-generated constructor stub
	}

}
