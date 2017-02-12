package com.javatpoint.aap.instanceofoperator;

class Animal3 {
}

class Dog3 extends Animal3 {
	static void method(Animal3 a) {
		if (a instanceof Dog3) {
			Dog3 d = (Dog3) a;// downcasting
			System.out.println("ok downcasting performed");
		}
	}

	public static void main(String[] args) {
		Animal3 a = new Dog3();
		Dog3.method(a);
	}

}
