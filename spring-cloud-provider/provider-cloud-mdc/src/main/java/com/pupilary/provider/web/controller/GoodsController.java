package com.pupilary.provider.web.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pupilary.base.wrapper.PageWrapMapper;
import com.pupilary.base.wrapper.PageWrapper;
import com.pupilary.base.wrapper.WrapMapper;
import com.pupilary.base.wrapper.Wrapper;
import com.pupilary.core.base.BaseController;
import com.pupilary.provider.query.GoodsQuery;
import com.pupilary.provider.service.GoodsService;
import com.pupilary.provider.vo.GoodsVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author takesi
 * @date 2020-11-14
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/goods")
public class GoodsController extends BaseController {

    private final GoodsService goodsService;

    @GetMapping(value = "/list")
    public PageWrapper<List<GoodsVo>> list(GoodsQuery goodsQuery) {
        IPage<GoodsVo> result = goodsService.list(goodsQuery);
        return PageWrapMapper.wrap(
                result.getRecords(),
                result.getCurrent(),
                result.getSize(),
                result.getTotal()
        );
    }

    @GetMapping(value = "/{id}/detail")
    public Wrapper<GoodsVo> detail(@PathVariable Long id) {
        GoodsVo result = goodsService.getById(id);
        return WrapMapper.ok(result);
    }

}
