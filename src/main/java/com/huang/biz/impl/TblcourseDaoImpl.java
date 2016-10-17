package com.huang.biz.impl;

import com.huang.biz.BaseDao;
import com.huang.biz.TblcourseDao;
import com.huang.entity.Tblcourse;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public class TblcourseDaoImpl extends BaseDao implements TblcourseDao {
    /**
     * 查询所有课程信息
     *
     * @return
     */
    @Override
    public List<Tblcourse> findAll() {
        open();
        String sql="select * from Tblcourse";
        try {
            List<Tblcourse> list=qr.query(con,sql,new BeanListHandler<Tblcourse>(Tblcourse.class));
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
     * 根据课程ID查询指定信息
     *
     * @param couid
     * @return
     */
    @Override
    public Tblcourse chack(String couid) {
        return null;
    }

    /**
     * 修改课程信息
     *
     * @param cou
     * @return
     */
    @Override
    public int update(Tblcourse cou) {
        return 0;
    }

    /**
     * 删除课程信息
     *
     * @param couid
     * @return
     */
    @Override
    public boolean delete(String couid) {
        return false;
    }

    /**
     * 增加课程信息
     *
     * @param cou
     * @return
     */
    @Override
    public boolean add(Tblcourse cou) {
        return false;
    }
}
