package com.pupilary.provider.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pupilary.mybatis.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author takesi
 * @date 2020-11-23
 */
@Data
@TableName(value = "omc_order")
@EqualsAndHashCode(callSuper = false)
public class Order extends BaseEntity {

    private static final long serialVersionUID = 8915775020109828003L;

    /**
     * 订单编号
     */
    @TableField(value = "`no`")
    private String no;

    /**
     * 订单价格
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 支付类型
     */
    @TableField(value = "pay_type")
    private Byte payType;

    /**
     * 订单状态
     */
    @TableField(value = "`state`")
    private Byte state;

    public static final String COL_ID = "id";

    public static final String COL_NO = "no";

    public static final String COL_PRICE = "price";

    public static final String COL_PAY_TYPE = "pay_type";

    public static final String COL_STATE = "state";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_VERSION = "version";
}
