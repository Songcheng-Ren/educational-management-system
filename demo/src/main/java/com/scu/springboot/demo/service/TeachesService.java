package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.Teaches;
import com.scu.springboot.demo.vo.Class_timeVo;
import com.scu.springboot.demo.vo.EvaluateVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Teaches)表服务接口
 *
 * @author makejava
 * @since 2022-07-20 02:27:13
 */
public interface TeachesService {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    Teaches queryById(String tid);

    /**
     * 分页查询
     *
     * @param teaches 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Teaches> queryByPage(Teaches teaches, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param teaches 实例对象
     * @return 实例对象
     */
    Teaches insert(Teaches teaches);

    /**
     * 修改数据
     *
     * @param teaches 实例对象
     * @return 实例对象
     */
    Teaches update(Teaches teaches);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    boolean deleteById(String tid);

    List<Class_timeVo> class_time(String tid);

}
