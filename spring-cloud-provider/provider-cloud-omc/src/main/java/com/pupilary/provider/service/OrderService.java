package com.pupilary.provider.service;

import com.pupilary.provider.dto.OrderDto;
import com.pupilary.provider.model.domain.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author takesi
 * @date 2020-11-22
 */
public interface OrderService extends IService<Order> {

	/**
	 * wrapPay
	 * 
	 * @param orderDto orderDto
	 * @return 支付宝支付内容
	 * @throws Exception 
	 */
	String wrapPay(OrderDto orderDto) throws Exception;

}
