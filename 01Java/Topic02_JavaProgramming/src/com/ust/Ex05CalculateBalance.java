package com.ust;

public class Ex05CalculateBalance {

	public static void main(String[] args) {
		int funds = 1000;
		int necktie = (funds/75);
	    int spent = (necktie*75);
	   	int balance = (funds - spent);
		System.out.println("balance" + " "+ balance);

	}

}
