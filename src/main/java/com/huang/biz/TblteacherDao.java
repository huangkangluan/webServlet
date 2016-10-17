package com.huang.biz;

import com.huang.entity.Tblteacher;

import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface TblteacherDao {
    /**
     * 查询所有教员信息
     * @return
     */
    public List<Tblteacher> findAll();

    /**
     * 根据教员ID查询指定信息
     * @param teaid
     * @return
     */
    public Tblteacher chack(String teaid);

    /**
     * 修改教员信息
     * @param stu
     * @return
     */
    public int update(Tblteacher stu);

    /**
     * 删除教员信息
     * @param id
     * @return
     */
    public boolean delete(String id);

    /**
     * 增加教员信息
     * @param stu
     * @return
     */
    public boolean add(Tblteacher stu);
}
