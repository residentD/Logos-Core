package Classs;

public class PalindromFiveReverse {

	public static void poli(String s) {
		poli(new StringBuilder(s));
	}

	public static void poli(StringBuilder inputStringBuilder) {

		if (inputStringBuilder.length() != 5) {
			System.out.println("\"" + inputStringBuilder + "\"" + " неправильна кількість букв");
		} else {

			StringBuilder reversedStringBuilder = new StringBuilder(inputStringBuilder.toString()).reverse();

			if (inputStringBuilder.toString().equalsIgnoreCase(reversedStringBuilder.toString())) {
				System.out.println("\"" + inputStringBuilder + "\"" + " то є поліндром");
			} else {
				System.out.println("\"" + inputStringBuilder + "\"" + " то не є поліндром");
			}

		}

	}

}
