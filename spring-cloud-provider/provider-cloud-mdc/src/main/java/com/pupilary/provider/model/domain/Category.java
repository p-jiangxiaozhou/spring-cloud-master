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
@TableName(value = "mdc_category")
@EqualsAndHashCode(callSuper = false)
public class Category extends BaseEntity {

    private static final long serialVersionUID = 9106716219715881565L;

    /**
     * 分类名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * subTitle
     */
    @TableField(value = "sub_title")
    private String subTitle;

    /**
     * 上级分类id
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 是否有效
     */
    @TableField(value = "is_active")
    private Boolean isActive;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_SUB_TITLE = "sub_title";

    public static final String COL_PARENT_ID = "parent_id";

    public static final String COL_IS_ACTIVE = "is_active";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_VERSION = "version";
}
