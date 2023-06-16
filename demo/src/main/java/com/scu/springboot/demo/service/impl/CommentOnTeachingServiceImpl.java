package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.CommentOnTeaching;
import com.scu.springboot.demo.dao.CommentOnTeachingDao;
import com.scu.springboot.demo.service.CommentOnTeachingService;
import com.scu.springboot.demo.vo.Evaluate_resultVo;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CommentOnTeaching)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 22:32:52
 */
@Service("commentOnTeachingService")
public class CommentOnTeachingServiceImpl implements CommentOnTeachingService {
    @Resource
    private CommentOnTeachingDao commentOnTeachingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param index 主键
     * @return 实例对象
     */
    @Override
    public CommentOnTeaching queryById(Integer index) {
        return this.commentOnTeachingDao.queryById(index);
    }

    /**
     * 分页查询
     *
     * @param commentOnTeaching 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<CommentOnTeaching> queryByPage(CommentOnTeaching commentOnTeaching, PageRequest pageRequest) {
        long total = this.commentOnTeachingDao.count(commentOnTeaching);
        return new PageImpl<>(this.commentOnTeachingDao.queryAllByLimit(commentOnTeaching, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param commentOnTeaching 实例对象
     * @return 实例对象
     */
    @Override
    public CommentOnTeaching insert(CommentOnTeaching commentOnTeaching) {
        this.commentOnTeachingDao.insert(commentOnTeaching);
        return commentOnTeaching;
    }

    /**
     * 修改数据
     *
     * @param commentOnTeaching 实例对象
     * @return 实例对象
     */
    @Override
    public CommentOnTeaching update(CommentOnTeaching commentOnTeaching) {
        this.commentOnTeachingDao.update(commentOnTeaching);
        return this.queryById(commentOnTeaching.getIndex());
    }

    /**
     * 通过主键删除数据
     *
     * @param index 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer index) {
        return this.commentOnTeachingDao.deleteById(index) > 0;
    }
    public List<Evaluate_resultVo> evaluate_result() {
        return commentOnTeachingDao.evaluate_result();
    }

    public List<Evaluate_resultVo> single_evaluation(String tid) {
        return commentOnTeachingDao.single_evaluation(tid);
    }
}
