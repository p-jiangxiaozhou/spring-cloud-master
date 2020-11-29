package com.pupilary.provider.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pupilary.provider.feign.fallback.GoodsFeignFallbackFactory;
import com.pupilary.provider.vo.GoodsVo;

/**
 * @author takesi
 */
@FeignClient(name = "provider-cloud-mdc", fallbackFactory = GoodsFeignFallbackFactory.class, decode404 = true)
public interface GoodsFeignApi {

    /**
     * getById
     *
     * @param goodsId goodsId
     * @return GoodsVo goodsVo
     */
    @GetMapping(value = "/goods/{id}/detail")
    GoodsVo getById(@PathVariable("id") Long goodsId);

}
