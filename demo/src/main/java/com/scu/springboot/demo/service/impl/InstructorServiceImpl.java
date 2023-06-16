package com.scu.springboot.demo.service.impl;


import com.scu.springboot.demo.entity.Instructor;
import com.scu.springboot.demo.dao.InstructorDao;
import com.scu.springboot.demo.service.InstructorService;
import com.scu.springboot.demo.vo.EvaluateVo;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Instructor)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 15:03:49
 */
@Service("instructorService")
public class InstructorServiceImpl implements InstructorService {
    @Resource
    private InstructorDao instructorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    @Override
    public Instructor queryById(String tid) {
        return this.instructorDao.queryById(tid);
    }

    /**
     * 分页查询
     *
     * @param instructor 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Instructor> queryByPage(Instructor instructor, PageRequest pageRequest) {
        long total = this.instructorDao.count(instructor);
        return new PageImpl<>(this.instructorDao.queryAllByLimit(instructor, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param instructor 实例对象
     * @return 实例对象
     */
    @Override
    public Instructor insert(Instructor instructor) {
        this.instructorDao.insert(instructor);
        return instructor;
    }

    /**
     * 修改数据
     *
     * @param instructor 实例对象
     * @return 实例对象
     */
    @Override
    public Instructor update(Instructor instructor) {
        this.instructorDao.update(instructor);
        return this.queryById(instructor.getTid());
    }

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String tid) {
        return this.instructorDao.deleteById(tid) > 0;
    }

    public List<Instructor> information() {
        return instructorDao.information();
    }

    public void change_dept(String id, String dept){
        instructorDao.change_dept(id,dept);
    }

    public Instructor teacherLogin(Instructor instructor) {
        return instructorDao.teacherLogin(instructor);
    }
    public List<Instructor> getAllTeacherInfomation(String tid) {return instructorDao.getAllTeacherInfomation(tid);}

    public List<Instructor> updatePassword(Instructor instructor) {
        instructorDao.update(instructor);
        String tid = instructor.getTid();
        return instructorDao.getAllTeacherInfomation(tid);
    }

    public List<Instructor> updatePhonenumber(Instructor instructor) {
        instructorDao.update(instructor);
        String tid = instructor.getTid();
        return instructorDao.getAllTeacherInfomation(tid);
    }


}
