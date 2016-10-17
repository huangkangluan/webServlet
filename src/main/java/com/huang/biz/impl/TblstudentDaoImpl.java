package com.huang.biz.impl;

import com.huang.biz.BaseDao;
import com.huang.biz.TblstudentDao;
import com.huang.entity.Tblstudent;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public class TblstudentDaoImpl extends BaseDao implements TblstudentDao {
    /**
     * 查询所有学生信息
     */
    @Override
    public List<Tblstudent> findAll() {
        open();
        String sql="select * from Tblstudent";
        try{
            List<Tblstudent> list=qr.query(con, sql, new BeanListHandler<Tblstudent>(Tblstudent.class));
            return list;
        }catch (Exception e){

            return null;
        }
        finally {
            try {
                close(con,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 根据ID查询学员信息
     *
     * @param id
     */
    @Override
    public Tblstudent chack(String stuid) {
        open();
        String sql="select * from tblstudent where stuid=?";
        try {
            Tblstudent stu=qr.query(con, sql, new BeanHandler<Tblstudent>(Tblstudent.class),stuid);
            return stu;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                close(con,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 修改学员信息
     *
     * @param stu
     */
    @Override
    public int update(Tblstudent stu) {
        open();
        String sql="update Tblstudent set stuname=?,stuage=?,stusex=? where stuid=?";
        try {
            qr.update(con,sql,stu.getStuName(),stu.getStuAge(),stu.getStuSex(),stu.getStuId());
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                close(con,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    /**
     * 删除学员信息
     *
     * @param id
     */
    @Override
    public boolean delete(String id) {
        open();
        String sql="delete from Tblstudent where stuid=?";
        try {
            qr.update(con,sql,id);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                close(con,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 增加学员信息
     *
     * @param stu
     */
    @Override
    public int add(Tblstudent stu) {
        open();
        String sql="insert into Tblstudent (stuname,stuage,stusex,stupass) values(?,?,?,?)";
        try {
            int num=qr.update(con,sql,stu.getStuName(),stu.getStuAge(),stu.getStuSex(),stu.getStuPass());
            return num;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                close(con,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    /**
     * 判断登录是否成功
     *
     * @param stuname
     * @param password
     * @return
     */
    @Override
    public boolean chackstudent(String stuname, String stupass) {
        open();
        String sql="select * from Tblstudent where stuname=? and stupass=?";
        try {
            Tblstudent stu=qr.query(con,sql,new BeanHandler<Tblstudent>(Tblstudent.class),stuname,stupass);
            if(stu != null){
                return true;
            }
           // return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                close(con,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
