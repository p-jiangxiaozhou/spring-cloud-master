package com.pupilary.provider.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.provider.mapper.RoleMapper;
import com.pupilary.provider.model.domain.Role;
import com.pupilary.provider.query.RoleQuery;
import com.pupilary.provider.service.RoleService;
import com.pupilary.provider.vo.RoleVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author takesi
 * @date 2020-10-16
 */
@Service
@AllArgsConstructor
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    private final RoleMapper roleMapper;

    @Override
    public List<Role> getRoleByUserId(Long userId) {
        return null;
    }

    @Override
    public IPage<RoleVo> getRoles(RoleQuery roleQuery) {
        final int current = roleQuery.getCurrent() == null ? 0 : roleQuery.getCurrent();
        final int pageSize = roleQuery.getPageSize() == null ? -1 : roleQuery.getPageSize();
        IPage<RoleVo> page = new Page<>(current, pageSize);
        return roleMapper.queryRoleByPage(page, roleQuery);
    }
}
