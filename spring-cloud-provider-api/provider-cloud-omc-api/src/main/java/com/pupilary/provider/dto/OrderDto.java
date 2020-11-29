package com.pupilary.provider.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author takesi
 * @date 2020-11-26
 */
@Data
public class OrderDto implements Serializable {

    private static final long serialVersionUID = -6708753889607011438L;

    /**
     * 收件人姓名
     */
    private String username;

    /**
     * 收件人联系方式
     */
    private String phone;

    /**
     * 商品id
     */
    private Long goodsId;

    private String area;

    private String address;

}
