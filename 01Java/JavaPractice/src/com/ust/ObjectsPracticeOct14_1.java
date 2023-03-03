package com.ust;

public class ObjectsPracticeOct14_1 {
//public class DoorExample {
public static void main(String[] args) {
			

				Door door1 = new Door();
				door1.location = "bedroom";
				door1.open();
				door1.close();
			}

		}
		class Door {
			public String location;
			public void open() {
				System.out.println(location + " door opened");
			}
			public void close() {
				System.out.println(location + " door closed");
			}	
			public void lock() {
				System.out.println(location + " door locked");
			}
			public void unlock() {
				System.out.println(location + " door unlocked");
			}
		}

	}

}
