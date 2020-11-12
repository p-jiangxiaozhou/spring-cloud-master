package com.pupilary.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.provider.mapper.GoodsMapper;
import com.pupilary.provider.model.domain.Goods;
import com.pupilary.provider.service.GoodsService;
import org.springframework.stereotype.Service;

/**
 * @author takesi
 * @date 2020-11-12
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

}
