package com.javatpoint.l.finalkeyword;

class Bike {
	final void run() {
		System.out.println("running");
	}
}

class Honda extends Bike {
	// void run() {
	void run1() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.run();
	}

}
