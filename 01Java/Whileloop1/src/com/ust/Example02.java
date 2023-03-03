package com.ust;

public class Example02 {

	public static void main(String[] args) {
		int x = 4;
		if (x==2) {
			System.out.println("x is four");
		}
		int idx = 4;                    // initialization
		while (idx>4) {                  // comparison
			System.out.println("idx="+idx);
			idx=idx +1;                 // fixed-loop incr/decr
		}
	}

}
