package com.scu.springboot.demo.dao;

import com.scu.springboot.demo.entity.Fee;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Fee)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-16 15:01:38
 */
public interface FeeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Fee queryById(String sid);

    /**
     * 查询指定行数据
     *
     * @param fee 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Fee> queryAllByLimit(Fee fee, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param fee 查询条件
     * @return 总行数
     */
    long count(Fee fee);

    /**
     * 新增数据
     *
     * @param fee 实例对象
     * @return 影响行数
     */
    int insert(Fee fee);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Fee> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Fee> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Fee> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Fee> entities);

    /**
     * 修改数据
     *
     * @param fee 实例对象
     * @return 影响行数
     */
    int update(Fee fee);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 影响行数
     */
    int deleteById(String sid);

    List<Fee> getAllCost(String sid);

    int updateIsPaid(Fee fee);

}

