package com.javatpoint.k.instanceinitializerblock;

class Bike7 {
	int speed;

	Bike7() {
		System.out.println("speed is " + speed);
	}

	{
		speed = 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub Bike7 b1=new Bike7();
		Bike7 b2 = new Bike7();
	}

}
