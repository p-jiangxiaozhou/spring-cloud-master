package com.pupilary.provider.model.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author takesi
 * @date 2020-11-14
 */
public enum CategoryStatus implements IEnum<Boolean> {

    /**
     * enable
     */
    ENABLE {
        @Override
        public Boolean getValue() {
            return true;
        }
    },

    /**
     * disable
     */
    DISABLE {
        @Override
        public Boolean getValue() {
            return false;
        }
    }

}
