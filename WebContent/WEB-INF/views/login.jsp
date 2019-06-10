<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<div align="center">
	<jsp:include page="member/include/header.jsp"></jsp:include>
</div>
<h1>Login</h1>
<a href="${pageContext.request.contextPath}/login_member">เจ้าของฟาม</a>
<a href="${pageContext.request.contextPath}/login_user">ผู้ใช้เสริม</a>
<a href="${pageContext.request.contextPath}/register">สมัคร</a>
<hr>
<h1></h1>

</body>
</html>