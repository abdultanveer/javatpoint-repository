package com.javatpoint.m.runtimepolymorphism;

class Animal3 {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog3 extends Animal3 {
	void eat() {
		System.out.println("dog is eating...");
	}
}

class BabyDog1 extends Dog3 {

	public static void main(String[] args) {
		Animal3 a = new BabyDog1();
		a.eat();

	}

}
