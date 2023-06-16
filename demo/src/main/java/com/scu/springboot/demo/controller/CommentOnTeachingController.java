package com.scu.springboot.demo.controller;

import com.scu.springboot.demo.entity.CommentOnTeaching;
import com.scu.springboot.demo.service.CommentOnTeachingService;
import com.scu.springboot.demo.utils.DataResult;
import com.scu.springboot.demo.vo.Evaluate_resultVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CommentOnTeaching)表控制层
 *
 * @author makejava
 * @since 2022-07-17 22:32:50
 */
@RestController
@RequestMapping("commentOnTeaching")
public class CommentOnTeachingController {
    /**
     * 服务对象
     */
    @Resource
    private CommentOnTeachingService commentOnTeachingService;

    /**
     * 分页查询
     *
     * @param commentOnTeaching 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<CommentOnTeaching>> queryByPage(CommentOnTeaching commentOnTeaching, PageRequest pageRequest) {
        return ResponseEntity.ok(this.commentOnTeachingService.queryByPage(commentOnTeaching, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<CommentOnTeaching> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.commentOnTeachingService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param commentOnTeaching 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<CommentOnTeaching> add(CommentOnTeaching commentOnTeaching) {
        return ResponseEntity.ok(this.commentOnTeachingService.insert(commentOnTeaching));
    }

    /**
     * 编辑数据
     *
     * @param commentOnTeaching 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<CommentOnTeaching> edit(CommentOnTeaching commentOnTeaching) {
        return ResponseEntity.ok(this.commentOnTeachingService.update(commentOnTeaching));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.commentOnTeachingService.deleteById(id));
    }

    @PostMapping("evaluate_result")
    public DataResult evaluate_result(){
        return DataResult.successByDataArray(commentOnTeachingService.evaluate_result());
    }

    @PostMapping("single_evaluation")
    public DataResult single_evaluation(Evaluate_resultVo evaluate_resultVo){
        String tid=evaluate_resultVo.getTid();
        return DataResult.successByDataArray(commentOnTeachingService.single_evaluation(tid));
    }
}

