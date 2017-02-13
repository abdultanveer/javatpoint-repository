package com.javatpoint.aba.javarecursion;

//Java Recursion Example 1: Infinite times
public class RecursionExample1 {
	static void p() {
		System.out.println("hello");
		p();
	}

	public static void main(String[] args) {
		p();
	}

}
