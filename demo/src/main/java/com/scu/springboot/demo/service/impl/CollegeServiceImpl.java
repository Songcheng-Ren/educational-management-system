package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.College;
import com.scu.springboot.demo.dao.CollegeDao;
import com.scu.springboot.demo.service.CollegeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (College)表服务实现类
 *
 * @author makejava
 * @since 2022-07-20 01:09:14
 */
@Service("collegeService")
public class CollegeServiceImpl implements CollegeService {
    @Resource
    private CollegeDao collegeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param major 主键
     * @return 实例对象
     */
    @Override
    public College queryById(String major) {
        return this.collegeDao.queryById(major);
    }

    /**
     * 分页查询
     *
     * @param college 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<College> queryByPage(College college, PageRequest pageRequest) {
        long total = this.collegeDao.count(college);
        return new PageImpl<>(this.collegeDao.queryAllByLimit(college, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    @Override
    public College insert(College college) {
        this.collegeDao.insert(college);
        return college;
    }

    /**
     * 修改数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    @Override
    public College update(College college) {
        this.collegeDao.update(college);
        return this.queryById(college.getMajor());
    }

    /**
     * 通过主键删除数据
     *
     * @param major 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String major) {
        return this.collegeDao.deleteById(major) > 0;
    }

    public College getAllMajor(College college) {
        return collegeDao.getAllMajor(college);
    }
}
