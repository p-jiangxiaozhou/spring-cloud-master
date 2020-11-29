package com.pupilary.alipay.enums;

/**
 * 交易状态
 *
 * @author takesi
 * @date 2020-11-23
 */
public enum AlipayTradeType {

    /**
     * 交易完成
     */
    TRADE_FINISHED,

    /**
     * 支付成功
     */
    TRADE_SUCCESS,

    /**
     * 交易创建
     */
    WAIT_BUYER_PAY,

    /**
     * 交易关闭
     */
    TRADE_CLOSED;

    public static AlipayTradeType getInstance(String name) {
        return AlipayTradeType.valueOf(name);
    }

}
