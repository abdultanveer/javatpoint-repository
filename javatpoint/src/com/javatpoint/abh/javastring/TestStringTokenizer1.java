package com.javatpoint.abh.javastring;

import java.util.StringTokenizer;

public class TestStringTokenizer1 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my,name,is,hassan");

		// printing next token
		System.out.println("Next token is : " + st.nextToken(","));
	}

}
