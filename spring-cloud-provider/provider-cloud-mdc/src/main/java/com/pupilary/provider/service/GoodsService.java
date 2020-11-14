package com.pupilary.provider.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pupilary.provider.model.domain.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pupilary.provider.query.GoodsQuery;
import com.pupilary.provider.vo.GoodsVo;

/**
 * @author takesi
 * @date 2020-11-12
 */
public interface GoodsService extends IService<Goods> {

    /**
     * list
     *
     * @param goodsQuery goodsQuery
     * @return page
     */
    IPage<GoodsVo> list(GoodsQuery goodsQuery);

    /**
     * getById
     *
     * @param id id
     * @return goods
     */
    GoodsVo getById(Long id);
}
