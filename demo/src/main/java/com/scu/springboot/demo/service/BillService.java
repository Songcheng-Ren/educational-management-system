package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.Bill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Bill)表服务接口
 *
 * @author makejava
 * @since 2022-07-15 14:24:27
 */
public interface BillService {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Bill queryById(String sId);

    /**
     * 分页查询
     *
     * @param bill 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Bill> queryByPage(Bill bill, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param bill 实例对象
     * @return 实例对象
     */
    Bill insert(Bill bill);

    /**
     * 修改数据
     *
     * @param bill 实例对象
     * @return 实例对象
     */
    Bill update(Bill bill);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    boolean deleteById(String sId);

    List<Bill> getAllBill(String sId);

}
