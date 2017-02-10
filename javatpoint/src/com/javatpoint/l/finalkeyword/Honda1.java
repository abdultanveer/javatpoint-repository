package com.javatpoint.l.finalkeyword;

final class Bike1 {
}

//class Honda1 extends Bike1{ 
//can't extends from final class
class Honda1 {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String[] args) {
		Honda1 honda = new Honda1();
		honda.run();

	}

}
