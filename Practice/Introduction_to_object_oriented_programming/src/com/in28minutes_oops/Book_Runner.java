package com.in28minutes_oops;

public class Book_Runner {

	public static void main(String[] args) {

		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.open();
		effectiveJava.open();
		cleanCode.open();

		artOfComputerProgramming.numberOfCopiesofBook = 12;
		effectiveJava.numberOfCopiesofBook = 10;
		cleanCode.numberOfCopiesofBook = 5;

	}

}
