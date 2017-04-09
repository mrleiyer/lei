<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String path = request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center> 
<div style="margin: 50px ">
	<form action="<%=path %>/search.action" method ="post" >
		<select name="searchType">
			<option value="1">根据作者搜索</option>
			<option value="2">根据题目搜索</option>
			<option value="3">根据内容搜索</option>
		</select>
		<input type="text" name="searchCondition" style="width:200px;"><br>
		<input type="submit" value="搜索一下" style="margin: 20px ">
	</form>
</div>
</center> 
</body>
</html>