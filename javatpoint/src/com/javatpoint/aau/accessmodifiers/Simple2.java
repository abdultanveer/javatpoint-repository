package com.javatpoint.aau.accessmodifiers;

class ASimple2 {
	protected void msg() {
		System.out.println("Hello java");
	}
}

public class Simple2 extends ASimple2 {
//	void msg() {
//		System.out.println("Hello java");
//	}// C.T.Error

	public static void main(String[] args) {
		Simple2 obj = new Simple2();
		obj.msg();
	}

}
