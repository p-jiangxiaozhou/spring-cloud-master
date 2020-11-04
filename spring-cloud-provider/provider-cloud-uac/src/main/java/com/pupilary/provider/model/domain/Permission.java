package com.pupilary.provider.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pupilary.mybatis.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author takesi
 * @date 2020-10-26
 */
@Data
@TableName(value = "tb_permission")
@EqualsAndHashCode(callSuper = false)
public class Permission extends BaseEntity {

    private static final long serialVersionUID = 8416407521068784692L;

    /**
     * 权限名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 权限url
     */
    @TableField(value = "url")
    private String url;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 上级权限id
     */
    @TableField(value = "parent_id")
    private Long parentId;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_URL = "url";

    public static final String COL_SORT = "sort";

    public static final String COL_PARENT_ID = "parent_id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_VERSION = "version";
}
