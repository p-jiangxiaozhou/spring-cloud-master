package com.pupilary.provider.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author takesi
 * @date 2020-11-14
 */
@Data
public class CategoryVo implements Serializable {

    private static final long serialVersionUID = 3234571161156491379L;

    /**
     * id
     */
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 上级分类id
     */
    private Long parentId;

    /**
     * 是否有效
     */
    private Boolean isActive;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
