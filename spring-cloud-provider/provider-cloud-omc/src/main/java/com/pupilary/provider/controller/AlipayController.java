package com.pupilary.provider.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pupilary.base.wrapper.WrapMapper;
import com.pupilary.base.wrapper.Wrapper;
import com.pupilary.core.base.BaseController;
import com.pupilary.provider.dto.OrderDto;
import com.pupilary.provider.service.OrderService;

import lombok.AllArgsConstructor;

/**
 * @author takesi
 * @date 2020-11-21
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/alipay")
public class AlipayController extends BaseController {
	
	private final OrderService orderService;

    @PostMapping(value = "/wrap/pay")
    public Wrapper<String> wrapPay(@RequestBody OrderDto orderDto) throws Exception {
        String result = orderService.wrapPay(orderDto);
        return WrapMapper.ok(result);
    }

    /**
     * 支付宝通知接口
     */
    @PostMapping(value = "/callback")
    public Wrapper<String> callback() {

        return WrapMapper.ok();
    }
}
