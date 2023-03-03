package com.ust;
public class Ex15ReverseLooping {
	public static void main( String[] args) {
		int idx = 0;   					// initialization  [ 5 ]
			while (idx < 20)  {				// comparison
				System.out.println(idx);
				idx = idx;				// fixed-loop incr/decr
			}
														//	int;       compare;  incr/decr
			for (int idx2 = 0; idx2 < 5; idx2 = idx2 + 1) {
				System.out.println(idx2);
			}
		}
	}