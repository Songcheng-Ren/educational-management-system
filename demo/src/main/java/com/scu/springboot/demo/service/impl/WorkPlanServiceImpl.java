package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.WorkPlan;
import com.scu.springboot.demo.dao.WorkPlanDao;
import com.scu.springboot.demo.service.WorkPlanService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WorkPlan)表服务实现类
 *
 * @author makejava
 * @since 2022-07-18 09:04:53
 */
@Service("workPlanService")
public class WorkPlanServiceImpl implements WorkPlanService {
    @Resource
    private WorkPlanDao workPlanDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    @Override
    public WorkPlan queryById(String tid) {
        return this.workPlanDao.queryById(tid);
    }

    /**
     * 分页查询
     *
     * @param workPlan 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<WorkPlan> queryByPage(WorkPlan workPlan, PageRequest pageRequest) {
        long total = this.workPlanDao.count(workPlan);
        return new PageImpl<>(this.workPlanDao.queryAllByLimit(workPlan, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param workPlan 实例对象
     * @return 实例对象
     */
    @Override
    public WorkPlan insert(WorkPlan workPlan) {
        this.workPlanDao.insert(workPlan);
        return workPlan;
    }

    /**
     * 修改数据
     *
     * @param workPlan 实例对象
     * @return 实例对象
     */
    @Override
    public WorkPlan update(WorkPlan workPlan) {
        this.workPlanDao.update(workPlan);
        return this.queryById(workPlan.getTid());
    }

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String tid) {
        return this.workPlanDao.deleteById(tid) > 0;
    }

    public int insertPlan(WorkPlan workPlan) {
        return workPlanDao.insertPlan(workPlan);
    }
    public List<WorkPlan> searchPlan(WorkPlan workPlan) {
        return workPlanDao.searchPlan(workPlan);
    }

    public int removePlan(WorkPlan workPlan) {
        return workPlanDao.removePlan(workPlan);
    }
}
