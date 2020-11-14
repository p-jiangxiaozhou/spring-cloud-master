package com.pupilary.provider.model.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author takesi
 * @date 2020-11-14
 */
public enum GoodsStatus implements IEnum<Boolean> {

    /**
     * enable
     */
    ENABLE {
        @Override
        public Boolean getValue() {
            return true;
        }
    },

    DISABLE {
        @Override
        public Boolean getValue() {
            return false;
        }
    }

}
