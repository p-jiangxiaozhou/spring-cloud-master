package com.pupilary.provider.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author takesi
 * @date 2020-10-14
 */
@Data
public class UserDto implements Serializable {

    private static final long serialVersionUID = -5696617740038928413L;

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 性别
     */
    private Byte sex;

    /**
     * enabled
     */
    private Boolean enabled;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
