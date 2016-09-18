package net.coderdaily.factory;

public class Test {
	public static void main(String[] args) {
		//只需要修改Factory
		//VehicleFactory factory = new CarFactory();
		VehicleFactory factory = new PlaneFactory();
		Moveable m = factory.create();
		m.run();
	}
}
