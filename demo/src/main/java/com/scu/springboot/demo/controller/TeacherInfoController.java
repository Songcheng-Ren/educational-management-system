package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.TeacherInfo;
import com.scu.springboot.demo.service.TeacherInfoService;
import com.scu.springboot.demo.utils.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TeacherInfo)表控制层
 *
 * @author makejava
 * @since 2022-07-17 19:59:01
 */
@RestController
@RequestMapping("teacherInfo")
public class TeacherInfoController {
    /**
     * 服务对象
     */
    @Resource
    private TeacherInfoService teacherInfoService;

    /**
     * 分页查询
     *
     * @param teacherInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TeacherInfo>> queryByPage(TeacherInfo teacherInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.teacherInfoService.queryByPage(teacherInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TeacherInfo> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.teacherInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param teacherInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TeacherInfo> add(TeacherInfo teacherInfo) {
        return ResponseEntity.ok(this.teacherInfoService.insert(teacherInfo));
    }

    /**
     * 编辑数据
     *
     * @param teacherInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TeacherInfo> edit(TeacherInfo teacherInfo) {
        return ResponseEntity.ok(this.teacherInfoService.update(teacherInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.teacherInfoService.deleteById(id));
    }

    @PostMapping("getAllTeachers")
    public DataResult getAllTeachers(TeacherInfo teacherInfo){
        String tid = teacherInfo.getTid();
        return DataResult.successByDataArray(teacherInfoService.getAllTeachers(tid));
    }

    @PostMapping("searchTeacher")
    public DataResult searchTeacher(TeacherInfo teacherInfo){
        return DataResult.successByDataArray(teacherInfoService.searchTeacher(teacherInfo));
    }
}

