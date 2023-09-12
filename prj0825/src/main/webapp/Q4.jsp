<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
img{
width: 400px;
height: 200px;
}
</style>
<%
String img[ ]= {"prj/img/Img3.jpg","prj/img/Img4.jpg","prj/img/Img5.jpg"};
int index = (int)(Math.random()*3);
%>
<%= "<img src=\"/"+ img[index] +"\">" %>
</body>
</html>