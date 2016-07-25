package net.coderdaily.proxy.staticproxy;

/**
 * Description: 使用继承实现
 * 
 * @author coderdaily.net
 * @date 2016年7月25日
 */
public class CarProxyByExtend extends Car {

	@Override
	public void move() {
		long start = System.currentTimeMillis();

		super.move();// 加log

		long end = System.currentTimeMillis();
		System.out.println("1.调用方法耗时 :" + (end - start));
	}

}
