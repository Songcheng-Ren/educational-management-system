package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.CommentOnTeaching;
import com.scu.springboot.demo.entity.Takes;
import com.scu.springboot.demo.service.CommentOnTeachingService;
import com.scu.springboot.demo.service.TakesService;
import com.scu.springboot.demo.utils.DataResult;
import com.scu.springboot.demo.vo.EvaluateVo;
import com.scu.springboot.demo.vo.ScoreVo;
import com.scu.springboot.demo.vo.Student_listVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

/**
 * (Takes)表控制层
 *
 * @author makejava
 * @since 2022-07-15 22:11:53
 */
@RestController
@RequestMapping("takes")
public class TakesController {
    /**
     * 服务对象
     */
    @Resource
    private TakesService takesService;
    private CommentOnTeachingService commentOnTeachingService;


    /**
     * 分页查询
     *
     * @param takes 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Takes>> queryByPage(Takes takes, PageRequest pageRequest) {
        return ResponseEntity.ok(this.takesService.queryByPage(takes, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Takes> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.takesService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param takes 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Takes> add(Takes takes) {
        return ResponseEntity.ok(this.takesService.insert(takes));
    }

    /**
     * 编辑数据
     *
     * @param takes 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Takes> edit(Takes takes) {
        return ResponseEntity.ok(this.takesService.update(takes));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.takesService.deleteById(id));
    }

    @PostMapping("evaluate")
    public DataResult evaluate(EvaluateVo evaluateVo){
        String sid=evaluateVo.getSid();
        return DataResult.successByDataArray(takesService.evaluate(sid));
    }

    @PostMapping("update_evaluate")
    public DataResult update_evaluate(ScoreVo scoreVo){
        String id=scoreVo.getSid();
        String course_id=scoreVo.getCourseId();
        String sec_id=scoreVo.getSecId();
        String teacher_ID=scoreVo.getTeacherId();
        String semester=scoreVo.getSemester();
        String year=scoreVo.getYear();
        String score=scoreVo.getScore();
        takesService.update_evaluate(id,course_id,sec_id,teacher_ID,semester,year,score);
        return DataResult.successByData(null);
    }
    @PostMapping("student_list")
    public DataResult student_list(Student_listVo student_listVo){
        String courseId=student_listVo.getCourseId();
        String secId=student_listVo.getSecId();
        return DataResult.successByDataArray(takesService.student_list(courseId, secId));
    }

}

