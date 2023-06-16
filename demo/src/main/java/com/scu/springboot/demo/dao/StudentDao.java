package com.scu.springboot.demo.dao;

import com.scu.springboot.demo.entity.Student;
import com.scu.springboot.demo.vo.StudentVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Student)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-19 10:31:22
 */
public interface StudentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Student queryById(String sid);

    /**
     * 查询指定行数据
     *
     * @param student 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Student> queryAllByLimit(Student student, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param student 查询条件
     * @return 总行数
     */
    long count(Student student);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int insert(Student student);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Student> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Student> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Student> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Student> entities);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 影响行数
     */
    int deleteById(String sid);
    List<StudentVo> statistic();

    List<StudentVo> enter_all();

    List<StudentVo> enter_real();

    Student studentLogin(Student student);

    List<Student> getAllStudentinfo(String sid);

    Student updatePassword(Student student);

    Student updatePhonenumber(Student student);

    Student searchScore(Student student);
}

