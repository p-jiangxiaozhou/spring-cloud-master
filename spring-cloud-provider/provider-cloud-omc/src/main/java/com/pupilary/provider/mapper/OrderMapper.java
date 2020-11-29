package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author takesi
 * @date 2020-11-23
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
