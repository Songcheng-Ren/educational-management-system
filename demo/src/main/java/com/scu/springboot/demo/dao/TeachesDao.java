package com.scu.springboot.demo.dao;

import com.scu.springboot.demo.entity.Teaches;
import com.scu.springboot.demo.vo.Class_timeVo;
import com.scu.springboot.demo.vo.StudentVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Teaches)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-20 02:27:11
 */
public interface TeachesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    Teaches queryById(String tid);

    /**
     * 查询指定行数据
     *
     * @param teaches 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Teaches> queryAllByLimit(Teaches teaches, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param teaches 查询条件
     * @return 总行数
     */
    long count(Teaches teaches);

    /**
     * 新增数据
     *
     * @param teaches 实例对象
     * @return 影响行数
     */
    int insert(Teaches teaches);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Teaches> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Teaches> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Teaches> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Teaches> entities);

    /**
     * 修改数据
     *
     * @param teaches 实例对象
     * @return 影响行数
     */
    int update(Teaches teaches);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 影响行数
     */
    int deleteById(String tid);

    List<Class_timeVo> class_time(String tid);
}

