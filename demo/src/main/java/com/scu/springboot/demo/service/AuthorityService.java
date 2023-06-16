package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.Authority;

import java.util.List;

/**
 * (Authority)表服务接口
 *
 * @author makejava
 * @since 2022-07-13 15:12:43
 */
public interface AuthorityService {

    /**
     * 通过ID查询单条数据
     *
     * @param authorityId 主键
     * @return 实例对象
     */
    Authority queryById(Long authorityId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Authority> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authority 实例对象
     * @return 实例对象
     */
    Authority insert(Authority authority);

    /**
     * 修改数据
     *
     * @param authority 实例对象
     * @return 实例对象
     */
    Authority update(Authority authority);

    /**
     * 通过主键删除数据
     *
     * @param authorityId 主键
     * @return 是否成功
     */
    boolean deleteById(Long authorityId);

}