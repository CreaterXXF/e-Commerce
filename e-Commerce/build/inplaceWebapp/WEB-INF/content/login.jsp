<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>登录界面</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    
<link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

  </head>
  <body>


	<div id="web_bg" class="ground"> 
	<img style="position:fixed;" src="img/login/background.jpg" height="100%" width="100%" /> 
	</div>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<div class="page-header">
				<h1><font class="titile"><font>
					浦峰达零食店</font></font><small><font><font>Pu Feng Da Snakes</font></font></small>
				</h1>
			</div>
			<div class="row">
				<div class="col-md-4">
				</div>
				

<div class=" col-md-4 ">
<font color="red">${requestScope.changeMessage }</font>
<font color="red">${requestScope.success }</font>
<font color="red">${requestScope.message }</font>
	<div class="pos"></div>
			<h3 align="center"><front class="ziti"> 登录</front></h3>	
					<form class="form-horizontal" role="form" action="login" method="post">
						<div class="form-group">
							 
							<label for="user_num" class="col-sm-2 control-label"><font><font>
								账号
							</font></font></label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="user_num" name="user_num1" value="${ username}" placeholder="请输入账号">
							</div>
						</div>
						<div class="form-group">
							 
							<label for="user_password" class="col-sm-2 control-label"><font><font>
								 密码						</font></font></label>
							<div class="col-sm-10">
								<input type="password" class="form-control" id="user_password" name="user_password1" value="${ password}" placeholder="请输入密码">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									 
									<label>
										<input type="checkbox" onclick="remember();"><font><font> 记住密码
									</font></font></label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								 
								<button type="submit" class="btn btn-default"><font><font>
									登陆
								</font></font></button>
	<div class="col-sm-offset-5 col-sm-10"><h5 ><font ><a href="register" >
注册账号</a><a href="find" >
忘记密码
	</a><a href="change" >修改密码</a></font></h5></div>					</div>
						</div>
					</form>
					<div class="row">
						<div class="col-md-6">
						</div>
						<div class="col-md-6">
						</div>
					</div>
				</div>
				<div class="col-md-4">
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