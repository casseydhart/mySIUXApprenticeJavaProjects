package com.ust;
//Add a pay method to the Employee class
//Output the salary
//PART 2
//Add hours and rate variables (next to the salary)
//refactor the pay method to calculate the pay as hours * rate
public class ObjectsPracticeOct14_4 {

	public static void main(String[] args) {
		NEmployee e1 = new NEmployee("Cassey", 20000.00 , 18.0 , 40.0 );
		e1.works();
		e1.rests();
		e1.training();

		NEmployee e2 = new NEmployee("Dan", 40000.00 , 20.0 , 60.0);
		e2.works();
		e2.rests();
		e2.training();

		NEmployee e3 = new NEmployee("Leslie", 60000.00 , 40.0 , 80.0);
		e3.pay();

	}
}

class NEmployee {
	public String name;
	public double salary;
	public double rate;
	public double hours;
	public NEmployee(String name, double salary, double rate, double hours) {
		this.name = name;
		this.salary = salary;
		this.rate = rate;
		this.hours = hours;
	}
	public void works() {
		System.out.println( name + " is working for" + " " + salary);
	}
	public void rests()  {
		System.out.println( name + " rests on their breaks");
	}
	public void training() {
		System.out.println( name + "is training");	
	}
	public void pay() {
		double wage = hours * rate;
		System.out.println("wage =" + wage);

	}

}