package com.javatpoint.aau.accessmodifiers;

class ASimple {
	private int data = 40;

	void msg() {
		System.out.println("Hello java");
	}
}

public class Simple {

	public static void main(String[] args) {
		ASimple obj = new ASimple();
		// System.out.println(obj.data);// Compile Time Error
		obj.msg();// Compile Time Error
	}

}
