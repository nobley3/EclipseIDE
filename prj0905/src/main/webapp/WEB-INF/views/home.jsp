<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
첫페이지
<%String id =(String)session.getAttribute("id"); 
if(id==null){
%>
<a href="/prj0905/login">로그인</a>

<%}else{ %>
<a href="/prj0905/logout">로그아웃</a>
<a href="/prj0905/order">주문하기</a>
<%} %>
</body>
</html>