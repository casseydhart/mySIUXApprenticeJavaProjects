package com.ust;

public class Ex13SupermarketComparison {

	public static void main(String[] args) {
		int supermarket1_s = 100*150;
		int supermarket2_s = 115*75;
		int diffsupermarket2 = supermarket1_s - supermarket2_s;
		if(supermarket1_s>supermarket2_s) {
		System.out.println("Supermarket1's sales of"+ " " +supermarket1_s + " "+ "is greater than supermarket2's sales of" + " " + supermarket2_s);
		int total_d = diffsupermarket2/75;
		System.out.println("Additional products suppermarket2 needs to sell to equal to supermarket1 is" + " "+ total_d);		
		}
	}

}