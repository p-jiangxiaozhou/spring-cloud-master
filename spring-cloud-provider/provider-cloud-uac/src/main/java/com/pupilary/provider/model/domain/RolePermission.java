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
@EqualsAndHashCode(callSuper = false)
@TableName(value = "uac_role_permission")
public class RolePermission extends BaseEntity {

    private static final long serialVersionUID = -51661804383791290L;
    /**
     * 角色id
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 权限id
     */
    @TableField(value = "permission_id")
    private Long permissionId;

    public static final String COL_ID = "id";

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_PERMISSION_ID = "permission_id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_VERSION = "version";
}
