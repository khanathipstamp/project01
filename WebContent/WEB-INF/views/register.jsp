<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
input[type=text], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 100%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

div {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>
<body>

	<h3>สมัคร</h3>

	<div>
		<form action="${pageContext.request.contextPath}/add_register"
			method="Post">
			<label >ชื่อ</label> <input type="text" id="name"
				name="firstname" placeholder="ชื่อ.."> <label >นามสกุล</label>
			<input type="text" id="lname" name="lastname" placeholder="นามสกุล..">
			<label for="country">ที่อยู่</label> <select id="country"
				name="country">
				<option value="australia">Australia</option>
				<option value="canada">Canada</option>
				<option value="usa">USA</option>
			</select> <input type="submit" value="ยื่นยัน">
		</form>
	</div>

</body>
</html>