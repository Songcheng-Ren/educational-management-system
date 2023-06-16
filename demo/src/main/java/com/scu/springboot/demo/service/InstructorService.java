package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.Instructor;
import com.scu.springboot.demo.entity.Student;
import com.scu.springboot.demo.vo.EvaluateVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Instructor)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 15:03:49
 */
public interface InstructorService {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    Instructor queryById(String tid);

    /**
     * 分页查询
     *
     * @param instructor 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Instructor> queryByPage(Instructor instructor, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param instructor 实例对象
     * @return 实例对象
     */
    Instructor insert(Instructor instructor);

    /**
     * 修改数据
     *
     * @param instructor 实例对象
     * @return 实例对象
     */
    Instructor update(Instructor instructor);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    boolean deleteById(String tid);

    List<Instructor> information();

    void change_dept(String id, String dept);

    Instructor teacherLogin(Instructor instructor);

    List<Instructor> getAllTeacherInfomation(String tid);

    List<Instructor> updatePassword(Instructor instructor);

    List<Instructor> updatePhonenumber(Instructor instructor);


}
