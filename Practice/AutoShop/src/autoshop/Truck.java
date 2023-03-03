package autoshop;
/**
 * b. Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
 * int weight; double getSalePrice(); //Ifweight>2000,10%discount.Otherwise,20%discount.
 * //filename: Truck.java 
 * // Truck class, subclass of Car
 */
public class Truck extends Car
{
	private int weight;
	
	public Truck (int Speed,double regularPrice,String color, int weight) 
	{
		super(Speed,regularPrice,color);
		this.weight = weight;
	}
	public double getSalePrice() 
	{
		if (weight > 2000)
		{
			return super.getSalePrice() - (0.1 * super.getSalePrice());
		}
	else 
	{
		return super.getSalePrice();
	
		}
	}
}
