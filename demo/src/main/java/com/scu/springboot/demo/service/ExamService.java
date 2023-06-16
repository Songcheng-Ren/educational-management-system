package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.Exam;
import com.scu.springboot.demo.vo.ExamVo;
import com.scu.springboot.demo.vo.Teacher_scheduleVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Exam)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 11:04:30
 */
public interface ExamService {

    /**
     * 通过ID查询单条数据
     *
     * @param examId 主键
     * @return 实例对象
     */
    Exam queryById(Integer examId);

    /**
     * 分页查询
     *
     * @param exam 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Exam> queryByPage(Exam exam, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    Exam insert(Exam exam);

    /**
     * 修改数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    Exam update(Exam exam);

    /**
     * 通过主键删除数据
     *
     * @param examId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer examId);
    List<ExamVo> schedule(String sid);

    //xgq
    //根据课程号查询课程
    List<Teacher_scheduleVo> teacher_schedule(String tid);


}
