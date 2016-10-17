package com.huang.web;

import com.huang.biz.TblstudentDao;
import com.huang.biz.impl.TblstudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/8/27.
 */
@WebServlet(name = "StudentAjax")
public class StudentAjax extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置页面输出的类型为html类型
        response.setContentType("text/html;charset=utf-8");
        //产生一个输出流对象
        PrintWriter out=response.getWriter();
        //从请求域中获取session对象
        HttpSession session=request.getSession();
        //获取表单发过来的值，参数为表单元素名字name的文本域
        String name=request.getParameter("name");
        //获取表单元素名字pwd的文本域
        String pwd=request.getParameter("pwd");
        TblstudentDao stu=new TblstudentDaoImpl();
        boolean boo=stu.chackstudent(name,pwd);
        if(boo){
            //将用户信息装到session当中
            session.setAttribute("name",name);
            //如果boo为true那么就响应到学员信息页面
            out.print("{result:true}");
        }else {
            //如果boo为false那么就响应到登录页面
            out.print("{result:false}");
        }
        out.close();
    }
}
