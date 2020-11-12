package com.pupilary.provider.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pupilary.mybatis.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author takesi
 * @date 2020-11-12
 */
@Data
@TableName(value = "mdc_goods")
@EqualsAndHashCode(callSuper = false)
public class Goods extends BaseEntity {

    private static final long serialVersionUID = 1946562708103055700L;

    /**
     * 商品名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 小标题
     */
    @TableField(value = "sub_title")
    private String subTitle;

    /**
     * 封面图
     */
    @TableField(value = "img")
    private String img;

    /**
     * 分类id
     */
    @TableField(value = "category_id")
    private Long categoryId;

    /**
     * 商品价格
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 商品优惠价
     */
    @TableField(value = "discount")
    private BigDecimal discount;

    /**
     * 商品积分
     */
    @TableField(value = "integral")
    private Integer integral;

    /**
     * 商品详情
     */
    @TableField(value = "summary")
    private String summary;

    /**
     * 是否有效
     */
    @TableField(value = "is_active")
    private Boolean isActive;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_SUB_TITLE = "sub_title";

    public static final String COL_IMG = "img";

    public static final String COL_CATEGORY_ID = "category_id";

    public static final String COL_PRICE = "price";

    public static final String COL_DISCOUNT = "discount";

    public static final String COL_INTEGRAL = "integral";

    public static final String COL_SUMMARY = "summary";

    public static final String COL_IS_ACTIVE = "is_active";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_VERSION = "version";
}
