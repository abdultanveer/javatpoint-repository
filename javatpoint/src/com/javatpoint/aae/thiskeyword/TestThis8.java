package com.javatpoint.aae.thiskeyword;

class Student14 {
	int rollno;
	String name, course;
	float fee;

	Student14(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	Student14(int rollno, String name, String course, float fee) {
		/*
		 * this.fee = fee; this(rollno, name, course);// C.T.Error
		 */

		this(rollno, name, course);// C.T.Error
		this.fee = fee;

	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

class TestThis8 {

	public static void main(String[] args) {
		Student14 s1 = new Student14(111, "ankit", "java");
		Student14 s2 = new Student14(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();

	}

}
