package com.pupilary.provider.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.provider.dto.OauthClientDetailsDto;
import com.pupilary.provider.mapper.OauthClientDetailsMapper;
import com.pupilary.provider.model.domain.OauthClientDetails;
import com.pupilary.provider.query.OauthClientDetailsQuery;
import com.pupilary.provider.service.OauthClientDetailsService;
import com.pupilary.provider.vo.OauthClientDetailsVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author takesi
 * @date 2020-10-06
 */
@Service
@AllArgsConstructor
public class OauthClientDetailsServiceImpl extends ServiceImpl<OauthClientDetailsMapper, OauthClientDetails> implements OauthClientDetailsService {

    private final OauthClientDetailsMapper oauthClientDetailsMapper;

    @Override
    public IPage<OauthClientDetailsVo> listClient(OauthClientDetailsQuery oauthClientDetailsQuery, boolean isPage) {
        IPage<OauthClientDetailsVo> page;

        if (isPage) {
            page = new Page<>(oauthClientDetailsQuery.getCurrent(), oauthClientDetailsQuery.getPageSize());
        } else {
            page = new Page<>(1, -1);
        }
        return oauthClientDetailsMapper.selectOauthClientDetailsByPage(page, oauthClientDetailsQuery);
    }

    @Override
    public OauthClientDetailsVo loadById(Long clientId) {
        return null;
    }

    @Override
    public void deleteById(Long clientId) {

    }

    @Override
    public void saveClient(OauthClientDetailsDto oauthClientDetailsDto) {

    }
}

