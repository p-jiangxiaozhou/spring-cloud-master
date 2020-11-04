package com.pupilary.oauth2.properties;

import lombok.Getter;

import java.io.Serializable;

/**
 * @author takesi
 * @date 2020-10-13
 */
@Getter
public class AuthProperties implements Serializable {

    private static final long serialVersionUID = 8498208007989087705L;

    /**
     * url权限配置
     */
    private UrlPermissionProperties urlPermission = new UrlPermissionProperties();

    /**
     * token自动续签配置（目前只有redis实现）
     */
    private RenewProperties renew = new RenewProperties();

    public void setUrlPermission(UrlPermissionProperties urlPermission) {
        this.urlPermission = urlPermission;
    }

    public void setRenew(RenewProperties renew) {
        this.renew = renew;
    }
}
