import Base.Collection;
import Base.Iterator;

public class Aplication {

	public static void main(String[] args) {

		Number[] numbers = { 515, 5565, 17789, 144, 298, 47841, 146, 647, 147, 998, 4576, 1389, 478441, 15784, 487451,
				25, 10, 3, };

		Collection coll = new Collection(numbers);

		System.out.println("quest 1 ");

		Iterator iteratorOne = coll.createForwardReplace();

		while (iteratorOne.hasNext()) {
			System.out.println(iteratorOne.next());
		}

		System.out.println("-----------------------");
		System.out.println("quest 2 ");

		Iterator iteratorTwo = coll.createBackwardPara();

		while (iteratorTwo.hasNext()) {
			System.out.println(iteratorTwo.next());
		}

		System.out.println("-----------------------");
		System.out.println("quest 3 ");

		Iterator iteratorThree = new Iterator() {
			private int count = Collection.getNumbers().length - 1;

			@Override
			public Object next() {
				count = count - 3;
				if (Collection.getNumbers()[count + 3].doubleValue() % 2 != 0) {
					System.out.println(Collection.getNumbers()[count + 3]);
				}
				return Collection.getNumbers()[count + 3];

			}

			@Override
			public boolean hasNext() {
				return count >= 0;
			}
		};

		while (iteratorThree.hasNext()) {
			iteratorThree.next();
		}

		Iterator iteratorFour = new FifthCount(numbers);

		System.out.println("-----------------------");
		System.out.println("quest 4 ");

		while (iteratorFour.hasNext()) {
			iteratorFour.next();
		}

		System.out.println("-----------------------");
		System.out.println("quest 5 ");

		Iterator iteratorFive = coll.getStaticClass(numbers);

		while (iteratorFive.hasNext()) {
			iteratorFive.next();
		}

	}

}

class FifthCount implements Iterator {

	private Number[] numbers;
	private int count;

	public FifthCount(Number[] numbers) {
		super();
		this.numbers = numbers;
		this.count = 0;
	}	

	public Number[] getNumbers() {
		return numbers;
	}

	public void setNumbers(Number[] numbers) {
		this.numbers = numbers;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public boolean hasNext() {

		return this.count < this.numbers.length;
	}

	@Override
	public Object next() {
		this.count += 5;
		if (this.numbers[count - 5].doubleValue() % 2 == 0) {
			System.out.println(this.numbers[count - 5].doubleValue() - 100);
		}
		return null;
	}

}
