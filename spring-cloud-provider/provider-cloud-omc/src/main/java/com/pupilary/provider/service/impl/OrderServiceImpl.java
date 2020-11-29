package com.pupilary.provider.service.impl;

import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.payment.wap.models.AlipayTradeWapPayResponse;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.core.utils.SnowflakeUtils;
import com.pupilary.provider.dto.OrderDto;
import com.pupilary.provider.feign.GoodsFeignApi;
import com.pupilary.provider.mapper.OrderMapper;
import com.pupilary.provider.model.domain.Order;
import com.pupilary.provider.service.OrderService;
import com.pupilary.provider.vo.GoodsVo;

import lombok.AllArgsConstructor;

import java.time.LocalTime;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author takesi
 * @date 2020-11-22
 */
@Service
@AllArgsConstructor
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
	
	private final OrderMapper orderMapper;
	
	@Autowired
	private GoodsFeignApi goodsFeignApi;

	@Override
	public String wrapPay(OrderDto orderDto) throws Exception {
		final long goodsId = orderDto.getGoodsId();
		GoodsVo goods = goodsFeignApi.getById(goodsId);
		
		if(Objects.nonNull(goods)) {
			String orderNo = String.valueOf(SnowflakeUtils.genId());
			
			AlipayTradeWapPayResponse response = Factory.Payment.Wap().pay(
	                goods.getName(),
	                orderNo,
	                String.valueOf(goods.getDiscount()),
	                "www.bilibili.com",
	                "");
			return response.body;
		}
		return null;
	}

}

