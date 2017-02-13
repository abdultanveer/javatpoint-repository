package com.javatpoint.aau.accessmodifiers;

class ASimple1 {
	private ASimple1() {
	}// private constructor

	void msg() {
		System.out.println("Hello java");
	}
}

public class Simple1 {

	public static void main(String[] args) {
		//ASimple1 obj = new ASimple1();// Compile Time Error

	}

}
