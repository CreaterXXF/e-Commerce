<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>商品管理</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

  </head>
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<div class="page-header">
				<h1><font><font color="red">
					浦峰达购物商城</font></font><small><font><font>Pu Feng Da Shop</font></font></small>
				</h1>
			</div>
			<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">

    <div>
        <ul class="nav navbar-nav">
       		<li ><a href="index">首页</a></li>
            <li ><a href="#">所有商品</a></li>
            <li><a href="#">查看购物车</a></li>
			<li><a href="#">我的订单</a></li>
			<li class="active"><a href="manage"><font color="red" >商品管理（管理员）</font></a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    其他
                    <b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="change">密码修改</a></li>
                    <li><a href="register">账户注册</a></li>
                    <li><a href="find">找回密码</a></li>
                    <li class="divider"></li>
                    <li><a href="#">联系客服</a></li>
                    <li class="divider"></li>
                    <li><a href="#">网站导航</a></li>
                </ul>
            </li>
        </ul>
    </div>
    </div>
</nav>
			<div class="row">
				<div class="col-md-12">
				<form action="manages" method="get">
		<table border="1">
		<tr>
		<th>商品图片</th><th>商品编号</th><th>商品名称</th><th>商品介绍</th><th>商品价格</th>
		</tr>
	<c:forEach items="${requestScope.good_list }" var="good">
		<tr>
			<td><img src="img/good/all/${good.good_image }" height="60"></td>
			<td>${good.good_id }</td>
			<td>${good.good_name }</td>
			<td>${good.good_introduce }</td>
			<td>${good.good_price }</td>
		</tr>
	</c:forEach>
	

</table>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>