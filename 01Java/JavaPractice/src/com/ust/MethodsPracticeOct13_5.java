package com.ust;
import java.util.Scanner;
//write a method that accepts two strings and returns the total number of characters of the combined string (ie. the length)
public class MethodsPracticeOct13_5 {

	public static void main(String[] args) {
		int len = clength("jack" , "jill");
		System.out.println("jack"+ "jill =" + len);
		len = clength("tom","jerry");
		System.out.println("tom + jerry =" + len);
	}
	public static int clength(String first, String second) {
		int len = first.length() + second.length();
		return len;
	}
}
