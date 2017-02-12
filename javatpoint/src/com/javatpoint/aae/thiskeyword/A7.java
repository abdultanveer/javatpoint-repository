package com.javatpoint.aae.thiskeyword;

class B {
	A7 obj;

	B(A7 obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println(obj.data);// using data member of A4 class
	}
}

class A7 {
	int data = 10;

	A7() {
		B b = new B(this);
		b.display();
	}

	public static void main(String[] args) {
		A7 a = new A7();

	}

}
