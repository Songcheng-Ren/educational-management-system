package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.College;
import com.scu.springboot.demo.service.CollegeService;
import com.scu.springboot.demo.utils.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (College)表控制层
 *
 * @author makejava
 * @since 2022-07-20 01:09:14
 */
@RestController
@RequestMapping("college")
public class CollegeController {
    /**
     * 服务对象
     */
    @Resource
    private CollegeService collegeService;

    /**
     * 分页查询
     *
     * @param college 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<College>> queryByPage(College college, PageRequest pageRequest) {
        return ResponseEntity.ok(this.collegeService.queryByPage(college, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<College> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.collegeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param college 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<College> add(College college) {
        return ResponseEntity.ok(this.collegeService.insert(college));
    }

    /**
     * 编辑数据
     *
     * @param college 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<College> edit(College college) {
        return ResponseEntity.ok(this.collegeService.update(college));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.collegeService.deleteById(id));
    }

    @PostMapping("getAllMajor")
    public DataResult getAllMajor(College college) {
        return DataResult.successByDataArray(collegeService.getAllMajor(college));
    }

}

