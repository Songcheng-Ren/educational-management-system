package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.WorkPlan;
import com.scu.springboot.demo.service.WorkPlanService;
import com.scu.springboot.demo.utils.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WorkPlan)表控制层
 *
 * @author makejava
 * @since 2022-07-18 09:04:53
 */
@RestController
@RequestMapping("workPlan")
public class WorkPlanController {
    /**
     * 服务对象
     */
    @Resource
    private WorkPlanService workPlanService;

    /**
     * 分页查询
     *
     * @param workPlan 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<WorkPlan>> queryByPage(WorkPlan workPlan, PageRequest pageRequest) {
        return ResponseEntity.ok(this.workPlanService.queryByPage(workPlan, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<WorkPlan> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.workPlanService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param workPlan 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<WorkPlan> add(WorkPlan workPlan) {
        return ResponseEntity.ok(this.workPlanService.insert(workPlan));
    }

    /**
     * 编辑数据
     *
     * @param workPlan 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<WorkPlan> edit(WorkPlan workPlan) {
        return ResponseEntity.ok(this.workPlanService.update(workPlan));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.workPlanService.deleteById(id));
    }
    @PostMapping("insertPlan")
    public DataResult insertPlan(WorkPlan workPlan) {
        workPlanService.insertPlan(workPlan);
        return DataResult.successByDataArray(null);
    }
    @PostMapping("searchPlan")
    public DataResult searchPlan(WorkPlan workPlan) {
        return DataResult.successByDataArray(workPlanService.searchPlan(workPlan));
    }

    @PostMapping("removePlan")
    public DataResult removePlan(WorkPlan workPlan) {
        workPlanService.removePlan(workPlan);
        return DataResult.successByDataArray(null);
    }
}

