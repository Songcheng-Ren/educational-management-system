package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.CommentOnTeaching;
import com.scu.springboot.demo.vo.Evaluate_resultVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (CommentOnTeaching)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 22:32:52
 */
public interface CommentOnTeachingService {

    /**
     * 通过ID查询单条数据
     *
     * @param index 主键
     * @return 实例对象
     */
    CommentOnTeaching queryById(Integer index);

    /**
     * 分页查询
     *
     * @param commentOnTeaching 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<CommentOnTeaching> queryByPage(CommentOnTeaching commentOnTeaching, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param commentOnTeaching 实例对象
     * @return 实例对象
     */
    CommentOnTeaching insert(CommentOnTeaching commentOnTeaching);

    /**
     * 修改数据
     *
     * @param commentOnTeaching 实例对象
     * @return 实例对象
     */
    CommentOnTeaching update(CommentOnTeaching commentOnTeaching);

    /**
     * 通过主键删除数据
     *
     * @param index 主键
     * @return 是否成功
     */
    boolean deleteById(Integer index);

    List<Evaluate_resultVo> evaluate_result();

    List<Evaluate_resultVo> single_evaluation(String tid);
}
