package com.scu.springboot.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.scu.springboot.demo.entity.ExamScore;
import com.scu.springboot.demo.service.ExamScoreService;
import com.scu.springboot.demo.utils.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ExamScore)表控制层
 *
 * @author makejava
 * @since 2022-07-16 15:53:36
 */
@RestController
@RequestMapping("examScore")
public class ExamScoreController {
    /**
     * 服务对象
     */
    @Resource
    private ExamScoreService examScoreService;

    /**
     * 分页查询
     *
     * @param examScore 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<ExamScore>> queryByPage(ExamScore examScore, PageRequest pageRequest) {
        return ResponseEntity.ok(this.examScoreService.queryByPage(examScore, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ExamScore> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.examScoreService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param examScore 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ExamScore> add(ExamScore examScore) {
        return ResponseEntity.ok(this.examScoreService.insert(examScore));
    }

    /**
     * 编辑数据
     *
     * @param examScore 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ExamScore> edit(ExamScore examScore) {
        return ResponseEntity.ok(this.examScoreService.update(examScore));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.examScoreService.deleteById(id));
    }

    @PostMapping("getAllScore")
    public DataResult getAllScore(ExamScore examScore){
        String id = examScore.getSid();
        return DataResult.successByDataArray(examScoreService.getAllScore(id));
    }

    @PostMapping("searchScore")
    public DataResult searchScore(ExamScore examScore){
        return DataResult.successByDataArray(examScoreService.searchScore(examScore));
    }
}

