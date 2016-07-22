package net.coderdaily.fatory.abstractfactory;

public class Test {
	public static void main(String[] args) {
		AbstractFactory factory = new DefaultFactory();
		Vehicle vehicle = factory.createVehicle();
		vehicle.run();
		Food food = factory.createFood();
		food.printFoodName();
	}
}
