package ust.com;

public class Exercises_1 {

	public static void main(String[] args) {
		System.out.println("main: statement 1");
		System.out.println("main: statement 2");
		int result = addNumbers(1, 2);
		System.out.println("result=" + result);
		result = addNumbers(3, 4);
		System.out.println("result=" + result);
		System.out.println("main: statement 3");
	}
	public static int addNumbers(int a, int b) {   // int a = 1; int b = 2  
		System.out.println("a=" + a + ",b=" + b);
		return a + b;								// returns 3
	} 

	    public static int Add (int x, int y) {
	        int sum = x+y;
	        return sum;
	}

}
