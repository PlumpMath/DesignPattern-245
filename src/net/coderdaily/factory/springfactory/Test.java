package net.coderdaily.factory.springfactory;

import java.util.Properties;

public class Test {
	//���������޸ĳ���
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		//�õ�������classloader��Test.class.getClassLoader()����������ļ�תΪһ��������
		//ֻ��load���ڴ��ˣ���û��������
		props.load(Test.class.getClassLoader().getResourceAsStream("net/coderdaily/factory/springfactory/spring.properties"));
		String vehicleName = props.getProperty("vehicleName");
		System.out.println("-------"+vehicleName+"-------");
		//����ò���Ϊ�յĹ��췽��
		Object o = Class.forName(vehicleName).newInstance();
		Moveable m = (Moveable)o;
		m.run();
	}
}
