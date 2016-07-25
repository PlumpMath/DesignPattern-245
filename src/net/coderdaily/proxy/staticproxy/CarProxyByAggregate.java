package net.coderdaily.proxy.staticproxy;

/**
 * Description: ͨ���ۺ�ʵ��
 * 
 * @author coderdaily.net
 * @date 2016��7��25��
 */
public class CarProxyByAggregate implements Moveable {
	Moveable m;

	public CarProxyByAggregate(Moveable m) {
		super();
		this.m = m;
	}

	@Override
	public void move() {
		long start = System.currentTimeMillis();

		m.move();

		long end = System.currentTimeMillis();
		System.out.println("2.���÷�����ʱ :" + (end - start));
	}

}
