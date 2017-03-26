package net.coderdaily.chainofresponsibility;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2017/3/26 10:21
 * Blog: coderdaily.net
 * <p>
 * 5-10% 的折扣；
 */
public class Manager extends PriceHandler {

    @Override
    public void proccessDiscount(float discount) {
        if (discount <= 0.1) {
            System.out.printf("%s批准了折扣为%.4f的请求%n", this.getClass().getName(), discount);
        }else {
            System.out.printf("%s拒绝了折扣为%.4f的请求%n", this.getClass().getName(), discount);
        }
    }
}
