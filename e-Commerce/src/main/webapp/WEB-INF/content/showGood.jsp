<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>首页</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

  </head>
  <body>
 当前在线人数：
		<c:out value="${applicationScope.count }"></c:out>
欢迎[${sessionScope.user.user_name }]访问
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
        	<li><a href="index"><font color="red" >首页</font></a></li>
            <li class="active"><a href="showGoods">所有商品</a></li>
            <li><a href="cart?user_id=${sessionScope.user.user_id }">查看购物车</a></li>
            <li><a href="goCollect?user_id=${sessionScope.user.user_id }">查看收藏夹</a></li>
			<li><a href="#">我的订单</a></li>
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
                    <li><a href="login1">退出登录</a></li>
                </ul>
            </li>
        </ul>
    </div>
    </div>
</nav>
			<div class="row">
				<div class="col-md-4">
					<div class="panel-group" id="panel-661012">
						<div class="panel panel-default">
							<div class="panel-heading">
								 <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-661012" href="#panel-element-1"><font><font>男装女装</font></font></a>
							</div>
							<div id="panel-element-1" class="panel-collapse collapse">
								<div class="panel-body"><font><font>
									时尚男装
								</font></font></div>
								<div class="panel-body"><font><font>
									潮流女装
								</font></font></div>
								<div class="panel-body"><font><font>
									男士裤子
								</font></font></div>
								<div class="panel-body"><font><font>
									羽绒服
								</font></font></div>
								<div class="panel-body"><font><font>
									毛衣
								</font></font></div>
					</div>
						</div>
	

<div class="panel panel-default">
							<div class="panel-heading">
								 <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-661012" href="#panel-element-2"><font><font>箱包类</font></font></a>
							</div>
							<div id="panel-element-2" class="panel-collapse collapse">
								<div class="panel-body"><font><font>
									潮流女包
								</font></font></div>
								<div class="panel-body"><font><font>
									精品男包
								</font></font></div>
								<div class="panel-body"><font><font>
									旅行箱
								</font></font></div>
								<div class="panel-body"><font><font>
									双肩包
								</font></font></div>
								<div class="panel-body"><font><font>
									钱包
								</font></font></div>
					</div>
						</div>
	

<div class="panel panel-default">
							<div class="panel-heading">
								 <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-661012" href="#panel-element-3"><font><font>美食类</font></font></a>
							</div>
							<div id="panel-element-3" class="panel-collapse collapse">
								<div class="panel-body"><font><font>
									休闲零食
								</font></font></div>
								<div class="panel-body"><font><font>
									生鲜果蔬
								</font></font></div>
								<div class="panel-body"><font><font>
									水产鲜肉
								</font></font></div>
								<div class="panel-body"><font><font>
									美酒佳酿
								</font></font></div>
								<div class="panel-body"><font><font>
									牛奶饮料
								</font></font></div>
					</div>
						</div>
	

<div class="panel panel-default">
							<div class="panel-heading">
								 <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-661012" href="#panel-element-4"><font><font>电器类</font></font></a>
							</div>
							<div id="panel-element-4" class="panel-collapse collapse">
								<div class="panel-body"><font><font>
									手机
								</font></font></div>
								<div class="panel-body"><font><font>
									笔记本电脑
								</font></font></div>
								<div class="panel-body"><font><font>
									相机
								</font></font></div>
								<div class="panel-body"><font><font>
									数码配件
								</font></font></div>
								<div class="panel-body"><font><font>
									平板电脑
								</font></font></div>
					</div>
						</div>




			</div>
				</div>
				







<div class="col-md-8">
					
					<div class="row">
						<div class="row">
		<div class="col-xs-12">
		<c:forEach items="${requestScope.good_list }" var="good">
		<div class="row">
		
						<div class="col-md-4">
						
							<div class="thumbnail">
								<img alt="引导缩略图第一" src="img/good/all/${good.good_image }" height="100">
								<div class="caption">
									<h3><font><font>
										<a href="${pageContext.request.contextPath }/goGoodPrice/${good.good_name }">${good.good_name }</a>
									</font></font></h3>
								</div>
							</div>
						</div>
		</div>
		
		</c:forEach>
		</div></div>
						
						
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
				</div>
				<div class="col-md-4">
				</div>
				<div class="col-md-4">
					<div class="row">
						<div class="col-md-8">
						</div>
						<div class="col-md-4">
							 
							<address>
								 <strong><font><font>Twitter的，公司</font></font></strong><br><font><font>。795 Folsom Ave，Suite 600 </font></font><br><font><font>San Francisco，CA 94107 </font></font><br> <abbr title="电话"><font><font>P :(</font></font></abbr><font><font> 123）456-7890
							</font></font></address>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>