package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.Administrator;
import com.scu.springboot.demo.service.AdministratorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Administrator)表控制层
 *
 * @author makejava
 * @since 2022-07-19 15:43:30
 */
@RestController
@RequestMapping("administrator")
public class AdministratorController {
    /**
     * 服务对象
     */
    @Resource
    private AdministratorService administratorService;

    /**
     * 分页查询
     *
     * @param administrator 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Administrator>> queryByPage(Administrator administrator, PageRequest pageRequest) {
        return ResponseEntity.ok(this.administratorService.queryByPage(administrator, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Administrator> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.administratorService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param administrator 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Administrator> add(Administrator administrator) {
        return ResponseEntity.ok(this.administratorService.insert(administrator));
    }

    /**
     * 编辑数据
     *
     * @param administrator 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Administrator> edit(Administrator administrator) {
        return ResponseEntity.ok(this.administratorService.update(administrator));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.administratorService.deleteById(id));
    }

}

