package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pupilary.provider.model.domain.OauthClientDetails;
import com.pupilary.provider.query.OauthClientDetailsQuery;
import com.pupilary.provider.vo.OauthClientDetailsVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author takesi
 * @date 2020-10-06
 */
@Mapper
public interface OauthClientDetailsMapper extends BaseMapper<OauthClientDetails> {

    /**
     * selectOauthClientDetailsByPage
     *
     * @param page                    page
     * @param oauthClientDetailsQuery oauthClientDetailsQuery
     * @return page
     */
    IPage<OauthClientDetailsVo> selectOauthClientDetailsByPage(IPage<OauthClientDetailsVo> page, OauthClientDetailsQuery oauthClientDetailsQuery);
}
