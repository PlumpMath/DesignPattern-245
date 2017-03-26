package net.coderdaily.chainofresponsibility;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2017/3/26 10:55
 * Blog: coderdaily.net
 */
public class PriceHandlerFactory {
    public static PriceHandler createPriceHander() {
        Salesman salesman = new Salesman();
        Manager manager = new Manager();
        salesman.setSuccessor(manager);
        /**
         * 向上转型
         */
        return salesman;
    }
}
