package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.Fee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Fee)表服务接口
 *
 * @author makejava
 * @since 2022-07-16 15:01:39
 */
public interface FeeService {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Fee queryById(String sid);

    /**
     * 分页查询
     *
     * @param fee 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Fee> queryByPage(Fee fee, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param fee 实例对象
     * @return 实例对象
     */
    Fee insert(Fee fee);

    /**
     * 修改数据
     *
     * @param fee 实例对象
     * @return 实例对象
     */
    Fee update(Fee fee);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(String sid);

    List<Fee> getAllCost(String sid);

    int updateIsPaid(Fee fee);

}
