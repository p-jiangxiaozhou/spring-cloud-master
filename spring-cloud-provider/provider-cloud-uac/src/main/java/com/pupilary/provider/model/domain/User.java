package com.pupilary.provider.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pupilary.mybatis.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author takesi
 * @date 2020-10-14
 */
@Data
@TableName(value = "uac_user")
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity {

    private static final long serialVersionUID = -7328933002296587706L;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "`password`")
    private String password;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 头像
     */
    @TableField(value = "avatar_url")
    private String avatarUrl;

    /**
     * 手机号
     */
    @TableField(value = "mobile")
    private String mobile;

    /**
     * 性别
     */
    @TableField(value = "sex")
    private Byte sex;

    /**
     * enabled
     */
    @TableField(value = "enabled")
    private Boolean enabled;

    public static final String COL_ID = "id";

    public static final String COL_USERNAME = "username";

    public static final String COL_PASSWORD = "password";

    public static final String COL_NICKNAME = "nickname";

    public static final String COL_AVATAR_URL = "avatar_url";

    public static final String COL_MOBILE = "mobile";

    public static final String COL_SEX = "sex";

    public static final String COL_ENABLED = "enabled";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_VERSION = "version";
}
