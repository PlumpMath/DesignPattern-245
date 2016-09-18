package net.coderdaily.proxy.dynamicproxy;

import net.coderdaily.proxy.staticproxy.Car;
import net.coderdaily.proxy.staticproxy.CarProxyByAggregate;
import net.coderdaily.proxy.staticproxy.Moveable;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * 通过java自带编译器来实现动态代理
 */
public class Test {
    public static void main(String[] args) throws Exception {
        String rn = "\r\n";
        String src = "package net.coderdaily.proxy.dynamicproxy;" + rn +

                "import net.coderdaily.proxy.staticproxy.Moveable;" + rn +

                " public class CarProxyByAggregate implements Moveable {" + rn +
                "     Moveable m;" + rn +

                "     public CarProxyByAggregate(Moveable m) {" + rn +
                "       super();" + rn +
                "        this.m = m;" + rn +
                "    }" + rn +

                "@Override" + rn +
                "public void move() {" + rn +
                "long start = System.currentTimeMillis();" + rn +

                "   m.move();" + rn +

                "long end = System.currentTimeMillis();" + rn +
                "  System.out.println(\"2.调用方法耗时 :\" + (end - start));" + rn +
                "    }" + rn +

                "     }";
        //1.输出当前目录 例如：E:\eclipsespace\DesignPattern
        String fileName = System.getProperty("user.dir")
                + "/src/net/coderdaily/proxy/dynamicproxy/CarProxyByAggregate.java";
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(src);
        fileWriter.flush();
        fileWriter.close();

        //2.编译
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();//得到java编译器（系统的）
        System.out.println(compiler);
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        Iterable units = fileManager.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask t = compiler.getTask(null, fileManager, null, null, null, units);
        t.call();
        fileManager.close();

        //3.加载到内存
        //要加载的class在文件夹里，并没有在bin里，所以需要使用下列方法指定特定位置的class文件，
        //这种方式还可以去load网络中的类
        URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir") + "/src")};
        URLClassLoader loader = new URLClassLoader(urls);
        Class c = loader.loadClass("net.coderdaily.proxy.dynamicproxy.CarProxyByAggregate");
        System.out.println(c);

        //4.生成对象
        //得到构造方法
        Constructor constructor = c.getConstructor(Moveable.class);
        Moveable m = (Moveable) constructor.newInstance(new Car());//把参数传进去
        m.move();

        /*
        * 总结：
        * 1.不需要知道这个类叫什么名字
        * 2.只要实现了Moveable接口就行
        * 3.但是也只能代理实现了Moveable接口的代理，如果想代理产生任意接口的呢？
        *   只需要把接口也传进去即可
        * */
    }
}







