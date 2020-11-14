package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.GoodsPic;
import com.pupilary.provider.vo.GoodsPicVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author takesi
 * @date 2020-11-12
 */
@Mapper
public interface GoodsPicMapper extends BaseMapper<GoodsPic> {

    /**
     * selectGoodsPicByGoodsId
     *
     * @param goodsId goodsId
     * @return list
     */
    List<GoodsPicVo> selectGoodsPicByGoodsId(@Param("goodsId") Long goodsId);
}
