package autoshop;
/**
 * c. Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
 * int year; intmanufacturerDiscount;
 * doublegetSalePrice(); //FromthesalepricecomputedfromCarclass,subtractthemanufacturerDiscount.
 * //filename: Ford.java
 * // Ford class, subclass of Car
 */
public class Ford extends Car
{
	private int year;
	private int manufacturerDiscount;
	
	public Ford (int Speed,double regularPrice,String color, int year, int
	manufacturerDiscount) 
	{
		super (Speed,regularPrice,color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	public double getSalePrice() 
	{
		return (super.getSalePrice() - manufacturerDiscount);
	}
}
