<%@page import="java.util.HashMap"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>
<body>
<h2>Hello World!</h2>

<% 
/* 	HashMap <String,String> c = new HashMap<String,String>();
 	Cookie[] cookies = request.getCookies();
	for(int i = 0;i<cookies.length;i++){
		c.put(cookies[i].getName(),cookies[i].getValue());
	} */

%>


<form action="hello">
username<input type="text"  maxlength="16" name="username" >
password<input type="password" maxlength="16" name="password" > 
<input type="submit" value="submit"/> 
</form>


<br/>

<form action="upload" enctype="multipart/form-data" method="post">
	<input type="file" name="uploadfile">
	<input type="submit" name="submit">
</form>

<hr/>
<a href="downloadlist.jsp">下载页</a>
</body>
</html>