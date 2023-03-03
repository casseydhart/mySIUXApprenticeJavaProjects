package com.ust;

public class Ex02CalculateSalary {

	public static void main(String[] args) {
		double salary = 55555.55;
		double expenses = salary*.85;
		System.out.println("expenses"+ " "+expenses);
		double bonus = salary*.15;
		System.out.println("bonus" + " "+ bonus);
		double savings = (salary - expenses) + bonus;
		System.out.println("savings" + " "+ savings);
		
	}

}
