package com.huang.biz;

import com.huang.entity.Tblstudent;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface TblstudentDao {
    /**
     * 查询所有学生信息
     */
    public List<Tblstudent> findAll();
    /**
     * 根据ID查询学员信息
     */

    public Tblstudent chack(String stuid);
    /**
     * 修改学员信息
     */
    public int update(Tblstudent stu);
    /**
     * 删除学员信息
     */
    public boolean delete(String id);
    /**
     * 增加学员信息
     */
    public int add(Tblstudent stu);

    /**
     * 判断登录是否成功
     * @param stuname
     * @param stupass
     * @return
     */
    public boolean chackstudent(String stuname, String stupass);
}
