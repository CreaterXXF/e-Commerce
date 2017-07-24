<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品</title>
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
			<nav class="navbar navbar-default" role="navigation"></nav></div></div></div>
<form action="${pageContext.request.contextPath }/addGoods" method="post" enctype="multipart/form-data">
		<table width="100%" height="90%" border="0" cellpadding="5" cellspacing="0" class="main_tabbor">
		<!-- 数据展示区 -->
			<tr valign="top">
				<td height="20">
					<table width="100%" border="1" cellpadding="5" cellspacing="0" style="border:#c2c6cc 1px solid; border-collapse:collapse;">
						<tr class="main_trbg_tit" align="center">
							<td>商品图片</td>
							<td>商品编号</td>
			  				<td>商品名称</td>
			  				<td>商品介绍</td>
			  				<td>商品价格</td>
							<td></td>
						</tr >
						<tr class="main_trbg_tit" align="center">
						  <td><input type="file" name="picture"></td>
						  <td><input type="text" name="good_id"></td>
						  <td><input type="text" name="good_name"></td>
						  <td><input type="text" name="good_introduce"></td>
						  <td><input type="text" name="good_price"></td>
						  <td><input type="submit" value="添加"></td>
						</tr>
				  </table>
			</td>
		  </tr>
		</table>
	</form>
	
</body>
</html>