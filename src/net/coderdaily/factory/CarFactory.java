package net.coderdaily.factory;

public class CarFactory extends VehicleFactory{

	public Moveable create() {
		return new Car();
	}

}
