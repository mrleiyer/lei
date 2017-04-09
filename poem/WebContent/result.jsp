<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>搜索结果为:</h3>
	<s:set name = "searchType" value="searchType"/>
	<table border="1" width="40%" bordercolor="red" style="border-collapse: collapse;margin: 30px auto">
	
		<tr><td><s:property value ="searchCondition"/>的诗</td></tr>
		
		<s:iterator value ='searchResult' id="result">
			<tr>
				<td><s:property value ='result'/></td>
			</tr>
		</s:iterator>
		
	</table>
	
	<s:iterator value ='searchResult' id="result1" >
		<s:set value ='result1' name ='result2' />
		<s:property value ='result2.split("\\\\&")'/>
	
	</s:iterator>
	
</body>