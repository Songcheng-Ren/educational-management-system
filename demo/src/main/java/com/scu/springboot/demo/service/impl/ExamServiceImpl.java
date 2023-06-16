package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.Exam;
import com.scu.springboot.demo.dao.ExamDao;
import com.scu.springboot.demo.service.ExamService;
import com.scu.springboot.demo.vo.ExamVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import com.scu.springboot.demo.vo.Teacher_scheduleVo;
import javax.annotation.Resource;
import java.util.List;

/**
 * (Exam)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 11:04:30
 */
@Service("examService")
public class ExamServiceImpl implements ExamService {
    @Resource
    private ExamDao examDao;

    /**
     * 通过ID查询单条数据
     *
     * @param examId 主键
     * @return 实例对象
     */
    @Override
    public Exam queryById(Integer examId) {
        return this.examDao.queryById(examId);
    }

    /**
     * 分页查询
     *
     * @param exam 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Exam> queryByPage(Exam exam, PageRequest pageRequest) {
        long total = this.examDao.count(exam);
        return new PageImpl<>(this.examDao.queryAllByLimit(exam, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    @Override
    public Exam insert(Exam exam) {
        this.examDao.insert(exam);
        return exam;
    }

    /**
     * 修改数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    @Override
    public Exam update(Exam exam) {
        this.examDao.update(exam);
        return this.queryById(exam.getExamId());
    }

    /**
     * 通过主键删除数据
     *
     * @param examId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer examId) {
        return this.examDao.deleteById(examId) > 0;
    }
    public List<ExamVo> schedule(String sid) {
        return examDao.schedule(sid);
    }

    //xgq
    public List<Teacher_scheduleVo> teacher_schedule(String tid) {
        return examDao.teacher_schedule(tid);
    }


}
