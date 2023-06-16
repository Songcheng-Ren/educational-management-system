package com.scu.springboot.demo.service;

import com.scu.springboot.demo.entity.Bill;
import com.scu.springboot.demo.entity.Takes;
import com.scu.springboot.demo.vo.EvaluateVo;
import com.scu.springboot.demo.vo.Student_listVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Takes)表服务接口
 *
 * @author makejava
 * @since 2022-07-15 22:11:53
 */
public interface TakesService {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Takes queryById(String sid);

    /**
     * 分页查询
     *
     * @param takes 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Takes> queryByPage(Takes takes, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param takes 实例对象
     * @return 实例对象
     */
    Takes insert(Takes takes);

    /**
     * 修改数据
     *
     * @param takes 实例对象
     * @return 实例对象
     */
    Takes update(Takes takes);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(String sid);

    List<EvaluateVo> evaluate(String sid);

    void update_evaluate(String id,String course_id,String sec_id,String teacher_ID,String semester,String year,String score);
    List<Student_listVo> student_list(String courseId, String secId);

}
