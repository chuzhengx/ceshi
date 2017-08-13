<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="3">
<c:forEach items="${users}" var="user" varStatus="vs">
<tr>
	<td>${user.name}</td>
	<td>${user.job}</td>
	<td>${user.sal}</td>
</tr>
</c:forEach>
</table>

<c:out value="hello jstl"></c:out>

<c:set var="v1" value="hello this is a var" scope="session"></c:set>
<hr/>
<c:out value="${v1}"></c:out>
<hr/>
<c:remove var="v1"/>
<c:out value="${v1}" default="error"></c:out>

<hr/>
<c:catch var="cexcption">
	<% int i = 5/0; %>
</c:catch>
<c:if test="${cexcption!=null}">
	<h1>hello${cexcption} </h1>
</c:if>
</body>
</html>