package com.javatpoint.m.runtimepolymorphism;

class Bike3 {
	int speedlimit = 90;
}

class Honda3 extends Bike3 {
	int speedlimit = 150;

	public static void main(String[] args) {
		Bike3 obj = new Honda3();
		System.out.println(obj.speedlimit);// 90

	}

}
