package com.scu.springboot.demo.dao;

import com.scu.springboot.demo.entity.TeacherInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (TeacherInfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 19:59:01
 */
public interface TeacherInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    TeacherInfo queryById(String tid);

    /**
     * 查询指定行数据
     *
     * @param teacherInfo 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TeacherInfo> queryAllByLimit(TeacherInfo teacherInfo, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param teacherInfo 查询条件
     * @return 总行数
     */
    long count(TeacherInfo teacherInfo);

    /**
     * 新增数据
     *
     * @param teacherInfo 实例对象
     * @return 影响行数
     */
    int insert(TeacherInfo teacherInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TeacherInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TeacherInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TeacherInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TeacherInfo> entities);

    /**
     * 修改数据
     *
     * @param teacherInfo 实例对象
     * @return 影响行数
     */
    int update(TeacherInfo teacherInfo);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 影响行数
     */
    int deleteById(String tid);

    List<TeacherInfo> getAllTeachers(String tid);

    List<TeacherInfo> searchTeacher(TeacherInfo teacherInfo);

}

