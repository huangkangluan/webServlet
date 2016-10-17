package com.huang.biz;

import com.huang.entity.Tblcourse;

import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface TblcourseDao {
    /**
     * 查询所有课程信息
     * @return
     */
    public List<Tblcourse> findAll();

    /**
     * 根据课程ID查询指定信息
     * @param couid
     * @return
     */
    public Tblcourse chack(String couid);

    /**
     * 修改课程信息
     * @param cou
     * @return
     */
    public int update(Tblcourse cou);

    /**
     * 删除课程信息
     * @param couid
     * @return
     */
    public boolean delete(String couid);

    /**
     * 增加课程信息
     * @param cou
     * @return
     */
    public boolean add(Tblcourse cou);
}
