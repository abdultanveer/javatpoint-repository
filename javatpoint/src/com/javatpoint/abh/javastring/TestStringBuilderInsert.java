package com.javatpoint.abh.javastring;

//StringBuilder insert() method
class TestStringBuilderInsert {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello ");
		sb.insert(1, "Java");// now original string is changed
		System.out.println(sb);// prints HJavaello
	}

}
