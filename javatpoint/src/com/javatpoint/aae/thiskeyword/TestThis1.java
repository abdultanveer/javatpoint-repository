package com.javatpoint.aae.thiskeyword;

class Student10 {
	int rollno;
	String name;
	float fee;

	Student10(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class TestThis1 {

	public static void main(String[] args) {
		Student10 s1 = new Student10(111, "ankit", 5000f);
		Student10 s2 = new Student10(112, "sumit", 6000f);
		s1.display();
		s2.display();

	}

}
