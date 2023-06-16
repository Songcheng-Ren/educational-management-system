package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.ClassSchedule;
import com.scu.springboot.demo.dao.ClassScheduleDao;
import com.scu.springboot.demo.service.ClassScheduleService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ClassSchedule)表服务实现类
 *
 * @author makejava
 * @since 2022-07-19 13:34:50
 */
@Service("classScheduleService")
public class ClassScheduleServiceImpl implements ClassScheduleService {
    @Resource
    private ClassScheduleDao classScheduleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public ClassSchedule queryById(String sid) {
        return this.classScheduleDao.queryById(sid);
    }

    /**
     * 分页查询
     *
     * @param classSchedule 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ClassSchedule> queryByPage(ClassSchedule classSchedule, PageRequest pageRequest) {
        long total = this.classScheduleDao.count(classSchedule);
        return new PageImpl<>(this.classScheduleDao.queryAllByLimit(classSchedule, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param classSchedule 实例对象
     * @return 实例对象
     */
    @Override
    public ClassSchedule insert(ClassSchedule classSchedule) {
        this.classScheduleDao.insert(classSchedule);
        return classSchedule;
    }

    /**
     * 修改数据
     *
     * @param classSchedule 实例对象
     * @return 实例对象
     */
    @Override
    public ClassSchedule update(ClassSchedule classSchedule) {
        this.classScheduleDao.update(classSchedule);
        return this.queryById(classSchedule.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String sid) {
        return this.classScheduleDao.deleteById(sid) > 0;
    }

    @Override
    public List<ClassSchedule> getAllClass(String sid){return classScheduleDao.getAllClass(sid);}
}
