package com.pupilary.oauth2.properties;

import lombok.Getter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author takesi
 * @date 2020-10-17
 */
@Getter
public class PermitProperties implements Serializable {

    private static final long serialVersionUID = 4143951820256924184L;

    /**
     * 监控中心和swagger需要访问的url
     */
    private static final String[] ENDPOINTS = {
            "/oauth/**",
            "/actuator/**"
    };

    /**
     * 设置不用认证的url
     */
    private final String[] httpUrls = {};

    public String[] getUrls() {
        if (httpUrls == null || httpUrls.length == 0) {
            return ENDPOINTS;
        }
        List<String> list = new ArrayList<>();
        Collections.addAll(list, ENDPOINTS);
        Collections.addAll(list, httpUrls);
        return list.toArray(new String[0]);
    }

}
