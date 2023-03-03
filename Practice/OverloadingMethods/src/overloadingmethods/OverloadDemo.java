package overloadingmethods;

public class OverloadDemo
{

	public static void main(String[] args) 
	{
		Overload ref = new Overload();
		
		//	Call all versions of display()
		ref.display();
		ref.display(100);
		ref.display(100, 200);
		ref.display(100.25);
	}
}