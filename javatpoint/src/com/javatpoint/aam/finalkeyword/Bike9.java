package com.javatpoint.aam.finalkeyword;

class Bike9 {
	final int speedlimit = 90;// final variable

	void run() {
		// speedlimit = 400;
		System.out.println("Can't change speedlimit value");
	}

	public static void main(String[] args) {
		Bike9 obj = new Bike9();
		obj.run();

	}

}
