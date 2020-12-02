package com.pupilary.provider.web.rpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pupilary.provider.feign.GoodsFeignApi;
import com.pupilary.provider.service.GoodsService;
import com.pupilary.provider.vo.GoodsVo;

/**
 * 
 * @author takesi
 *
 */
@RestController
public class GoodsFeignClient implements GoodsFeignApi {

	@Autowired
	private GoodsService goodsService;

	@Override
	public GoodsVo getById(Long goodsId) {
		return goodsService.getById(goodsId);
	}

}
