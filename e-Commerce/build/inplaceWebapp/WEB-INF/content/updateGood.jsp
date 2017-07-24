<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "ht
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品更新</title>
</head>
<body>
<body style="background:#e5edef;">
	
	<h1 >欢迎进入商品更新页面</h1>
	
	<form action="${pageContext.request.contextPath }/updateGood" method="post" enctype="multipart/form-data">
	<input type="hidden" name=id value="${requestScope.good.id }">
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
			</tr>
			<tr>
				<td>
					<c:if test="${requestScope.good.good_image!=null }">
						<img src="./img/good/all/${requestScope.good.good_image}" width=100 height=60/>
						<br/>
					</c:if>
					<input type="file"  name="pictureFile"/> 
				</td>
			  <td><input type="text" name="good_id" value="${requestScope.good.good_id }"></td>
			  <td><input type="text" name="good_name" value="${requestScope.good.good_name }"></td>
			  <td><input type="text" name="good_introduce" value="${requestScope.good.good_introduce}"></td>
			  <td><input type="text" name="good_price" value="${requestScope.good.good_price }"></td>
			  
			  
			  <td><input type="submit" value="更新商品"></td>
			</tr>
		  </table>
		</td>
	  </tr>
	</table>
</form>
</body>
</html>