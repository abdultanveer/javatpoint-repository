package com.javatpoint.aae.thiskeyword;

class S2 {

	void m(S2 obj) {
		System.out.println("method is invoked");
		//System.out.println("3");
	}

	void p() {
		//System.out.println("2");
		m(this);
		//System.out.println("4");
	}

	public static void main(String[] args) {
		S2 s1 = new S2();
		//System.out.println("1");
		s1.p();
		//System.out.println("5");

	}

}
