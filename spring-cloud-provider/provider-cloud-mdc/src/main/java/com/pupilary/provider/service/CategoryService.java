package com.pupilary.provider.service;

import com.pupilary.provider.model.domain.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pupilary.provider.query.CategoryQuery;
import com.pupilary.provider.vo.CategoryVo;

import java.util.List;

/**
 * @author takesi
 * @date 2020-11-12
 */
public interface CategoryService extends IService<Category> {

    /**
     * getCategories
     *
     * @return list
     */
    List<CategoryVo> getCategories();
}
