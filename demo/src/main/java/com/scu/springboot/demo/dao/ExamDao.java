package com.scu.springboot.demo.dao;

import com.scu.springboot.demo.entity.Exam;
import com.scu.springboot.demo.vo.ExamVo;
import com.scu.springboot.demo.vo.Teacher_scheduleVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Exam)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 11:04:28
 */
public interface ExamDao {

    /**
     * 通过ID查询单条数据
     *
     * @param examId 主键
     * @return 实例对象
     */
    Exam queryById(Integer examId);

    /**
     * 查询指定行数据
     *
     * @param exam 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Exam> queryAllByLimit(Exam exam, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param exam 查询条件
     * @return 总行数
     */
    long count(Exam exam);

    /**
     * 新增数据
     *
     * @param exam 实例对象
     * @return 影响行数
     */
    int insert(Exam exam);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Exam> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Exam> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Exam> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Exam> entities);

    /**
     * 修改数据
     *
     * @param exam 实例对象
     * @return 影响行数
     */
    int update(Exam exam);

    /**
     * 通过主键删除数据
     *
     * @param examId 主键
     * @return 影响行数
     */
    int deleteById(Integer examId);
    List<ExamVo> schedule(String sid);
    List<Teacher_scheduleVo> teacher_schedule(String tid);

}

