package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.Student;
import com.scu.springboot.demo.dao.StudentDao;
import com.scu.springboot.demo.service.StudentService;
import com.scu.springboot.demo.vo.StudentVo;
import com.scu.springboot.demo.vo.StudentVo1;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2022-07-19 10:31:24
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(String sid) {
        return this.studentDao.queryById(sid);
    }

    /**
     * 分页查询
     *
     * @param student 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Student> queryByPage(Student student, PageRequest pageRequest) {
        long total = this.studentDao.count(student);
        return new PageImpl<>(this.studentDao.queryAllByLimit(student, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryById(student.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String sid) {
        return this.studentDao.deleteById(sid) > 0;
    }
    public List<StudentVo> statistic() {
        return studentDao.statistic();
    }
    public List<StudentVo1> enter_rate() {

        List<StudentVo> list_all=studentDao.enter_all();
        List<StudentVo> list_real=studentDao.enter_real();
        List<StudentVo1> list=new ArrayList<>();
        for(int i=0;i<list_all.size();i++){
            boolean bool=true;
            for(int j=0;j<list_real.size();j++){
                if(list_all.get(i).getDeptName().equals(list_real.get(j).getDeptName())){
                    StudentVo1 studentVo1=new StudentVo1();
                    studentVo1.setDeptName(list_all.get(i).getDeptName());
                    double a=Double.valueOf(list_real.get(j).getCount_enter());
                    double b=Double.valueOf(list_all.get(i).getCount_all());
                    studentVo1.setCount_rate(a/b);
                    studentVo1.setCount_enter(list_real.get(j).getCount_enter());
                    studentVo1.setCount_all(list_all.get(i).getCount_all());
                    list.add(studentVo1);
                    bool=false;
                }
            }
            if(bool){
                StudentVo1 studentVo1=new StudentVo1();
                studentVo1.setDeptName(list_all.get(i).getDeptName());
                studentVo1.setCount_enter(0);
                studentVo1.setCount_rate(0);
                studentVo1.setCount_all(list_all.get(i).getCount_all());
                list.add(studentVo1);
            }
        }

        return list;
    }
    public Student studentLogin(Student student){
        return studentDao.studentLogin(student);
    }

    public List<Student> getAllStudentinfo(String sid) {
        return studentDao.getAllStudentinfo(sid);
    }

    public List<Student> updatePassword(Student student) {
        studentDao.update(student);
        String sid = student.getSid();
        return studentDao.getAllStudentinfo(sid);
    }

    public List<Student> updatePhonenumber(Student student) {
        studentDao.update(student);
        String sid = student.getSid();
        return studentDao.getAllStudentinfo(sid);
    }
}
