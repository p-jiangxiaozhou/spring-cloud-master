package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author takesi
 * @date 2020-11-12
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
