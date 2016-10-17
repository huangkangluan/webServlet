<%@ page import="com.huang.biz.impl.TblstudentDaoImpl" %>
<%@ page import="com.huang.entity.Tblstudent" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/24
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>学员信息管理</title>
  <meta charset="UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <link rel="stylesheet" href="css/bootstrap.min.css"/>
  <link rel="stylesheet" href="css/bootstrap-responsive.min.css"/>
  <link rel="stylesheet" href="css/uniform.css"/>
  <link rel="stylesheet" href="css/select2.css"/>
  <link rel="stylesheet" href="css/unicorn.main.css"/>
  <link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color"/>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>


<div id="header">
  <h1><a href="./dashboard.html"></a></h1>
</div>


<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav btn-group">
    <li class="btn btn-inverse"><a title="" href="#"><i class="icon icon-user"></i> <span
            class="text">用户名</span></a></li>
    <li class="btn btn-inverse"><a title="" href="../exit.jsp"><i class="icon icon-share-alt"></i> <span
            class="text">退出</span></a></li>
  </ul>
</div>

<div id="sidebar">
  <a href="#" class="visible-phone"><i class="icon icon-th-list"></i>考试信息管理</a>
  <ul>
    <li class="submenu active"><a href="student.jsp"><i class="icon icon-th-list"></i> <span>学员信息管理</span></a>
      <ul>
        <li class="active"><a href="add_student.jsp">新增学员</a></li>
        <li class="active"><a href="#">修改学员信息</a></li>
      </ul>
    </li>
    <li><a href="teacher.jsp"><i class="icon icon-th-list"></i> <span>教员信息管理</span></a></li>
    <li><a href="course.jsp"><i class="icon icon-th-list"></i> <span>课程管理</span></a></li>
    <li><a href="score.jsp"><i class="icon icon-th-list"></i> <span>分数管理</span></a></li>
  </ul>

</div>


<div id="content">
  <div id="content-header">
    <h1>学员信息管理</h1>
  </div>
  <div id="breadcrumb">
    <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i>合众艾特</a>
    <a href="#" class="current">学员信息</a>
  </div>
  <div class="container-fluid">
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title">
            <h5>学员信息列表</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
              <thead>
              <tr>
                <th>学员ID</th>
                <th>学员姓名</th>
                <th>年龄</th>
                <th>性别</th>
                <th>编辑</th>
                <th>删除</th>
              </tr>
              </thead>
              <%
                TblstudentDaoImpl stu=new TblstudentDaoImpl();
                List<Tblstudent> list=stu.findAll();
                for(Tblstudent s:list){
              %>
              <tbody>

              <tr class="gradeU">
                <td><div align="center"><%=s.getStuId()%></div></td>
                <td><div align="center"><%=s.getStuName()%></div></td>
                <td><div align="center"><%=s.getStuAge()%></div></td>
                <td><div align="center"><%=s.getStuSex()%></div></td>
                <td><div align="center"><a href="#">编辑</a></div></td>
                <td class="center"><div align="center"><a href="#">删除</a></div></td>
              </tr>
              </tbody>
              <%}%>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.ui.custom.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.uniform.js"></script>
<script src="js/select2.min.js"></script>
<script src="js/jquery.dataTables.min.js"></script>
<script src="js/unicorn.js"></script>

</body>
</html>

