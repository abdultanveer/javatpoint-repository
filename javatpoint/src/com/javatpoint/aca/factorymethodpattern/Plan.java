package com.javatpoint.aca.factorymethodpattern;

//Factory Method Pattern 

import java.io.*;

//Step 1: Create a Plan abstract class. 
abstract class Plan {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}// end of Plan class.
