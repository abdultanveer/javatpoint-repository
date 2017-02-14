package com.javatpoint.abh.javastring;

import java.util.StringTokenizer;

public class TestStringTokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my name is hassan", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
