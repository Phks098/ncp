<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
.nav-list li {
	display: inline-block;
	margin-bottom: 3px;
	width: 180px;
	height: 30px;
	text-align: center;
}

.nav-list li:hover {
	cursor: pointer;
	background-color: red;s
	color: #fff;
}

.nav-inner {
	border-bottom: 1px solid #d0d2d4;
	margin-bottom: 10px;
}

.contents-setting1 {
	display: none;
}

.contents-setting1.show {
	display: block;
}

.contents-setting2 {
	display: none;
}

.contents-setting2.show {
	display: block;
}

.contents-info {
	display: none;
}

.contents-info.show {
	display: block;
}
</style>
</head>
<%

	String t = "20210101";
	session.setAttribute("name", t);

%>


<body>
<div><input type="button" value="A이동" onclick="location.href='A.jsp?num=2'"></div>
<div><input type="button" value="B이동" class="name" onclick="location.href='B.jsp'"></div>
</body>