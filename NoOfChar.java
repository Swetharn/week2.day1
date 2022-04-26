package week2.day1;

public class NoOfChar {
	public static void main(String[] args) {
		int count = 0;
		String name = "testleaf";
		String text = "Testleaf is situated in twin towers near teynampet";
		char[] array = name.toCharArray();
		String[] startsWith = text.split(" ");
		// prints the no of 'e' in testleaf
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'e') {
				count++;
			}
		}
		System.out.println("The no of 'e' in " + name + " is " + count);
		// prints the words starting with 't' in string text
		System.out.println("The words starting with 't' are ");
		for (int j = 0; j < startsWith.length; j++) {
			if (startsWith[j].startsWith("t") || startsWith[j].startsWith("T")) {
				System.out.println(startsWith[j]);
			}
		}
	}
}
