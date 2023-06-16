package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.Fee;
import com.scu.springboot.demo.dao.FeeDao;
import com.scu.springboot.demo.service.FeeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Fee)表服务实现类
 *
 * @author makejava
 * @since 2022-07-16 15:01:39
 */
@Service("feeService")
public class FeeServiceImpl implements FeeService {
    @Resource
    private FeeDao feeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public Fee queryById(String sid) {
        return this.feeDao.queryById(sid);
    }

    /**
     * 分页查询
     *
     * @param fee 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Fee> queryByPage(Fee fee, PageRequest pageRequest) {
        long total = this.feeDao.count(fee);
        return new PageImpl<>(this.feeDao.queryAllByLimit(fee, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param fee 实例对象
     * @return 实例对象
     */
    @Override
    public Fee insert(Fee fee) {
        this.feeDao.insert(fee);
        return fee;
    }

    /**
     * 修改数据
     *
     * @param fee 实例对象
     * @return 实例对象
     */
    @Override
    public Fee update(Fee fee) {
        this.feeDao.update(fee);
        return this.queryById(fee.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String sid) {
        return this.feeDao.deleteById(sid) > 0;
    }

    @Override
    public List<Fee> getAllCost(String sid) {

        return feeDao.getAllCost(sid);
    }
    public int updateIsPaid(Fee fee){
        return feeDao.updateIsPaid(fee);
    }
}
