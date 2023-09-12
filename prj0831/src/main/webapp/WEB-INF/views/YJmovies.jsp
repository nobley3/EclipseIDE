<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
    <%@ page import="prj0831.YJMovie" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/default.css" rel="stylesheet"/>
</head>
<body>
<header>Movie's Info List</header>
<section>
<div>
<%
ArrayList<YJMovie> list = (ArrayList<YJMovie>)request.getAttribute("list");
for(YJMovie M : list){
	//out.println(M+"<br>");
	out.println(M.getTitle()+"<br>");
	out.println(M.getAge()+"<br>");
	out.println(M.getGenre()+"<br>");
	out.println(M.getRunningtime()+"<br>"+"<br>");
}

%>
</div>
</section>
</body>
</html>