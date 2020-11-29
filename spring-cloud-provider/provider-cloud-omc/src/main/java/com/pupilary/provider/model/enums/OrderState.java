package com.pupilary.provider.model.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author takesi
 * @date 2020-11-22
 */
public enum OrderState implements IEnum<Byte> {

    /**
     * 待支付
     */
    TO_BE_PAID {
        @Override
        public Byte getValue() {
            return 0;
        }
    },

    /**
     * 已支付d
     */
    BEING_PAID {
        @Override
        public Byte getValue() {
            return 1;
        }
    };

    public static OrderState getInstance(Byte value) {
        for (OrderState state : OrderState.values()) {
            if (state.getValue().equals(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException("非法参数");
    }

}
