package week1.day2.classroom.string;

public class FindTypes {

//		 Here is the input
//		String test = "$$ Welcome to 2nd Class of Automation $$ ";
//
//		// Here is what the count you need to find
//		int  letter = 0, space = 0, num = 0, specialChar = 0;
//
//		// Build the logic to find the count of each
//		/* Pseudo Code:
//			a) Convert the String to character array
//			b) Traverse through each character (using loop)
//			c) Find if the given character is what type using (if)
//					i)  Character.isLetter
//					ii) Character.isDigit
//					iii)Character.isSpaceChar
//					iv) else -> consider as special character
//	 Print the count here
//		System.out.println("letter: " + letter);
//		System.out.println("space: " + space);
//		System.out.println("number: " + num);
//		System.out.println("specialCharcter: " + specialChar);
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] array = test.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (Character.isLetter(array[i])) {
				letter++;
			} else if (Character.isDigit(array[i])) {
				num++;
			} else if (Character.isSpaceChar(array[i])) {
				space++;
			} else {
				specialChar++;
			}
		}
		System.out.println("The number of occurence of letter is: " + letter);
		System.out.println("The number of occurence of space is: " + space);
		System.out.println("The number of occurence of numbers is: " + num);
		System.out.println("The number of occurence of special chars is: " + specialChar);
	}

}