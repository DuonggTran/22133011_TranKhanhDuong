<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/
bootstrap.min.css"
	rel="stylesheet">
<title>Đăng nhập tài khoản</title>
</head>
<body>
	<header class="row">
		<div class="col">
			<div class="alert alert-primary col" align="center">
				<h1>Tạo lại mật khẩu </h1>
			</div>
		</div>
	</header>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-12 col-md-5">
				<form action="/Login_Register/forgot-password" method="post">
					<c:if test="${alert != null}">
						<label class="alert alert-danger">${alert}</label>
					</c:if>
					<div class="form-group">
						<label for="username">Username:</label> <input type="text"
							id="username" name="username" class="form-control" />
					</div>
					<div class="form-group">
						<label for="password">Mật khẩu mới: </label> <input type="password"
							id="password" name="password" class="form-control" />
					</div>
					<div class="form-group mt-3" align="center">
						<button type="submit" class="btn btn-primary">Xác nhận</button>
					</div>
					<div class="form-group mt-3" align="center">
						<!-- Link quên mật khẩu -->
						<a href="/Login_Register/login" class="btn btn-link">Đăng nhập?</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
