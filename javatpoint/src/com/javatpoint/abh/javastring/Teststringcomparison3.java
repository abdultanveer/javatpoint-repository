package com.javatpoint.abh.javastring;

//String compare by == operator
class Teststringcomparison3 {

	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		
		// System.out.println(s1.hashCode());
		// System.out.println(s2.hashCode());
		// System.out.println(s3.hashCode());
		
		System.out.println(s1 == s2);// true (because both refer to same
										// instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance
										// created in nonpool)

	}

}
