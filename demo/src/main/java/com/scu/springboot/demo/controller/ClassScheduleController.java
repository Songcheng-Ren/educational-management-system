package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.ClassSchedule;
import com.scu.springboot.demo.service.ClassScheduleService;
import com.scu.springboot.demo.utils.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ClassSchedule)表控制层
 *
 * @author makejava
 * @since 2022-07-19 13:34:49
 */
@RestController
@RequestMapping("classSchedule")
public class ClassScheduleController {
    /**
     * 服务对象
     */
    @Resource
    private ClassScheduleService classScheduleService;

    /**
     * 分页查询
     *
     * @param classSchedule 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<ClassSchedule>> queryByPage(ClassSchedule classSchedule, PageRequest pageRequest) {
        return ResponseEntity.ok(this.classScheduleService.queryByPage(classSchedule, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ClassSchedule> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.classScheduleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param classSchedule 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ClassSchedule> add(ClassSchedule classSchedule) {
        return ResponseEntity.ok(this.classScheduleService.insert(classSchedule));
    }

    /**
     * 编辑数据
     *
     * @param classSchedule 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ClassSchedule> edit(ClassSchedule classSchedule) {
        return ResponseEntity.ok(this.classScheduleService.update(classSchedule));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.classScheduleService.deleteById(id));
    }

    @PostMapping("getAllClass")
    public DataResult getAllCourse(ClassSchedule classSchedule){
        String sid = classSchedule.getSid();
        return DataResult.successByDataArray(classScheduleService.getAllClass(sid));
    }
}

