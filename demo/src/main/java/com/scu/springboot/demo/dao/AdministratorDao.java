package com.scu.springboot.demo.dao;

import com.scu.springboot.demo.entity.Administrator;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Administrator)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-19 15:43:30
 */
public interface AdministratorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param adminid 主键
     * @return 实例对象
     */
    Administrator queryById(String adminid);

    /**
     * 查询指定行数据
     *
     * @param administrator 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Administrator> queryAllByLimit(Administrator administrator, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param administrator 查询条件
     * @return 总行数
     */
    long count(Administrator administrator);

    /**
     * 新增数据
     *
     * @param administrator 实例对象
     * @return 影响行数
     */
    int insert(Administrator administrator);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Administrator> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Administrator> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Administrator> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Administrator> entities);

    /**
     * 修改数据
     *
     * @param administrator 实例对象
     * @return 影响行数
     */
    int update(Administrator administrator);

    /**
     * 通过主键删除数据
     *
     * @param adminid 主键
     * @return 影响行数
     */
    int deleteById(String adminid);

    Administrator leaderLogin(Administrator administrator);

}

