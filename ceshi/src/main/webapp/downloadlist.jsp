<%@page import="java.util.ArrayList"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String path = "D:\\test";
	File d = new File(path);
	//ArrayList<String> files = new ArrayList<String>();
	if(d.isDirectory()){
		File[] files = d.listFiles();
		for(int i = 0;i < files.length;i++){
			String filename = files[i].getName();
			out.println("<a href=\"download?filename="+filename+"\">"
			+filename+"</a>");
		}
	}
%>




</body>
</html>