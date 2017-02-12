package com.javatpoint.aar.interfaceinjava;

interface Printable3 {
	void print();
}

interface Showable3 {
	void print();
}

class TestTnterface3 implements Printable3, Showable3 {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		TestTnterface3 obj = new TestTnterface3();
		obj.print();
	}

}
