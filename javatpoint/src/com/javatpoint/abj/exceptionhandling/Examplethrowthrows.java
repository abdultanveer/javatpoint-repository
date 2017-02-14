package com.javatpoint.abj.exceptionhandling;

class Examplethrowthrows {
	void m() {
		throw new ArithmeticException("sorry");
	}

	void m1() throws ArithmeticException {
		// method code
	}

	void m2() throws ArithmeticException {
		throw new ArithmeticException("sorry");
	}
}
