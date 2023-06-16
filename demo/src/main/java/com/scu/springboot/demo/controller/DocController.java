package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.Doc;
import com.scu.springboot.demo.service.DocService;
import com.scu.springboot.demo.utils.DataResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Doc)表控制层
 *
 * @author makejava
 * @since 2022-07-13 15:13:26
 */
@RestController
@RequestMapping("doc")
public class DocController {
    /**
     * 服务对象
     */
    @Resource
    private DocService docService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DataResult selectOne(Long id) {
        Doc doc = this.docService.queryById(id);
        return DataResult.successByData(doc);
    }

}