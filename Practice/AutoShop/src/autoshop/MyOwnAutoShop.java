package autoshop;

import java.util.ArrayList;

public class MyOwnAutoShop 
{
	int Speed;
	double regularPrice;
	String color;
	int year;
	int manufacturerDiscount;

	public static void main(String[] args) 
	{
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Sedan(160, 20000, "Red", 10));
		cars.add(new Ford (156,4452.0,"Black",2005, 10));
		cars.add(new Ford (155,5000.0,"Pink",1998, 5));
		cars.add(new Car (555, 56856.0, "Red"));
		
		for (Car car: cars) 
		{
		System.out.printf("MySedan Price %.2f\n", mySedan.getSalePrice());
		System.out.printf("MyFord1 Price %.2f\n", myFord1.getSalePrice());
		System.out.printf("MyFord2 Price %.2f\n", myFord2.getSalePrice());
		System.out.printf("MyCar Price %.2f\n", myCar.getSalePrice());
	}

}
