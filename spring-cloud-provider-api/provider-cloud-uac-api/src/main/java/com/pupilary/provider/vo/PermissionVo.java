package com.pupilary.provider.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author takesi
 * @date 2020-10-26
 */
@Data
public class PermissionVo implements Serializable {

    private static final long serialVersionUID = -4150778432137593129L;

    /**
     * id
     */
    private Long id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限url
     */
    private String url;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 上级权限id
     */
    private Long parentId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
