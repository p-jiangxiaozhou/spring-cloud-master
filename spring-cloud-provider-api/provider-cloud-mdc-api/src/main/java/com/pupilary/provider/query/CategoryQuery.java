package com.pupilary.provider.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @author takesi
 * @date 2020-11-14
 */
@Data
public class CategoryQuery implements Serializable {

    private static final long serialVersionUID = -8782208857315440528L;

    private Boolean isActive;
}
