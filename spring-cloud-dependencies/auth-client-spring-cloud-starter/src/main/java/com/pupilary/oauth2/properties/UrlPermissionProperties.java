package com.pupilary.oauth2.properties;

import lombok.Getter;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.io.Serializable;
import java.util.List;

/**
 * url权限配置
 *
 * @author takesi
 * @date 2020-10-07
 */
@Getter
@RefreshScope
public class UrlPermissionProperties implements Serializable {

    private static final long serialVersionUID = 2364348953829738096L;

    /**
     * 是否开启url级别权限
     */
    private Boolean enable = false;

    /**
     * 白名单, 配置需要url权限认证的应用id（与黑名单互斥，只能配置其中一个），不配置默认所有应用都生效
     */
    private List<String> includeClientIds;

    /**
     * 黑名单，配置不需要url权限认证的应用id（与白名单互斥，只能配置其中一个）
     */
    private List<String> excludeClientIds;

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public void setIncludeClientIds(List<String> includeClientIds) {
        this.includeClientIds = includeClientIds;
    }

    public void setExcludeClientIds(List<String> excludeClientIds) {
        this.excludeClientIds = excludeClientIds;
    }
}
