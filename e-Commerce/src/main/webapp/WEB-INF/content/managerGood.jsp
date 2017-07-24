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
					商品管理</font></font><small><font><font>Good Manage</font></font></small>
				</h1>
			</div>
			<nav class="navbar navbar-default" role="navigation">

		<table border="1">
		<tr>
		
		<th>商品图片</th><th>商品编号</th><th>商品名称</th><th>商品介绍</th><th>商品价格</th><th>操作</th>
		</tr>
	<c:forEach items="${requestScope.good_list }" var="good">
		<tr>
			<td><img src="img/good/all/${good.good_image }" height="100"></td>
			<td>${good.good_id }</td>
			<td>${good.good_name }</td>
			<td>${good.good_introduce }</td>
			<td>${good.good_price }</a></td>
			<td width="120px">&nbsp&nbsp&nbsp<a href="${pageContext.request.contextPath }/deleteGoods/${good.good_id }">删除</a> &nbsp&nbsp&nbsp<a href="${pageContext.request.contextPath }/goUpdateGoods/${good.good_id }">修改</a></td>
		</tr>
		
	</c:forEach>
	<a href="${pageContext.request.contextPath }/addGood">添加商品</a>
<h2>${requestScope.message }</h2>
</table>
</nav>
</div></div></div>
</body>
</html>