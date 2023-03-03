package com.ust;
public class Ex08CalculateSalary {
	public static void main(String[] args) {
		double salary = 3000.00;
		double tax1 = (salary*0.2);
		double netSalary = (salary - tax1);
		double tax2 = (salary*0.3);
		double netSalary2 = (salary - tax2);
		if (salary > 2000)
		{
		System.out.printf("Calculated tax = $%,.2f", tax2);
		System.out.println("\n");
		System.out.printf("netSalary2 = $%,.2f", netSalary2);
		}
		else {
		System.out.printf("Calculated tax = $%,.2f", tax1);
		System.out.printf("netSalary = $%,.2f",  netSalary);
		}
	}
}