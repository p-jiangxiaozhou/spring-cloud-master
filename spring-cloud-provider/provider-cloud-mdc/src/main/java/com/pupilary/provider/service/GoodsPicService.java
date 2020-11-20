package com.pupilary.provider.service;

import com.pupilary.provider.model.domain.GoodsPic;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pupilary.provider.vo.GoodsPicVo;

import java.util.List;

/**
 * @author takesi
 * @date 2020-11-12
 */
public interface GoodsPicService extends IService<GoodsPic> {

    /**
     * getPicByGoodsId
     *
     * @param id id
     * @return list
     */
    List<GoodsPicVo> getPicByGoodsId(Long id);
}
