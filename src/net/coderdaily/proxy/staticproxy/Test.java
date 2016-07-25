package net.coderdaily.proxy.staticproxy;

public class Test {
	public static void main(String[] args) {
		// Moveable m = new Car();
		// Moveable m = new CarProxyByExtend();
		Car car = new Car();
		Moveable m = new CarProxyByAggregate(car);
		m.move();
	}
}
