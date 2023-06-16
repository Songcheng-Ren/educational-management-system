package com.scu.springboot.demo.dao;

import com.scu.springboot.demo.entity.WorkPlan;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (WorkPlan)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-18 09:04:53
 */
public interface WorkPlanDao {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    WorkPlan queryById(String tid);

    /**
     * 查询指定行数据
     *
     * @param workPlan 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<WorkPlan> queryAllByLimit(WorkPlan workPlan, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param workPlan 查询条件
     * @return 总行数
     */
    long count(WorkPlan workPlan);

    /**
     * 新增数据
     *
     * @param workPlan 实例对象
     * @return 影响行数
     */
    int insert(WorkPlan workPlan);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WorkPlan> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WorkPlan> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WorkPlan> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WorkPlan> entities);

    /**
     * 修改数据
     *
     * @param workPlan 实例对象
     * @return 影响行数
     */
    int update(WorkPlan workPlan);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 影响行数
     */
    int deleteById(String tid);

    int insertPlan(WorkPlan workPlan);

    List<WorkPlan> searchPlan(WorkPlan workPlan);

    int removePlan(WorkPlan workPlan);

}

