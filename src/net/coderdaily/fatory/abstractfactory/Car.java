package net.coderdaily.fatory.abstractfactory;

public class Car extends Vehicle{

	@Override
	public void run() {
		System.out.println("car ----from DefaultFactory");
	}
	
}
