package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.Exam;
import com.scu.springboot.demo.entity.ExamScore;
import com.scu.springboot.demo.dao.ExamScoreDao;
import com.scu.springboot.demo.service.ExamScoreService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ExamScore)表服务实现类
 *
 * @author makejava
 * @since 2022-07-16 15:53:39
 */
@Service("examScoreService")
public class ExamScoreServiceImpl implements ExamScoreService {
    @Resource
    private ExamScoreDao examScoreDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public ExamScore queryById(String sid) {
        return this.examScoreDao.queryById(sid);
    }

    /**
     * 分页查询
     *
     * @param examScore 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ExamScore> queryByPage(ExamScore examScore, PageRequest pageRequest) {
        long total = this.examScoreDao.count(examScore);
        return new PageImpl<>(this.examScoreDao.queryAllByLimit(examScore, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param examScore 实例对象
     * @return 实例对象
     */
    @Override
    public ExamScore insert(ExamScore examScore) {
        this.examScoreDao.insert(examScore);
        return examScore;
    }

    /**
     * 修改数据
     *
     * @param examScore 实例对象
     * @return 实例对象
     */
    @Override
    public ExamScore update(ExamScore examScore) {
        this.examScoreDao.update(examScore);
        return this.queryById(examScore.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String sid) {
        return this.examScoreDao.deleteById(sid) > 0;
    }

    @Override
    public List<ExamScore> getAllScore(String sid){return examScoreDao.getAllScore(sid); }

    @Override
    public List<ExamScore> searchScore(ExamScore examScore){return examScoreDao.searchScore(examScore);}





}
