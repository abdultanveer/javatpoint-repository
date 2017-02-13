package com.javatpoint.abg.overloadingvsoverriding;

//Java Method Overriding example
class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("eating bread...");
	}
}
