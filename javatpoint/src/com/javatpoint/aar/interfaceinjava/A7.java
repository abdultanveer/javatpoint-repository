package com.javatpoint.aar.interfaceinjava;

interface Printable7 {
	void print();
}

interface Showable7 {
	void show();
}

class A7 implements Printable7, Showable7 {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		A7 obj = new A7();
		obj.print();
		obj.show();
	}

}
