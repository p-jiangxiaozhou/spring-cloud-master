package com.pupilary.provider.controller;

import com.pupilary.base.wrapper.WrapMapper;
import com.pupilary.base.wrapper.Wrapper;
import com.pupilary.core.base.BaseController;
import com.pupilary.provider.service.CategoryService;
import com.pupilary.provider.vo.CategoryVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author takesi
 * @date 2020-11-14
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "category")
public class CategoryController extends BaseController {

    private final CategoryService categoryService;

    @GetMapping(value = "/list")
    public Wrapper<List<CategoryVo>> list() {
        List<CategoryVo> result = categoryService.getCategories();
        return WrapMapper.ok(result);
    }

}
