package net.coderdaily.factory.springfactory;

public class Car implements Moveable{
	//ģ��һ�£���ΪClass.forName(vehicleName).newInstance();����ò���Ϊ�յĹ��췽��
//	private  Car() {
//	}
	@Override
	public void run() {
		System.out.println("runnig on expressway...");
	}
}
