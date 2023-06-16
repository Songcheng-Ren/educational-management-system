package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.Teaches;
import com.scu.springboot.demo.service.TeachesService;
import com.scu.springboot.demo.utils.DataResult;
import com.scu.springboot.demo.vo.Class_timeVo;
import com.scu.springboot.demo.vo.Teacher_scheduleVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Teaches)表控制层
 *
 * @author makejava
 * @since 2022-07-20 02:27:10
 */
@RestController
@RequestMapping("teaches")
public class TeachesController {
    /**
     * 服务对象
     */
    @Resource
    private TeachesService teachesService;

    /**
     * 分页查询
     *
     * @param teaches 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Teaches>> queryByPage(Teaches teaches, PageRequest pageRequest) {
        return ResponseEntity.ok(this.teachesService.queryByPage(teaches, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Teaches> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.teachesService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param teaches 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Teaches> add(Teaches teaches) {
        return ResponseEntity.ok(this.teachesService.insert(teaches));
    }

    /**
     * 编辑数据
     *
     * @param teaches 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Teaches> edit(Teaches teaches) {
        return ResponseEntity.ok(this.teachesService.update(teaches));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.teachesService.deleteById(id));
    }
    @PostMapping("class_time")
    public DataResult class_time(Class_timeVo class_timeVo){
        String tid=class_timeVo.getTid();
        System.err.println(tid);
        System.err.println(tid);
        System.err.println(tid);
        System.err.println(tid);
        return DataResult.successByDataArray(teachesService.class_time(tid));
    }

}

