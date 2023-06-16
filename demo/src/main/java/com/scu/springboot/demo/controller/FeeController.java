package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.Fee;
import com.scu.springboot.demo.entity.Student;
import com.scu.springboot.demo.service.FeeService;
import com.scu.springboot.demo.utils.DataResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Fee)表控制层
 *
 * @author makejava
 * @since 2022-07-16 15:01:38
 */
@RestController
@RequestMapping("fee")
public class FeeController {
    /**
     * 服务对象
     */
    @Resource
    private FeeService feeService;

    /**
     * 分页查询
     *
     * @param fee 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Fee>> queryByPage(Fee fee, PageRequest pageRequest) {
        return ResponseEntity.ok(this.feeService.queryByPage(fee, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Fee> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.feeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param fee 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Fee> add(Fee fee) {
        return ResponseEntity.ok(this.feeService.insert(fee));
    }

    /**
     * 编辑数据
     *
     * @param fee 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Fee> edit(Fee fee) {
        return ResponseEntity.ok(this.feeService.update(fee));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.feeService.deleteById(id));
    }

    @PostMapping("getAllCost")
    public DataResult getAllCost(Student student) {

        return DataResult.successByDataArray(feeService.getAllCost(student.getSid()));
    }
    @PostMapping("updateIsPaid")
    public DataResult updateIsPaid(Fee fee) {
        fee.setCostState("已交");
        feeService.updateIsPaid(fee);
        return DataResult.successByDataArray(null);
    }

}

