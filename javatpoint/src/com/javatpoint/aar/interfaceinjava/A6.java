package com.javatpoint.aar.interfaceinjava;

interface printable6 {
	void print();
}

class A6 implements printable6 {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		A6 obj = new A6();
		obj.print();
	}

}
