package com.huang.biz.impl;

import com.huang.biz.BaseDao;
import com.huang.biz.TblteacherDao;
import com.huang.entity.Tblteacher;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public class TblteacherDaoImpl extends BaseDao implements TblteacherDao {
    /**
     * 查询所有教员信息
     *
     * @return
     */
    @Override
    public List<Tblteacher> findAll() {
        open();
        String sql="select * from Tblteacher";
        try {
            List<Tblteacher> list=qr.query(con,sql,new BeanListHandler<Tblteacher>(Tblteacher.class));
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
     * 根据教员ID查询指定信息
     *
     * @param teaid
     * @return
     */
    @Override
    public Tblteacher chack(String teaid) {
        return null;
    }

    /**
     * 修改教员信息
     *
     * @param stu
     * @return
     */
    @Override
    public int update(Tblteacher stu) {
        return 0;
    }

    /**
     * 删除教员信息
     *
     * @param id
     * @return
     */
    @Override
    public boolean delete(String id) {
        return false;
    }

    /**
     * 增加教员信息
     *
     * @param stu
     * @return
     */
    @Override
    public boolean add(Tblteacher stu) {
        return false;
    }
}
