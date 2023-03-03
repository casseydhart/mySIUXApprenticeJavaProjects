package com.ust;
import java.util.Scanner;
public class Ex11DynamicallyCalculateSale {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Price:");
		String price_s = in.nextLine();
		double price = Double.parseDouble(price_s);
		System.out.println("Enter Quantity:");
		String quantity_s = in.nextLine();
		int quantity = Integer.parseInt(quantity_s);
        double amount = price*quantity;
        System.out.println("Amount:" + amount);
        System.out.println("Enter Discount Rate:");
        String discountr_s = in.nextLine();
        double discountr = Double.parseDouble(discountr_s);
        double netamount = amount - discountr;
        System.out.printf("Net Amount $%.2f", netamount);
		}
}