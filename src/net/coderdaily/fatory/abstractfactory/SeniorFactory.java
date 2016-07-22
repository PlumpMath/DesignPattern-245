package net.coderdaily.fatory.abstractfactory;


public class SeniorFactory extends AbstractFactory{

	@Override
	public Food createFood() {
		return new IceCream();
	}

	@Override
	public Vehicle createVehicle() {
		return new Plane();
	}
	
}
