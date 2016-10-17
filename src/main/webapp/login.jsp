<%--
Created by IntelliJ IDEA.
User: Administrator
Date: 2016/8/27
Time: 18:10
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<title>合众艾特</title>
<link href="css/style.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="App Loction Form,Login Forms,Sign up Forms,Registration Forms,News latter Forms,Elements"./>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script src="js/jquery-3.0.0.js"></script>
<script>
		$(function(){

		})
		function butform(){
			$.post("student.html",$("#form").serialize(),function(data){
				//alert(data);
				var d=eval(data);
				if(d){
					location="student.jsp";
				}else{
					alert("用户名或密码输入错误！")
					location="login.jsp";
				}
			})
		}
	</script>
</head>
<!--webfonts-->
<link href='http://fonts.useso.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<!--//webfonts-->
</head>
<body>
	<h1>合众艾特</h1>
		<div class="app-location">
			<h2>Welcome to hzit</h2>
			<div class="line"><span></span></div>
			<div class="location"><img src="images/location.png" class="img-responsive" alt="" /></div>
			<form action="#" method="post" id="form">
				<input type="text" name="name" class="text" value="请输入用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入用户名';}" >
				<input type="password" name="pwd" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入用户密码';}">
				<div class="button"><input type="button" onclick="butform()" value="登 录" ></div>
				<div class="clear"></div>
			</form>
		</div>
	<!--start-copyright-->
   		<div class="copy-right">
				<p>Copyright &copy; 2015.Company name All rights reserved.<a target="_blank" href="http://www.baidu.com/">百度一下</a></p>
		</div>
	<!--//end-copyright-->
</body>
</html>