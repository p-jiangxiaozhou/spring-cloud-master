package com.pupilary.provider.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author takesi
 * @date 2020-11-13
 */
@Data
public class GoodsVo implements Serializable {

    private static final long serialVersionUID = 2507128770006757106L;

    /**
     * id
     */
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 小标题
     */
    private String subTitle;

    /**
     * 封面图
     */
    private String img;

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 商品优惠价
     */
    private BigDecimal discount;

    /**
     * 商品积分
     */
    private Integer integral;

    /**
     * 商品图片
     */
    private List<GoodsPicVo> goodsPics;

    /**
     * 商品详情
     */
    private String summary;

    /**
     * 是否有效
     */
    private Boolean isActive;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
