package com.ust;
import java.util.Scanner;
public class Ex10DynamicallyCalculateSale {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Price:");
		String price_s = in.nextLine();
		double price = Double.parseDouble(price_s);
		System.out.println("Enter Quantity:");
		String quantity_s = in.nextLine();
		int quantity = Integer.parseInt(quantity_s);
		double amount_s = price*quantity;
		System.out.printf("Amount:$%.2f",amount_s);
	}
}