package com.pupilary.provider.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @author takesi
 * @date 2020-10-26
 */
@Data
public class PermissionQuery implements Serializable {

    private static final long serialVersionUID = 6171612377958172897L;

    private String name;

    private Integer current;

    private Integer pageSize;

}
