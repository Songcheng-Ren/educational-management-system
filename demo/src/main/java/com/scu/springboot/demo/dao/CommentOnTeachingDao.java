package com.scu.springboot.demo.dao;

import com.scu.springboot.demo.entity.CommentOnTeaching;
import com.scu.springboot.demo.vo.Evaluate_resultVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (CommentOnTeaching)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 22:32:50
 */
public interface CommentOnTeachingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param index 主键
     * @return 实例对象
     */
    CommentOnTeaching queryById(Integer index);

    /**
     * 查询指定行数据
     *
     * @param commentOnTeaching 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<CommentOnTeaching> queryAllByLimit(CommentOnTeaching commentOnTeaching, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param commentOnTeaching 查询条件
     * @return 总行数
     */
    long count(CommentOnTeaching commentOnTeaching);

    /**
     * 新增数据
     *
     * @param commentOnTeaching 实例对象
     * @return 影响行数
     */
    int insert(CommentOnTeaching commentOnTeaching);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CommentOnTeaching> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CommentOnTeaching> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CommentOnTeaching> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CommentOnTeaching> entities);

    /**
     * 修改数据
     *
     * @param commentOnTeaching 实例对象
     * @return 影响行数
     */
    int update(CommentOnTeaching commentOnTeaching);

    /**
     * 通过主键删除数据
     *
     * @param index 主键
     * @return 影响行数
     */
    int deleteById(Integer index);

    List<Evaluate_resultVo> evaluate_result();

    List<Evaluate_resultVo> single_evaluation(String tid);
}

