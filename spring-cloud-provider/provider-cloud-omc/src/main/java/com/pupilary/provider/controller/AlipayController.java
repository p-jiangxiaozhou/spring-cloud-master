package com.pupilary.provider.controller;

import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.kernel.util.ResponseChecker;
import com.alipay.easysdk.payment.wap.models.AlipayTradeWapPayResponse;
import com.pupilary.base.wrapper.WrapMapper;
import com.pupilary.base.wrapper.Wrapper;
import com.pupilary.core.base.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author takesi
 * @date 2020-11-21
 */
@RestController
@RequestMapping(value = "/alipay")
public class AlipayController extends BaseController {

    @GetMapping(value = "/wrap/pay")
    public Wrapper<String> wrapPay(@RequestParam String goodsId) throws Exception {
        AlipayTradeWapPayResponse response = Factory.Payment.Wap().pay("", "", "", "", "");

        if (ResponseChecker.success(response)) {
            return WrapMapper.ok(response.body);
        }
        return WrapMapper.error();
    }
}
