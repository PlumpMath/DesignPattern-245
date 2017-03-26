package net.coderdaily.singleton;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2017/3/25 20:34
 * Blog: coderdaily.net
 * <p>
 * 懒汉模式
 */
public class SingletonTest {
    //设为静态来缓存曾经创建的实例
    private static SingletonTest sington;

    //将构造函数隐藏，只让通过方法引用，保证单例
    private SingletonTest() {
    }

    //保证只产生一个对象(设为静态因为调用此方法之前还不存在对象，因此调用此方法的只能是类，不是对象)
    public static SingletonTest getInstance() {
        if (sington == null) {
            sington = new SingletonTest();
        }
        return sington;
    }

    public static void main(String[] args) {
        //因为将构造函数隐藏了，所以此句是错误的
        //SingletonTest single=new SingletonTest();
        SingletonTest single1 = SingletonTest.getInstance();
        SingletonTest single2 = SingletonTest.getInstance();
        //应该输出为true，表明只创建了一次对象
        System.out.println(single1 == single2);
    }
}
