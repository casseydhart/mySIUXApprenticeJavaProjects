package com.ust;
import java.util.Scanner;
//Write a value-returning method, isVowel that accepts a char parameter and returns true if a given character is a vowel, and otherwise returns false
//Within the main() method, accept a String parameter from user and count number of vowels in that string
public class MethodsPractice_6 {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		//System.out.println("Enter a string (or q to quit)>");
		//String line = in.nextLine();
			//0123
		String line = "mike";
		boolean containsVowel = false;
		int vowels = 0;
		for (int i=0; i<line.length(); i++) {
			char letter = line.charAt(i);
			if (isVowel(letter)) {
				containsVowel= true;
				vowels++;
			}
		}
		System.out.println("vowels="+ vowels);
	}
	public static boolean isVowel (char letter) {
		//012345
		String vowel = "aeiouy";
		boolean result = false;
		int idx = 0;
		while (idx< vowel.length()) {
			char vletter = vowel.charAt(idx);
			if (vletter == letter) {
				result = true;
				break;
			}
			idx++;
		}
		return result;
	}

}
