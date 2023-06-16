package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.ClassSchedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.awt.*;
import java.util.List;

/**
 * (ClassSchedule)表服务接口
 *
 * @author makejava
 * @since 2022-07-19 13:34:49
 */
public interface ClassScheduleService {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    ClassSchedule queryById(String sid);

    /**
     * 分页查询
     *
     * @param classSchedule 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ClassSchedule> queryByPage(ClassSchedule classSchedule, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param classSchedule 实例对象
     * @return 实例对象
     */
    ClassSchedule insert(ClassSchedule classSchedule);

    /**
     * 修改数据
     *
     * @param classSchedule 实例对象
     * @return 实例对象
     */
    ClassSchedule update(ClassSchedule classSchedule);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(String sid);

    List<ClassSchedule> getAllClass(String sid);
}
