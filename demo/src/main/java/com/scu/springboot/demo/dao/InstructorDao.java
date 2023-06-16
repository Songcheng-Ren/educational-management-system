package com.scu.springboot.demo.dao;

import com.scu.springboot.demo.entity.Instructor;
import com.scu.springboot.demo.vo.EvaluateVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Instructor)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 15:03:49
 */
public interface InstructorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    Instructor queryById(String tid);

    /**
     * 查询指定行数据
     *
     * @param instructor 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Instructor> queryAllByLimit(Instructor instructor, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param instructor 查询条件
     * @return 总行数
     */
    long count(Instructor instructor);

    /**
     * 新增数据
     *
     * @param instructor 实例对象
     * @return 影响行数
     */
    int insert(Instructor instructor);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Instructor> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Instructor> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Instructor> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Instructor> entities);

    /**
     * 修改数据
     *
     * @param instructor 实例对象
     * @return 影响行数
     */
    int update(Instructor instructor);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 影响行数
     */
    int deleteById(String tid);

    List<Instructor> information();

    int change_dept(String id, String dept);

    Instructor teacherLogin(Instructor instructor);

    List<Instructor> getAllTeacherInfomation(String tid);

    Instructor updatePassword(Instructor instructor);

    Instructor updatePhonenumber(Instructor instructor);

}

