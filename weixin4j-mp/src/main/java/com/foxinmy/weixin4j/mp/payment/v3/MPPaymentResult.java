package com.foxinmy.weixin4j.mp.payment.v3;

import javax.xml.bind.annotation.XmlElement;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 企业付款结果
 * 
 * @className MPPaymentResult
 * @author jy
 * @date 2015年4月1日
 * @since JDK 1.7
 * @see
 */
public class MPPaymentResult extends ApiResult {

	private static final long serialVersionUID = 1110472826089211646L;

	/**
	 * 微信订单订单号
	 */
	@JSONField(name = "payment_no")
	@XmlElement(name = "payment_no")
	private String transactionId;
	/**
	 * 商户订单号
	 */
	@JSONField(name = "partner_trade_no")
	@XmlElement(name = "partner_trade_no")
	private String outTradeNo;
	/**
	 * 支付时间
	 */
	@JSONField(name = "payment_time")
	@XmlElement(name = "payment_time")
	private String paymentTime;

	public String getTransactionId() {
		return transactionId;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public String getPaymentTime() {
		return paymentTime;
	}

	@Override
	public String toString() {
		return "MPPaymentResult [transactionId=" + transactionId
				+ ", outTradeNo=" + outTradeNo + ", paymentTime=" + paymentTime
				+ "]";
	}
}
