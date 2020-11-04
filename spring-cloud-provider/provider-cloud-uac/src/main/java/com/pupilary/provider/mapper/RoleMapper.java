package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pupilary.provider.model.domain.Role;
import com.pupilary.provider.query.RoleQuery;
import com.pupilary.provider.vo.RoleVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author takesi
 * @date 2020-10-16
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * queryRoleByPage
     *
     * @param page      page
     * @param roleQuery roleQuery
     * @return Page
     */
    IPage<RoleVo> queryRoleByPage(IPage<RoleVo> page, @Param("query") RoleQuery roleQuery);
}
