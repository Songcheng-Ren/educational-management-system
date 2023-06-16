package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.Student;
import com.scu.springboot.demo.vo.StudentVo;
import com.scu.springboot.demo.vo.StudentVo1;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2022-07-19 10:31:23
 */
public interface StudentService {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Student queryById(String sid);

    /**
     * 分页查询
     *
     * @param student 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Student> queryByPage(Student student, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(String sid);
    List<StudentVo> statistic();

    List<StudentVo1> enter_rate();

    Student studentLogin(Student student);

    List<Student> getAllStudentinfo(String sid);

    List<Student> updatePassword(Student student);

    List<Student> updatePhonenumber(Student student);
}
