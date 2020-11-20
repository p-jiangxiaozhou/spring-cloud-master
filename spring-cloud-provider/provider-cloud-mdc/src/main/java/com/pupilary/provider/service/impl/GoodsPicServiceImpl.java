package com.pupilary.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.core.properties.MdcResourceProperties;
import com.pupilary.provider.mapper.GoodsPicMapper;
import com.pupilary.provider.model.domain.GoodsPic;
import com.pupilary.provider.service.GoodsPicService;
import com.pupilary.provider.vo.GoodsPicVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author takesi
 * @date 2020-11-12
 */
@Service
@AllArgsConstructor
public class GoodsPicServiceImpl extends ServiceImpl<GoodsPicMapper, GoodsPic> implements GoodsPicService {

    private final GoodsPicMapper goodsPicMapper;
    private final MdcResourceProperties properties;

    @Override
    public List<GoodsPicVo> getPicByGoodsId(Long id) {
        return goodsPicMapper.selectGoodsPicByGoodsId(properties.getMediaUrlPattern(), id);
    }
}
