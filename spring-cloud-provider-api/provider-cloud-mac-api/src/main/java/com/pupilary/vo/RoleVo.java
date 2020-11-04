package com.pupilary.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author takesi
 * @date 2020-10-20
 */
@Data
public class RoleVo implements Serializable {

    private static final long serialVersionUID = -9220306328501495143L;

    /**
     * id
     */
    private Long id;

    /**
     * 角色编号
     */
    private String code;

    /**
     * 角色名称
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
