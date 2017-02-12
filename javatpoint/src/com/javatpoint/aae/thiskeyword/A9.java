package com.javatpoint.aae.thiskeyword;

class A9 {
	void m() {
		System.out.println(this);// prints same reference ID
	}

	public static void main(String[] args) {
		A9 obj = new A9();
		System.out.println(obj);// prints the reference ID
		obj.m();

	}

}
