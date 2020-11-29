package com.pupilary.provider.feign.fallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pupilary.provider.feign.GoodsFeignApi;
import com.pupilary.provider.vo.GoodsVo;

import feign.hystrix.FallbackFactory;

/**
 * 
 * @author takesi
 *
 */
public class GoodsFeignFallbackFactory implements FallbackFactory<GoodsFeignApi> {
	
	private static final Logger logger = LoggerFactory.getLogger(GoodsFeignFallbackFactory.class);

	@Override
	public GoodsFeignApi create(Throwable cause) {

		return new GoodsFeignApi() {

			@Override
			public GoodsVo getById(Long goodsId) {
				logger.error("查询商品:{}信息失败!{}", goodsId, cause);
				return null;
			}

		};
	}

}
