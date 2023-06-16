package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.ExamScore;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (ExamScore)表服务接口
 *
 * @author makejava
 * @since 2022-07-16 15:53:38
 */
public interface ExamScoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    ExamScore queryById(String sid);

    /**
     * 分页查询
     *
     * @param examScore 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ExamScore> queryByPage(ExamScore examScore, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param examScore 实例对象
     * @return 实例对象
     */
    ExamScore insert(ExamScore examScore);

    /**
     * 修改数据
     *
     * @param examScore 实例对象
     * @return 实例对象
     */
    ExamScore update(ExamScore examScore);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(String sid);

    List<ExamScore> getAllScore(String sid);

    List<ExamScore> searchScore(ExamScore examScore);
}
