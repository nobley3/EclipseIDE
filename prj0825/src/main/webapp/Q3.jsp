<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String [] msg = {"화이팅!!","힘내라!!","빠샤!!"};
int index = (int)(Math.random()*3);
%>
<%=msg[index] %>
</body>
</html>