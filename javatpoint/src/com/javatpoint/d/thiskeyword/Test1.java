package com.javatpoint.d.thiskeyword;

class A8 {
	A8 getA8() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}
}

class Test1 {

	public static void main(String[] args) {
		new A8().getA8().msg();

	}

}
