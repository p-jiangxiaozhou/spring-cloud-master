package com.pupilary.provider.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author takesi
 * @date 2020-10-17
 */
@Data
public class RoleVo implements Serializable {

    private static final long serialVersionUID = 237624032719878934L;

    /**
     * id
     */
    private Long id;

    /**
     * 角色code
     */
    private String code;

    /**
     * 角色名
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
