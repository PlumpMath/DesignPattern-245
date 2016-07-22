package net.coderdaily.factory.springfactory;

public class Car implements Moveable{
	//模拟一下，因为Class.forName(vehicleName).newInstance();会调用参数为空的构造方法
//	private  Car() {
//	}
	@Override
	public void run() {
		System.out.println("runnig on expressway...");
	}
}
