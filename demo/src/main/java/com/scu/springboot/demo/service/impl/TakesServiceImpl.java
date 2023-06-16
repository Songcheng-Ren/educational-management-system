package com.scu.springboot.demo.service.impl;

import com.scu.springboot.demo.entity.Takes;
import com.scu.springboot.demo.dao.TakesDao;
import com.scu.springboot.demo.service.TakesService;
import com.scu.springboot.demo.vo.EvaluateVo;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import com.scu.springboot.demo.vo.Student_listVo;
import javax.annotation.Resource;
import java.util.List;

/**
 * (Takes)表服务实现类
 *
 * @author makejava
 * @since 2022-07-15 22:11:53
 */
@Service("takesService")
public class TakesServiceImpl implements TakesService {
    @Resource
    private TakesDao takesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public Takes queryById(String sid) {
        return this.takesDao.queryById(sid);
    }

    /**
     * 分页查询
     *
     * @param takes 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Takes> queryByPage(Takes takes, PageRequest pageRequest) {
        long total = this.takesDao.count(takes);
        return new PageImpl<>(this.takesDao.queryAllByLimit(takes, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param takes 实例对象
     * @return 实例对象
     */
    @Override
    public Takes insert(Takes takes) {
        this.takesDao.insert(takes);
        return takes;
    }

    /**
     * 修改数据
     *
     * @param takes 实例对象
     * @return 实例对象
     */
    @Override
    public Takes update(Takes takes) {
        this.takesDao.update(takes);
        return this.queryById(takes.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String sid) {
        return this.takesDao.deleteById(sid) > 0;
    }

    public List<EvaluateVo> evaluate(String sid) {
        return takesDao.evaluate(sid);
    }

    public void update_evaluate(String id,String course_id,String sec_id,String teacher_ID,String semester,String year,String score){
        takesDao.update_score(teacher_ID,score,course_id);
        takesDao.update_evaluate(id,course_id,sec_id,teacher_ID,semester,year,score);
    }
    public List<Student_listVo> student_list(String courseId,String secId){
        return takesDao.student_list(courseId,secId);
    }

}
