package net.coderdaily.fatory.abstractfactory;


public class DefaultFactory extends AbstractFactory{

	@Override
	public Food createFood() {
		return new Banana();
	}

	@Override
	public Vehicle createVehicle() {
		return new Car();
	}
	
}
