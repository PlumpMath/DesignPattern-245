package net.coderdaily.chainofresponsibility;

import java.util.Random;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2017/3/26 10:32
 * Blog: coderdaily.net
 */
public class Customer {
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount) {
        priceHandler.proccessDiscount(discount);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        /**
         * 利用工厂模式来构造责任链
         */
        customer.setPriceHandler(PriceHandlerFactory.createPriceHander());

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            customer.requestDiscount(random.nextFloat());
        }
    }
}
