package com.pupilary.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.provider.mapper.CategoryMapper;
import com.pupilary.provider.model.domain.Category;
import com.pupilary.provider.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author takesi
 * @date 2020-11-12
 */
@Service
@AllArgsConstructor
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    private final CategoryMapper categoryMapper;

}
