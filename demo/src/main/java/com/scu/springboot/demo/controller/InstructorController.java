package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.Instructor;
import com.scu.springboot.demo.service.InstructorService;
import com.scu.springboot.demo.utils.DataResult;
import com.scu.springboot.demo.vo.EvaluateVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Instructor)表控制层
 *
 * @author makejava
 * @since 2022-07-17 15:03:49
 */
@RestController
@RequestMapping("instructor")
public class InstructorController {
    /**
     * 服务对象
     */
    @Resource
    private InstructorService instructorService;

    /**
     * 分页查询
     *
     * @param instructor 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Instructor>> queryByPage(Instructor instructor, PageRequest pageRequest) {
        return ResponseEntity.ok(this.instructorService.queryByPage(instructor, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Instructor> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.instructorService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param instructor 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Instructor> add(Instructor instructor) {
        return ResponseEntity.ok(this.instructorService.insert(instructor));
    }

    /**
     * 编辑数据
     *
     * @param instructor 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Instructor> edit(Instructor instructor) {
        return ResponseEntity.ok(this.instructorService.update(instructor));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.instructorService.deleteById(id));
    }

    @PostMapping("information")
    public DataResult information(){
        return DataResult.successByDataArray(instructorService.information());
    }

    @PostMapping("change_dept")
    public DataResult change_dept(Instructor instructor){
        String id=instructor.getTid();
        String dept=instructor.getDeptName();
        instructorService.change_dept(id, dept);
        return DataResult.successByDataArray(null);
    }
    @PostMapping("getAllTeacherInfomation")
    private DataResult getAllTeacherInfomation(Instructor instructor){
        String tid = instructor.getTid();
        return DataResult.successByDataArray(instructorService.getAllTeacherInfomation(tid));
    }

    @PostMapping("updatePassword")
    public DataResult updatePassword(Instructor instructor) {
        return DataResult.successByDataArray(instructorService.updatePassword(instructor));
    }

    @PostMapping("updatePhonenumber")
    public DataResult updatePhonenumber(Instructor instructor){
        return DataResult.successByDataArray(instructorService.updatePhonenumber(instructor));
    }


}