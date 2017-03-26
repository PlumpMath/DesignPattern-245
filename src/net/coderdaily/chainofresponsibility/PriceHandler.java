package net.coderdaily.chainofresponsibility;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2017/3/26 10:17
 * Blog: coderdaily.net
 * <p>
 * 价格处理人，负责处理客户的折扣申请
 */
public abstract class PriceHandler {
    /**
     * 直接后继,用于传递请求
     */
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理折扣
     *
     * @param discount
     */
    public abstract void proccessDiscount(float discount);
}
