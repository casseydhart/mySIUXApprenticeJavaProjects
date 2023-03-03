package interfaces;

public class Cat implements Animal
{
	private String name; 	// To hold name of cat.
	
	// Constructor that accept name as parameter.
	public Cat(String name)
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
		return "Meow!";
	}
}
