package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.Exam;
import com.scu.springboot.demo.service.ExamService;
import com.scu.springboot.demo.utils.DataResult;
import com.scu.springboot.demo.vo.ExamVo;
import com.scu.springboot.demo.vo.Teacher_scheduleVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Exam)表控制层
 *
 * @author makejava
 * @since 2022-07-17 11:04:27
 */
@RestController
@RequestMapping("exam")
public class ExamController {
    /**
     * 服务对象
     */
    @Resource
    private ExamService examService;

    /**
     * 分页查询
     *
     * @param exam 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Exam>> queryByPage(Exam exam, PageRequest pageRequest) {
        return ResponseEntity.ok(this.examService.queryByPage(exam, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Exam> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.examService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param exam 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Exam> add(Exam exam) {
        return ResponseEntity.ok(this.examService.insert(exam));
    }

    /**
     * 编辑数据
     *
     * @param exam 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Exam> edit(Exam exam) {
        return ResponseEntity.ok(this.examService.update(exam));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.examService.deleteById(id));
    }

    @PostMapping("schedule")
    public DataResult schedule(ExamVo examVo){
        String sid=examVo.getSid();
        return DataResult.successByDataArray(examService.schedule(sid));
    }
    @PostMapping("teacher_schedule")
    public DataResult teacher_schedule(Teacher_scheduleVo teacher_scheduleVo){
        String tid=teacher_scheduleVo.getTid();
        return DataResult.successByDataArray(examService.teacher_schedule(tid));
    }

}

