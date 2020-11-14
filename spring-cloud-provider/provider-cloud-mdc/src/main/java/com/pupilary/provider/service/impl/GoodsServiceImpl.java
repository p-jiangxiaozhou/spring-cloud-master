package com.pupilary.provider.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.provider.mapper.GoodsMapper;
import com.pupilary.provider.model.domain.Goods;
import com.pupilary.provider.query.GoodsQuery;
import com.pupilary.provider.service.GoodsService;
import com.pupilary.provider.vo.GoodsVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author takesi
 * @date 2020-11-12
 */
@Service
@AllArgsConstructor
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    private final GoodsMapper goodsMapper;

    @Override
    public IPage<GoodsVo> list(GoodsQuery goodsQuery) {
        IPage<GoodsVo> page = new Page<>(goodsQuery.getCurrent(), goodsQuery.getPageSize());
        return goodsMapper.selectGoodsByPage(page, goodsQuery);
    }

    @Override
    public GoodsVo getById(Long id) {
        return goodsMapper.selectGoodsById(id);
    }
}
