package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.Student;
import com.scu.springboot.demo.service.StudentService;
import com.scu.springboot.demo.utils.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2022-07-19 10:31:19
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    /**
     * 分页查询
     *
     * @param student 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Student>> queryByPage(Student student, PageRequest pageRequest) {
        return ResponseEntity.ok(this.studentService.queryByPage(student, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Student> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.studentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param student 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Student> add(Student student) {
        return ResponseEntity.ok(this.studentService.insert(student));
    }

    /**
     * 编辑数据
     *
     * @param student 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Student> edit(Student student) {
        return ResponseEntity.ok(this.studentService.update(student));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.studentService.deleteById(id));
    }
    @PostMapping("statistic")
    public DataResult statistic(){
        return DataResult.successByDataArray(studentService.statistic());
    }

    @PostMapping("enter_rate")
    public DataResult enter_rate(){
        return DataResult.successByDataArray(studentService.enter_rate());
    }

    @PostMapping("getAllStudentinfo")
    public DataResult getAllStudentinfo(Student student) {
        String sID = student.getSid();
        return DataResult.successByDataArray(studentService.getAllStudentinfo(sID));
    }
    @PostMapping("updatePassword")
    public DataResult updatePassword(Student student) {
        return DataResult.successByDataArray(studentService.updatePassword(student));
    }
    @PostMapping("updatePhonenumber")
    public DataResult updatePhonenumber(Student student){
        return DataResult.successByDataArray(studentService.updatePhonenumber(student));
    }
}

