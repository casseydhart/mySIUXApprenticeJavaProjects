package interfaces;

public class Dog implements Animal
{
	private String name; 	// To hold name of dog.
	
	// Constructor that accept name as parameter.
	public Dog(String name)
	{
		this.name = name;
	}
	
	// method required to implement the animal interface.
	public String getName()
	{
		return name;
	}
	
    // method required to implement the animal interface.
	public String makeNoise()
	{
		return "woof! woof!";
	}	
}
