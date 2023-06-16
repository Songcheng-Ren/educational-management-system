package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.WorkPlan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (WorkPlan)表服务接口
 *
 * @author makejava
 * @since 2022-07-18 09:04:53
 */
public interface WorkPlanService {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    WorkPlan queryById(String tid);

    /**
     * 分页查询
     *
     * @param workPlan 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<WorkPlan> queryByPage(WorkPlan workPlan, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param workPlan 实例对象
     * @return 实例对象
     */
    WorkPlan insert(WorkPlan workPlan);

    /**
     * 修改数据
     *
     * @param workPlan 实例对象
     * @return 实例对象
     */
    WorkPlan update(WorkPlan workPlan);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    boolean deleteById(String tid);
    int insertPlan(WorkPlan workPlan);

    List<WorkPlan> searchPlan(WorkPlan workPlan);

    int removePlan(WorkPlan workPlan);
}
