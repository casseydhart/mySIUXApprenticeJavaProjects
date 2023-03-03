package com.ust;

public class Example01 {
	public static void main( String[] args) {
        int x = 5;
        if (x==5) {
        	System.out.println ("x is five");
        }
        int idx = 0;                    // initialization
        while (idx < 5) {               // comparison
        	System.out.println("idx=" + idx);
        	idx = idx + 1;              // fixed-loop incr/decr
        }
	}
        
}