package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.Administrator;
import com.scu.springboot.demo.dao.AdministratorDao;
import com.scu.springboot.demo.service.AdministratorService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Administrator)表服务实现类
 *
 * @author makejava
 * @since 2022-07-19 15:43:30
 */
@Service("administratorService")
public class AdministratorServiceImpl implements AdministratorService {
    @Resource
    private AdministratorDao administratorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param adminid 主键
     * @return 实例对象
     */
    @Override
    public Administrator queryById(String adminid) {
        return this.administratorDao.queryById(adminid);
    }

    /**
     * 分页查询
     *
     * @param administrator 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Administrator> queryByPage(Administrator administrator, PageRequest pageRequest) {
        long total = this.administratorDao.count(administrator);
        return new PageImpl<>(this.administratorDao.queryAllByLimit(administrator, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param administrator 实例对象
     * @return 实例对象
     */
    @Override
    public Administrator insert(Administrator administrator) {
        this.administratorDao.insert(administrator);
        return administrator;
    }

    /**
     * 修改数据
     *
     * @param administrator 实例对象
     * @return 实例对象
     */
    @Override
    public Administrator update(Administrator administrator) {
        this.administratorDao.update(administrator);
        return this.queryById(administrator.getAdminid());
    }

    /**
     * 通过主键删除数据
     *
     * @param adminid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String adminid) {
        return this.administratorDao.deleteById(adminid) > 0;
    }

    public Administrator leaderLogin(Administrator administrator){
        return administratorDao.leaderLogin(administrator);
    }
}
