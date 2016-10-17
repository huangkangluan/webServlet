package com.huang.biz.impl;

import com.huang.biz.BaseDao;
import com.huang.biz.TblscoreDao;
import com.huang.entity.Tblcourse;
import com.huang.entity.Tblscore;
import com.huang.entity.Tblstudent;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public class TblscoreDaoImpl extends BaseDao implements TblscoreDao {
    /**
     * 查询所有学员所学课程的分数
     *
     * @return
     */
    @Override
    public List<Tblscore> findAll() {
        open();
        String sql="select * from Tblscore";
        try {
            List<Tblscore> list=qr.query(con,sql,new BeanListHandler<Tblscore>(Tblscore.class));
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                close(con,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 根据学员ID、课程ID修改成绩分数
     *
     * @param stuid
     * @param courseid
     * @return
     */
    @Override
    public int update(Tblstudent stuid, Tblcourse courseid) {
        return 0;
    }

    /**
     * 根据学员ID、课程ID删除信息
     *
     * @param stuid
     * @param courseid
     * @return
     */
    @Override
    public boolean delete(Tblstudent stuid, Tblcourse courseid) {
        return false;
    }

    /**
     * 增加学员所学课程的分数
     *
     * @param sco
     * @return
     */
    @Override
    public boolean add(Tblscore sco) {
        return false;
    }
}
