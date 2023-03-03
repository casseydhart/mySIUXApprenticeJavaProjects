package interfaces;

import java.util.ArrayList;

public class Zoo 
{

	public static void main(String[] args) 
	{
		// Create an ArrayList of animals
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog("Krypto"));	// append a Dog object to the list
		animals.add(new Cat("Bella")); 	// append a Cat object to the list
		animals.add(new Dog("Rocky")); 	// append a Dog object to the list
		animals.add(new Cat("Molly"));	// append a Cat object to the list
		
		// generically provess each element in arraylist animals
		for(Animal animal: animals)
		{
			System.out.println(animal.getName() + " : " + animal.makeNoise());
			
		}

	}

}
