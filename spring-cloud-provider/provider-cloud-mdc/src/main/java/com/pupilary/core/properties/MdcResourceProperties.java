package com.pupilary.core.properties;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @author takesi
 * @date 2020-11-20
 */
@Getter
@ConfigurationProperties(prefix = "pupilary.resources")
public class MdcResourceProperties implements Serializable {

    private static final long serialVersionUID = 6122433704178883770L;

    private String mediaUrlPattern;

    private String mediaLocation = "";

    public void setMediaUrlPattern(String mediaUrlPattern) {
        this.mediaUrlPattern = mediaUrlPattern;
    }

    public void setMediaLocation(String mediaLocation) {
        this.mediaLocation = mediaLocation;
    }
}
