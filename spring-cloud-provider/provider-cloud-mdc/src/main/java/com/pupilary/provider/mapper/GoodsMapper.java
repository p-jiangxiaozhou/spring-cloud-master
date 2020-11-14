package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pupilary.provider.model.domain.Goods;
import com.pupilary.provider.query.GoodsQuery;
import com.pupilary.provider.vo.GoodsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author takesi
 * @date 2020-11-12
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

    /**
     * selectGoodsByPage
     *
     * @param page       page
     * @param goodsQuery goodsQuery
     * @return page
     */
    IPage<GoodsVo> selectGoodsByPage(IPage<GoodsVo> page, @Param("query") GoodsQuery goodsQuery);

    /**
     * selectGoodsById
     *
     * @param id goodsId
     * @return goods
     */
    GoodsVo selectGoodsById(@Param("id") Long id);
}
