package com.javatpoint.abh.javastring;

//StringBuilder delete() method
class TestStringBuilderDelete {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.delete(1, 3);
		System.out.println(sb);// prints Hlo
	}

}
