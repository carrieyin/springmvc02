<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 color="blue"></h1>
	<form action="${pageContext.request.contextPath }/user/receiveInt.do"
		method="post">
		ID:<input type="text" name="id" id="id"> <input type="submit"
			value="提交">
	</form>
	<h1 color="blue" size="10"></h1>
	<form
		action="${pageContext.request.contextPath }/user/receiveString.do"
		method="post">
		name:<input type="text" name="name" id="name"> <input
			type="submit" value="提交">
	</form>

    <h1 color="blue" size="10"></h1>
	<form action="${pageContext.request.contextPath }/user/receiveUser.do"
		method="post">
		ID：<input type="text" name="id" id="id">
		姓名：<input type="text" name="username" id="username"> 
		生日：<input type="text" name="birthday" id="birthday"> 
		性别：<input type="text" name="sex" id="sex"> 
		地址：<input type="text" name="address" id="address"> 
		<input type="submit" value="提交">
	</form>
	
	<h1 color="blue" size="10"></h1>
	<form action="${pageContext.request.contextPath }/user/receiveCustom.do"
		method="post">
		ID：<input type="text" name="user.id" id="id">
		姓名：<input type="text" name="user.username" id="username"> 
		生日：<input type="text" name="user.birthday" id="birthday"> 
		性别：<input type="text" name="user.sex" id="sex"> 
		地址：<input type="text" name="user.address" id="address"> 
		<input type="submit" value="提交">
	</form>
	
	<h1 color="blue" size="10"></h1>
	<form action="${pageContext.request.contextPath }/user/receiveArray.do"
		method="post">
		ID：<input type="checkbox" name="ids"  id="ids" value="1">
		ID：<input type="checkbox" name="ids"  id="ids" value="2">
		ID：<input type="checkbox" name="ids"  id="ids" value="3">
		 
		<input type="submit" value="提交">
	</form>
	
	<h1 color="blue" size="10"></h1>
	<form action="${pageContext.request.contextPath }/user/receiveUserList.do"
		method="post">
		ID：<input type="text" name="userList[0].id" id="id">
		姓名：<input type="text" name="userList[0].username" id="username"> 
		ID：<input type="text" name="userList[1].id" id="id">
		姓名：<input type="text" name="userList[1].username" id="username"> 
		 
		<input type="submit" value="提交">
	</form>
	
	<h1 color="blue" size="10"></h1>
	<form action="${pageContext.request.contextPath }/user/receiveMap.do"
		method="post">
		name：<input type="text" name="map['name']" id="username">
		ID：<input type="text" name="map['ID']" id="id"> 
		 
		<input type="submit" value="提交">
	</form>
	
</body>
</html>