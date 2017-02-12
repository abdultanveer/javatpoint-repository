package com.javatpoint.aap.instanceofoperator;

class Animal4 {
}

class Dog4 extends Animal4 {
	static void method(Animal4 a) {
		Dog4 d = (Dog4) a;// downcasting
		System.out.println("ok downcasting performed");
	}

	public static void main(String[] args) {
		Animal4 a = new Dog4();
		Dog4.method(a);
	}

}
