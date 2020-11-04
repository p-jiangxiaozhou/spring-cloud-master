package com.pupilary.provider.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pupilary.mybatis.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author takesi
 * @date 2020-10-20
 */
@Data
@TableName(value = "mac_user")
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity {

    private static final long serialVersionUID = -5383035156148305082L;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 用户密码
     */
    @TableField(value = "`password`")
    private String password;

    /**
     * 用户昵称或网络名称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 用户头像图片
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 用户手机号码
     */
    @TableField(value = "mobile")
    private String mobile;

    /**
     * 性别：0 未知， 1男， 1 女
     */
    @TableField(value = "gender")
    private Byte gender;

    /**
     * 生日
     */
    @TableField(value = "birthday")
    private Date birthday;

    /**
     * 角色id
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 最近一次登录时间
     */
    @TableField(value = "last_login_time")
    private Date lastLoginTime;

    /**
     * 最近一次登录IP地址
     */
    @TableField(value = "last_login_ip")
    private String lastLoginIp;

    /**
     * 微信登录openid
     */
    @TableField(value = "openid")
    private String openid;

    /**
     * 1 可用, 0 禁用, 2 注销
     */
    @TableField(value = "`status`")
    private Byte status;

    public static final String COL_ID = "id";

    public static final String COL_USERNAME = "username";

    public static final String COL_PASSWORD = "password";

    public static final String COL_NICKNAME = "nickname";

    public static final String COL_AVATAR = "avatar";

    public static final String COL_MOBILE = "mobile";

    public static final String COL_GENDER = "gender";

    public static final String COL_BIRTHDAY = "birthday";

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_LAST_LOGIN_TIME = "last_login_time";

    public static final String COL_LAST_LOGIN_IP = "last_login_ip";

    public static final String COL_OPENID = "openid";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_VERSION = "version";
}
