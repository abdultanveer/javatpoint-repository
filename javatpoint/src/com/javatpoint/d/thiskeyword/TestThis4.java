package com.javatpoint.d.thiskeyword;

class A4 {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		// m();//same as this.m()
		this.m();
	}
}

class TestThis4 {

	public static void main(String[] args) {
		A4 a = new A4();
		a.n();
	}

}
