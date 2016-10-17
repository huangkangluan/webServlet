package com.huang.biz;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Administrator on 2016/8/23.
 */
public class BaseDao {
    private static String user="root";
    private static String password="hzit";
    private static String url="jdbc:mysql://localhost:3306/student";
    protected QueryRunner qr;
    protected Connection con;
    public BaseDao(){
        qr=new QueryRunner();
    }
    public Connection open(){
        try {

            Class.forName("com.mysql.jdbc.Driver");

            con=DriverManager.getConnection(url,user,password);
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void close(Connection con,Statement st,ResultSet rs) throws Exception {
        if(rs!=null){
            rs.close();
        }
        if(st!=null){
            st.close();
        }
        if(con!=null){
            con.close();
        }
    }
}
