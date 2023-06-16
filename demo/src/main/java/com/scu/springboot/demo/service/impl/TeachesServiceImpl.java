package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.Teaches;
import com.scu.springboot.demo.dao.TeachesDao;
import com.scu.springboot.demo.service.TeachesService;
import com.scu.springboot.demo.vo.Class_timeVo;
import com.scu.springboot.demo.vo.StudentVo;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Teaches)表服务实现类
 *
 * @author makejava
 * @since 2022-07-20 02:27:13
 */
@Service("teachesService")
public class TeachesServiceImpl implements TeachesService {
    @Resource
    private TeachesDao teachesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    @Override
    public Teaches queryById(String tid) {
        return this.teachesDao.queryById(tid);
    }

    /**
     * 分页查询
     *
     * @param teaches 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Teaches> queryByPage(Teaches teaches, PageRequest pageRequest) {
        long total = this.teachesDao.count(teaches);
        return new PageImpl<>(this.teachesDao.queryAllByLimit(teaches, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param teaches 实例对象
     * @return 实例对象
     */
    @Override
    public Teaches insert(Teaches teaches) {
        this.teachesDao.insert(teaches);
        return teaches;
    }

    /**
     * 修改数据
     *
     * @param teaches 实例对象
     * @return 实例对象
     */
    @Override
    public Teaches update(Teaches teaches) {
        this.teachesDao.update(teaches);
        return this.queryById(teaches.getTid());
    }

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String tid) {
        return this.teachesDao.deleteById(tid) > 0;
    }


    public List<Class_timeVo> class_time(String tid) {
        return teachesDao.class_time(tid);
    }
}
