package com.javatpoint.abh.javastring;

//String Concatenation by + (string concatenation) operator
class TestStringConcatenation2 {

	public static void main(String[] args) {
		String s = 50 + 30 + "Sachin" + 40 + 40;
		// Note: After a string literal, all the + will be treated as string
		// concatenation operator.
		System.out.println(s);// 80Sachin4040
	}

}
