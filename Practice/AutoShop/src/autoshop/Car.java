package autoshop;
/*	a. Create a super class called Car. The Car class has the following fields and methods.
 * 	int speed; double regularPrice; String color; double getSalePrice(); 
 * 	//filename: Car.java
 * 	//Car class
 */
public class Car 
{
	private int speed;
	private double regularPrice;
	private String color;
	
	public Car (int Speed,double regularPrice,String color) 
	{
		this.speed = Speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	public double getSalePrice() 
	{
		return regularPrice;
	}
}

