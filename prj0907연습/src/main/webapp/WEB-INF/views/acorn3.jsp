<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "prj0907연습.Member" %>
    <%@page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>학생정보 All List</h2>
<% ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list");%>
<% for(int i=0;i<list.size();i++){
	out.println(list.get(i)+"<br>");
} %>
</body>
</html>