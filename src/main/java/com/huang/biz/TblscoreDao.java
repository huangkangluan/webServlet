package com.huang.biz;

import com.huang.entity.Tblcourse;
import com.huang.entity.Tblscore;
import com.huang.entity.Tblstudent;

import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface TblscoreDao {
    /**
     * 查询所有学员所学课程的分数
     * @return
     */
    public List<Tblscore> findAll();

    /**
     * 根据学员ID、课程ID修改成绩分数
     * @param stuid
     * @param courseid
     * @return
     */
    public int update(Tblstudent stuid, Tblcourse courseid);

    /**
     * 根据学员ID、课程ID删除信息
     * @param stuid
     * @param courseid
     * @return
     */
    public boolean delete(Tblstudent stuid, Tblcourse courseid);

    /**
     * 增加学员所学课程的分数
     * @param sco
     * @return
     */
    public boolean add(Tblscore sco);
}
