package com.pupilary.provider.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author takesi
 * @date 2020-10-06
 */
@Data
public class OauthClientDetailsVo implements Serializable {

    private static final long serialVersionUID = -3335709478682033488L;

    /**
     * id
     */
    private Long id;

    /**
     * 应用标识
     */
    private String clientId;

    /**
     * 资源限定串(逗号分割)
     */
    private String resourceIds;

    /**
     * 应用密钥(bcyt) 加密
     */
    private String clientSecret;

    /**
     * 应用密钥(明文)
     */
    private String clientSecretStr;

    /**
     * 范围
     */
    private String scope;

    /**
     * 5种oauth授权方式(authorization_code,password,refresh_token,client_credentials)
     */
    private String authorizedGrantTypes;

    /**
     * 回调地址
     */
    private String webServerRedirectUri;

    /**
     * 权限
     */
    private String authorities;

    /**
     * access_token有效期
     */
    private Long accessTokenValidity;

    /**
     * refresh_token有效期
     */
    private Long refreshTokenValidity;

    /**
     * {}
     */
    private String additionalInformation;

    /**
     * 是否自动授权 是-true
     */
    private String autoapprove;

    /**
     * 应用名称
     */
    private String clientName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
