package com.pupilary.provider.model.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author takesi
 * @date 2020-11-23
 */
public enum PayType implements IEnum<Byte> {

    /**
     * 支付宝
     */
    ALIPAY {
        @Override
        public Byte getValue() {
            return 1;
        }
    },

    /**
     * 微信
     */
    WEIXIN {
        @Override
        public Byte getValue() {
            return 2;
        }
    }
}
