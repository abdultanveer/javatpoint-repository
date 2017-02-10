package com.javatpoint.m.runtimepolymorphism;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal {
	void eat() {
		System.out.println("eating bread...");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("eating rat...");
	}
}

class Lion extends Animal {
	void eat() {
		System.out.println("eating meat...");
	}
}

class TestPolymorphism3 {

	public static void main(String[] args) {
		Animal a;
		a = new Dog1();
		a.eat();
		a = new Cat();
		a.eat();
		a = new Lion();
		a.eat();

	}

}
