package net.coderdaily.fatory.abstractfactory;


public abstract class SeniorFactory extends AbstractFactory{

	@Override
	public Food createFood() {
		return new IceCream();
	}

	@Override
	public Vehicle createVehicle() {
		return new Plane();
	}
	
}
