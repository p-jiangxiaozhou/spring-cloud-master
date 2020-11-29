package com.pupilary.alipay.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author takesi
 * @date 2020-11-24
 */
@Data
public class BusinessNotifyParams implements Serializable {

    private static final long serialVersionUID = -4181132021376485260L;

    /**
     * 支付宝交易号 (支付宝交易凭证号)
     */
    private String tradeNo;

    /**
     * 开发者的app_id (支付宝分配给开发者的应用 ID)
     */
    private String appId;

    /**
     * 商户订单号 (原支付请求的商户订单号)
     */
    private String outTradeNo;

    /**
     * 商户业务号 (商户业务 ID，主要是退款通知中返回退款申请的流水号)
     */
    private String outBizNo;

    /**
     * 买家支付宝用户号  (买家支付宝账号对应的支付宝唯一用户号。以 2088 开头的纯 16 位数字)
     */
    private String buyerId;

    /**
     * 卖家支付宝用户号 (卖家支付宝用户号)
     */
    private String sellerId;

    /**
     * 交易状态 (交易目前所处的状态)
     */
    private String tradeStatus;

    /**
     * 订单金额 (本次交易支付的订单金额，单位为人民币（元），精确到小数点后2位)
     */
    private BigDecimal totalAmount;

    /**
     * 实收金额 (商家在交易中实际收到的款项，单位为元，精确到小数点后2位)
     */
    private BigDecimal receiptAmount;

    /**
     * 开票金额 (用户在交易中支付的可开发票的金额，单位为元，精确到小数点后2位)
     */
    private BigDecimal invoiceAmount;

    /**
     * 付款金额 (用户在交易中支付的金额，单位为元，精确到小数点后2位)
     */
    private BigDecimal buyerPayAmount;

    /**
     * 集分宝金额 (使用集分宝支付的金额，单位为元，精确到小数点后2位)
     */
    private BigDecimal pointAmount;

    /**
     * 总退款金额 (退款通知中，返回总退款金额，单位为元，精确到小数点后2位)
     */
    private BigDecimal refundFee;

    /**
     * 订单标题 (商品的标题/交易标题/订单标题/订单关键字等，是请求时对应的参数，原样通知回来)
     */
    private String subject;

    /**
     * 商品描述 (该订单的备注、描述、明细等。对应请求时的body参数，原样通知回来)
     */
    private String body;

    /**
     * 交易创建时间 (该笔交易创建的时间。格式为yyyy-MM-dd HH:mm:ss)
     */
    private Date gmtCreate;

    /**
     * 交易付款时间 (该笔交易的买家付款时间。格式为yyyy-MM-dd HH:mm:ss)
     */
    private Date gmtPayment;

    /**
     * 交易退款时间 (该笔交易的退款时间。格式为yyyy-MM-dd HH:mm:ss.S)
     */
    private Date gmtRefund;

    /**
     * 支付金额信息 (支付成功的各个渠道金额信息)
     */
    private String fundBillList;

    /**
     * 优惠券信息 (本交易支付时所使用的所有优惠券信息，)
     */
    private String voucherDetailList;

    /**
     * 回传参数 (公共回传参数，如果请求时传递了该参数，则返回给商户时会在异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝)
     */
    private String passbackParams;

}
