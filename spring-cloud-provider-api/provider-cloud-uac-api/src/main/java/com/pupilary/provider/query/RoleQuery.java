package com.pupilary.provider.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @author takesi
 * @date 2020-10-17
 */
@Data
public class RoleQuery implements Serializable {

    private static final long serialVersionUID = 3316835908059870296L;

    private String name;

    private Integer current;

    private Integer pageSize;

}
