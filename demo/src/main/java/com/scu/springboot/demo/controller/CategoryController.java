package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.Category;
import com.scu.springboot.demo.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Category)表控制层
 *
 * @author makejava
 * @since 2022-07-13 15:13:14
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    /**
     * 服务对象
     */
    @Resource
    private CategoryService categoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Category selectOne(Long id) {
        return this.categoryService.queryById(id);
    }

}