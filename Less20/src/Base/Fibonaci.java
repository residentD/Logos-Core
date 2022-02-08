package Base;

import java.math.BigInteger;
import java.util.Arrays;

public class Fibonaci {

	private BigInteger[] fiboNumb;

	public Fibonaci(int fiboNumbCount) {
		super();
		this.fiboNumb = new BigInteger[fiboNumbCount];
		fillArray();
	}

	void fillArray() {
		BigInteger n0 = BigInteger.valueOf(1);
		BigInteger n1 = BigInteger.valueOf(1);
		BigInteger n2 = BigInteger.valueOf(0);
		this.fiboNumb[0] = n2;
		if (this.fiboNumb.length > 1)
			this.fiboNumb[1] = n0;
		if (this.fiboNumb.length > 2)
			this.fiboNumb[1] = n1;
		if (this.fiboNumb.length > 3) {

			for (int i = 3; i < this.fiboNumb.length; i++) {

				n2 = n0.add(n1);
				n0 = n1;
				n1 = n2;
				this.fiboNumb[i] = n2;

			}

		}
	}

	public BigInteger[] getFiboNumb() {
		return fiboNumb;
	}

	public void setFiboNumb(BigInteger[] fiboNumb) {
		this.fiboNumb = fiboNumb;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(fiboNumb);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fibonaci other = (Fibonaci) obj;
		return Arrays.equals(fiboNumb, other.fiboNumb);
	}

	@Override
	public String toString() {
		return "Fibonaci [fiboNumb=" + Arrays.toString(fiboNumb) + "]";
	}

}
