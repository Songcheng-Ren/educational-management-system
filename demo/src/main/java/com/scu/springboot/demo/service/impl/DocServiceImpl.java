package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.dao.DocDao;
import com.scu.springboot.demo.entity.Doc;
import com.scu.springboot.demo.service.DocService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Doc)表服务实现类
 *
 * @author makejava
 * @since 2022-07-13 15:13:26
 */
@Service("docService")
@Transactional
public class DocServiceImpl implements DocService {
    @Resource
    private DocDao docDao;

    /**
     * 通过ID查询单条数据
     *
     * @param docId 主键
     * @return 实例对象
     */
    @Override
    public Doc queryById(Long docId) {
        return this.docDao.queryById(docId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Doc> queryAllByLimit(int offset, int limit) {
        return this.docDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param doc 实例对象
     * @return 实例对象
     */
    @Override
    public Doc insert(Doc doc) {
        this.docDao.insert(doc);
        return doc;
    }

    /**
     * 修改数据
     *
     * @param doc 实例对象
     * @return 实例对象
     */
    @Override
    public Doc update(Doc doc) {
        this.docDao.update(doc);
        return this.queryById(doc.getDocId());
    }

    /**
     * 通过主键删除数据
     *
     * @param docId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long docId) {
        return this.docDao.deleteById(docId) > 0;
    }
}