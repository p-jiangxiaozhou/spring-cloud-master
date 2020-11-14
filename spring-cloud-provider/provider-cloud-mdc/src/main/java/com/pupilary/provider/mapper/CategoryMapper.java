package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.Category;
import com.pupilary.provider.vo.CategoryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author takesi
 * @date 2020-11-12
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * selectCategoryByIsActive
     *
     * @param isActive isActive
     * @return list
     */
    List<CategoryVo> selectCategoryByIsActive(@Param("isActive") Boolean isActive);
}
