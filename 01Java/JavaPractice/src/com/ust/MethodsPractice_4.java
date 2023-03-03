package com.ust;

import java.util.Scanner;
//Write a method method named promptUser that passes a string parameter that prompts the user to enter a string, reads an input from a user using Scanner and returns the String
public class MethodsPractice_4 {

	public static void main(String[] args) {
		//while (i<3) { or (true) - 2 different other ways to write it
		String name = promptUser ("Enter a name>");
		String ageS = promptUser ("Enter an age>");
		int age = Integer.parseInt(ageS);
	}
	public static String promptUser(String prompt) { //prompt is allocating memory to "Enter Name"
		Scanner in = new Scanner(System.in);
		System.out.println(prompt); //prompt is towards the console display
		String line = in.nextLine();
		return line;
	}

}
