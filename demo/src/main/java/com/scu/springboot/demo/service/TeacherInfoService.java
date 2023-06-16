package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.TeacherInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (TeacherInfo)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 19:59:01
 */
public interface TeacherInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    TeacherInfo queryById(String tid);

    /**
     * 分页查询
     *
     * @param teacherInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TeacherInfo> queryByPage(TeacherInfo teacherInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param teacherInfo 实例对象
     * @return 实例对象
     */
    TeacherInfo insert(TeacherInfo teacherInfo);

    /**
     * 修改数据
     *
     * @param teacherInfo 实例对象
     * @return 实例对象
     */
    TeacherInfo update(TeacherInfo teacherInfo);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    boolean deleteById(String tid);

    List<TeacherInfo> getAllTeachers(String tid);

    List<TeacherInfo> searchTeacher(TeacherInfo teacherInfo);

}
