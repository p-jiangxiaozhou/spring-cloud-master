package com.pupilary.provider.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @author takesi
 * @date 2020-11-13
 */
@Data
public class GoodsQuery implements Serializable {

    private static final long serialVersionUID = -2586855168514152278L;

    private Long categoryId;

    private Boolean isActive;

    private Integer current;

    private Integer pageSize;

}
