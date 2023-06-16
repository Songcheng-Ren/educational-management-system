package com.scu.springboot.demo.dao;

import com.scu.springboot.demo.entity.College;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (College)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-20 01:09:14
 */
public interface CollegeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param major 主键
     * @return 实例对象
     */
    College queryById(String major);

    /**
     * 查询指定行数据
     *
     * @param college 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<College> queryAllByLimit(College college, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param college 查询条件
     * @return 总行数
     */
    long count(College college);

    /**
     * 新增数据
     *
     * @param college 实例对象
     * @return 影响行数
     */
    int insert(College college);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<College> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<College> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<College> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<College> entities);

    /**
     * 修改数据
     *
     * @param college 实例对象
     * @return 影响行数
     */
    int update(College college);

    /**
     * 通过主键删除数据
     *
     * @param major 主键
     * @return 影响行数
     */
    int deleteById(String major);

    College getAllMajor(College college);
}

