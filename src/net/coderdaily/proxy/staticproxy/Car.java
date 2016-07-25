package net.coderdaily.proxy.staticproxy;

import java.util.Random;

public class Car implements Moveable {
	@Override
	public void move() {
		System.out.println("the car start running...");
		long start = System.currentTimeMillis();
		try {
			// ��������5s��һ��ʱ��
			Thread.sleep(new Random().nextInt(5000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();

		System.out.println("the car running spent :" + (end - start));
	}
}
