package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.dao.AuthorityDao;
import com.scu.springboot.demo.entity.Authority;
import com.scu.springboot.demo.service.AuthorityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Authority)表服务实现类
 *
 * @author makejava
 * @since 2022-07-13 15:12:44
 */
@Service("authorityService")
@Transactional
public class AuthorityServiceImpl implements AuthorityService {
    @Resource
    private AuthorityDao authorityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param authorityId 主键
     * @return 实例对象
     */
    @Override
    public Authority queryById(Long authorityId) {
        return this.authorityDao.queryById(authorityId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Authority> queryAllByLimit(int offset, int limit) {
        return this.authorityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param authority 实例对象
     * @return 实例对象
     */
    @Override
    public Authority insert(Authority authority) {
        this.authorityDao.insert(authority);
        return authority;
    }

    /**
     * 修改数据
     *
     * @param authority 实例对象
     * @return 实例对象
     */
    @Override
    public Authority update(Authority authority) {
        this.authorityDao.update(authority);
        return this.queryById(authority.getAuthorityId());
    }

    /**
     * 通过主键删除数据
     *
     * @param authorityId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long authorityId) {
        return this.authorityDao.deleteById(authorityId) > 0;
    }
}