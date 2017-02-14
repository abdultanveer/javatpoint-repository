package com.javatpoint.abh.javastring;

//Java String intern() method
public class TestIntern {

	public static void main(String[] args) {
		String s = new String("Sachin");
		String s2 = s.intern();
		System.out.println(s2);// Sachin
	}

}
