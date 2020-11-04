package com.pupilary.oauth2.properties;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @author takesi
 * @date 2020-10-13
 */
@Getter
@ConfigurationProperties(prefix = "spring.security")
public class SecurityProperties implements Serializable {

    private static final long serialVersionUID = 3188514435974074009L;

    private AuthProperties auth = new AuthProperties();

    private PermitProperties ignore = new PermitProperties();

    public void setAuth(AuthProperties auth) {
        this.auth = auth;
    }

    public void setIgnore(PermitProperties ignore) {
        this.ignore = ignore;
    }
}
