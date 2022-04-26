package week1.day2.assignments.optional;

import java.util.Arrays;

public class Anagram {
	/*
	 * Pseudo Code
	 * 
	 * Declare a String String text1 = "stops"; Declare another String String text2
	 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
	 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
	 * the arrays has same value
	 * 
	 */
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		// comparing the length of strings
		if (text1.length() == text2.length()) {
			char[] word1 = text1.toCharArray();
			char[] word2 = text2.toCharArray();
			// sorting both the arrays
			Arrays.sort(word1);
			Arrays.sort(word2);
			// comparing the char array
			if (Arrays.equals(word1, word2)) {
				System.out.println("The words " + text1 + " and " + text2 + " are Anagram");
			} else {
				System.out.println("The words " + text1 + " and " + text2 + " are not Anagram");
			}
		} else {
			System.out.println("The length of the strings are not same");
		}
	}

}
