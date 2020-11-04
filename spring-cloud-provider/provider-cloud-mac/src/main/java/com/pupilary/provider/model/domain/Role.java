package com.pupilary.provider.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pupilary.mybatis.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author takesi
 * @date 2020-10-20
 */
@Data
@TableName(value = "mac_role")
@EqualsAndHashCode(callSuper = true)
public class Role extends BaseEntity {

    private static final long serialVersionUID = 5795271667152325380L;

    /**
     * 角色编号
     */
    @TableField(value = "code")
    private String code;

    /**
     * 角色名称
     */
    @TableField(value = "`name`")
    private String name;

    public static final String COL_ID = "id";

    public static final String COL_CODE = "code";

    public static final String COL_NAME = "name";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_VERSION = "version";
}
