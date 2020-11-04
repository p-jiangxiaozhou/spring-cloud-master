package com.pupilary.provider.model.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author takesi
 * @date 2020-10-20
 */
public enum UserStatus implements IEnum<Byte> {

    /**
     * enable
     */
    ENABLE {
        @Override
        public Byte getValue() {
            return 1;
        }
    },

    /**
     * 注销
     */
    LOG_OUT {
        @Override
        public Byte getValue() {
            return 2;
        }
    },

    /**
     * disable
     */
    DISABLE {
        @Override
        public Byte getValue() {
            return 0;
        }
    };

    public static UserStatus getInstance(Byte value) {
        for (UserStatus userStatus : UserStatus.values()) {
            if (userStatus.getValue().equals(value)) {
                return userStatus;
            }
        }
        throw new IllegalArgumentException("非法参数!");
    }

    public static boolean isEnable(Byte value) {
        UserStatus userStatus = getInstance(value);
        return userStatus == ENABLE;
    }
}
