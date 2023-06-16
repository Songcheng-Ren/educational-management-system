package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.TeacherInfo;
import com.scu.springboot.demo.dao.TeacherInfoDao;
import com.scu.springboot.demo.service.TeacherInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TeacherInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 19:59:01
 */
@Service("teacherInfoService")
public class TeacherInfoServiceImpl implements TeacherInfoService {
    @Resource
    private TeacherInfoDao teacherInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    @Override
    public TeacherInfo queryById(String tid) {
        return this.teacherInfoDao.queryById(tid);
    }

    /**
     * 分页查询
     *
     * @param teacherInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TeacherInfo> queryByPage(TeacherInfo teacherInfo, PageRequest pageRequest) {
        long total = this.teacherInfoDao.count(teacherInfo);
        return new PageImpl<>(this.teacherInfoDao.queryAllByLimit(teacherInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param teacherInfo 实例对象
     * @return 实例对象
     */
    @Override
    public TeacherInfo insert(TeacherInfo teacherInfo) {
        this.teacherInfoDao.insert(teacherInfo);
        return teacherInfo;
    }

    /**
     * 修改数据
     *
     * @param teacherInfo 实例对象
     * @return 实例对象
     */
    @Override
    public TeacherInfo update(TeacherInfo teacherInfo) {
        this.teacherInfoDao.update(teacherInfo);
        return this.queryById(teacherInfo.getTid());
    }

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String tid) {
        return this.teacherInfoDao.deleteById(tid) > 0;
    }

    @Override
    public List<TeacherInfo> getAllTeachers(String tid) {return teacherInfoDao.getAllTeachers(tid);}

    @Override
    public List<TeacherInfo> searchTeacher(TeacherInfo teacherInfo) {return teacherInfoDao.searchTeacher(teacherInfo);}
}
