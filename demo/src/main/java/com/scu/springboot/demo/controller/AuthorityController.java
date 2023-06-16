package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.Authority;
import com.scu.springboot.demo.service.AuthorityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Authority)表控制层
 *
 * @author makejava
 * @since 2022-07-13 15:12:44
 */
@RestController
@RequestMapping("authority")
public class AuthorityController {
    /**
     * 服务对象
     */
    @Resource
    private AuthorityService authorityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Authority selectOne(Long id) {
        return this.authorityService.queryById(id);
    }

}