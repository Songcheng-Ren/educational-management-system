package com.scu.springboot.demo.dao;

import com.scu.springboot.demo.entity.Doc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Doc)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-13 15:13:26
 */
public interface DocDao {

    /**
     * 通过ID查询单条数据
     *
     * @param docId 主键
     * @return 实例对象
     */
    Doc queryById(Long docId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Doc> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param doc 实例对象
     * @return 对象列表
     */
    List<Doc> queryAll(Doc doc);

    /**
     * 新增数据
     *
     * @param doc 实例对象
     * @return 影响行数
     */
    int insert(Doc doc);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Doc> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Doc> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Doc> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Doc> entities);

    /**
     * 修改数据
     *
     * @param doc 实例对象
     * @return 影响行数
     */
    int update(Doc doc);

    /**
     * 通过主键删除数据
     *
     * @param docId 主键
     * @return 影响行数
     */
    int deleteById(Long docId);

}