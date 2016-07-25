package net.coderdaily.proxy.staticproxy;

/**
 * Description: 通过聚合实现
 * 
 * @author coderdaily.net
 * @date 2016年7月25日
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
		System.out.println("2.调用方法耗时 :" + (end - start));
	}

}
