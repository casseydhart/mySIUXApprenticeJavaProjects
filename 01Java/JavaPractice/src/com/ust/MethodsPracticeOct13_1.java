package com.ust;

public class MethodsPracticeOct13_1 {

	public static void main(String[] args) {
		printHeader("UST");
		printBody();
		printFooter("Terms of use","Privacy Policy");
	}
	public static void printHeader(String corpName) {
		System.out.println(corpName);
	}
	public static void printBody() {
		System.out.println("printBody called");
	}
	public static void printFooter(String terms, String privacy) {
		System.out.println(terms + " " + privacy);
	}
}