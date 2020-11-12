package com.pupilary.provider.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pupilary.mybatis.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author takesi
 * @date 2020-11-12
 */
@Data

@TableName(value = "mdc_goods_pic")
@EqualsAndHashCode(callSuper = false)
public class GoodsPic extends BaseEntity {

    private static final long serialVersionUID = -3780382657523556036L;

    /**
     * 图片地址
     */
    @TableField(value = "url")
    private String url;

    /**
     * 商品id
     */
    @TableField(value = "goods_id")
    private Byte goodsId;

    public static final String COL_ID = "id";

    public static final String COL_URL = "url";

    public static final String COL_GOODS_ID = "goods_id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";
}
