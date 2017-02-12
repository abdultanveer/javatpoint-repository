package com.javatpoint.aae.thiskeyword;

class Student12 {
	int rollno;
	String name;
	float fee;

	Student12(int r, String n, float f) {
		rollno = r;
		name = n;
		fee = f;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class TestThis3 {

	public static void main(String[] args) {
		Student12 s1 = new Student12(111, "ankit", 5000f);
		Student12 s2 = new Student12(112, "sumit", 6000f);
		s1.display();
		s2.display();

	}

}
