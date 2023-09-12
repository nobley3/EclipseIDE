<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import = "java.util.ArrayList" %>
       <%@page import = "prj0907연습.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> 에이콘 학생 정보</h2>

<% ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list"); %>
<% for(int i=0;i<list.size();i++){
	out.println(list.get(i)+"<br>");
}%>
</body>
</html>