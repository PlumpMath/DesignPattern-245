package net.coderdaily.proxy.staticproxy;

/**
 * Description: ʹ�ü̳�ʵ��
 * 
 * @author coderdaily.net
 * @date 2016��7��25��
 */
public class CarProxyByExtend extends Car {

	@Override
	public void move() {
		long start = System.currentTimeMillis();

		super.move();// ��log

		long end = System.currentTimeMillis();
		System.out.println("1.���÷�����ʱ :" + (end - start));
	}

}
