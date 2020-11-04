package com.pupilary.provider.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @author takesi
 * @date 2020-10-06
 */
@Data
public class OauthClientDetailsQuery implements Serializable {

    private static final long serialVersionUID = -7147128388587637055L;

    private Integer current;

    private Integer pageSize;

}
