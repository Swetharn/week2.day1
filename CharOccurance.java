package week1.day2.classroom.string;

public class CharOccurance {

		/*
		 * Check number of occurrences of a char (eg 'e') in a String 
		 * String str ="welcome to chennai"; 
		 * declare and initialize a variable count to store the number of occurrences
		 * convert the string into char array
		 * get the length of the array 
		 * traverse from 0 till the array length 
		 * Check the char array has the particular char in it 
		 * if is has increment the count 
		 * print the count out of the loop
		 */
	public static void main(String[] args) {
		String str= "welcome to chennai";
		int count=0;
		char[] array= str.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(array[i]=='e') {
				count++;
			}
		}
		System.out.println("The no of 'e' in the String "+str+ " is "+count);	
	}

}