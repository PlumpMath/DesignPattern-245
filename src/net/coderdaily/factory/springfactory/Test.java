package net.coderdaily.factory.springfactory;

import java.util.Properties;

public class Test {
	//根本不用修改程序
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		//得到这个类的classloader，Test.class.getClassLoader()；并将这个文件转为一个流对象
		//只是load到内存了，还没创建对象
		props.load(Test.class.getClassLoader().getResourceAsStream("net/coderdaily/factory/springfactory/spring.properties"));
		String vehicleName = props.getProperty("vehicleName");
		System.out.println("-------"+vehicleName+"-------");
		//会调用参数为空的构造方法
		Object o = Class.forName(vehicleName).newInstance();
		Moveable m = (Moveable)o;
		m.run();
	}
}
