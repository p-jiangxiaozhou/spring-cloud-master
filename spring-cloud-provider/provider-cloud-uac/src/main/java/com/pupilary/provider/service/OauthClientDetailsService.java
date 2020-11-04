package com.pupilary.provider.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pupilary.provider.dto.OauthClientDetailsDto;
import com.pupilary.provider.model.domain.OauthClientDetails;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pupilary.provider.query.OauthClientDetailsQuery;
import com.pupilary.provider.vo.OauthClientDetailsVo;

/**
 * @author takesi
 * @date 2020-10-06
 */
public interface OauthClientDetailsService extends IService<OauthClientDetails> {

    /**
     * listClient
     *
     * @param oauthClientDetailsQuery oauthClientDetailsQuery
     * @param isPage                  isPage
     * @return Page
     */
    IPage<OauthClientDetailsVo> listClient(OauthClientDetailsQuery oauthClientDetailsQuery, boolean isPage);

    /**
     * loadById
     *
     * @param clientId clientId
     * @return OauthClientDetailsVo
     */
    OauthClientDetailsVo loadById(Long clientId);

    /**
     * deleteById
     *
     * @param clientId clientId
     */
    void deleteById(Long clientId);

    /**
     * saveClient
     *
     * @param oauthClientDetailsDto oauthClientDetailsDto
     */
    void saveClient(OauthClientDetailsDto oauthClientDetailsDto);
}

