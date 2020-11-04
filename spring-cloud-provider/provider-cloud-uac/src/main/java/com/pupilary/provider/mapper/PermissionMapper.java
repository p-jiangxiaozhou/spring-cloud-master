package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.Permission;
import com.pupilary.provider.query.PermissionQuery;
import com.pupilary.provider.vo.PermissionVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author takesi
 * @date 2020-10-26
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

    /**
     * findList
     *
     * @param permissionQuery query
     * @return List
     */
    List<PermissionVo> findList(@Param("query") PermissionQuery permissionQuery);

    /**
     * findAll
     *
     * @return List
     */
    List<PermissionVo> findAll();

}
