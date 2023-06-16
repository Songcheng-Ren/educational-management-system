package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.Administrator;
import com.scu.springboot.demo.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Administrator)表服务接口
 *
 * @author makejava
 * @since 2022-07-19 15:43:30
 */
public interface AdministratorService {

    /**
     * 通过ID查询单条数据
     *
     * @param adminid 主键
     * @return 实例对象
     */
    Administrator queryById(String adminid);

    /**
     * 分页查询
     *
     * @param administrator 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Administrator> queryByPage(Administrator administrator, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param administrator 实例对象
     * @return 实例对象
     */
    Administrator insert(Administrator administrator);

    /**
     * 修改数据
     *
     * @param administrator 实例对象
     * @return 实例对象
     */
    Administrator update(Administrator administrator);

    /**
     * 通过主键删除数据
     *
     * @param adminid 主键
     * @return 是否成功
     */
    boolean deleteById(String adminid);

    Administrator leaderLogin(Administrator administrator);

}
