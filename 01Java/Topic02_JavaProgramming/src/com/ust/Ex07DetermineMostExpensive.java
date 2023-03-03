package com.ust;

public class Ex07DetermineMostExpensive {

	public static void main(String[] args) {
	    double product1 = 3000.00;
	    double product2 = 2500.00;
	    if (product1 > product2) 
	    {
	    	System.out.printf("product1 $%,.2f is more expensive than product2 $%,.2f", product1, product2);
	    }
	    else
	    {
	    System.out.println("\n");
	    	System.out.printf("product2 $%,.2f is less expensive than product1 $%,.2f", product1, product2);
	    }
	}
}