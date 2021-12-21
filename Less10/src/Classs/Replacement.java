package Classs;

public class Replacement {
	
	private static String replace = "aeiouyаеиіоуяює";
	
	public static String replaced(String string) {
		
		String outStr = "";
		replace = replace + replace.toUpperCase();
		for (char letter : string.toCharArray()) {
			if (replace.contains(String.valueOf(letter))) {
				outStr = outStr + "-";
			}else {
				outStr = outStr + letter;
			}
		}
		return outStr;
	}
}
