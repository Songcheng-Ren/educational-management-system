package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.College;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (College)表服务接口
 *
 * @author makejava
 * @since 2022-07-20 01:09:14
 */
public interface CollegeService {

    /**
     * 通过ID查询单条数据
     *
     * @param major 主键
     * @return 实例对象
     */
    College queryById(String major);

    /**
     * 分页查询
     *
     * @param college 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<College> queryByPage(College college, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    College insert(College college);

    /**
     * 修改数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    College update(College college);

    /**
     * 通过主键删除数据
     *
     * @param major 主键
     * @return 是否成功
     */
    boolean deleteById(String major);

    College getAllMajor(College college);

}
