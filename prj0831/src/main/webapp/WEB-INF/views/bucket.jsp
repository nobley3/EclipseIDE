<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/default.css" rel="stylesheet"/>
</head>
<body>
<header> 예진's Bucket List </header>

<section>
<div>
<%
ArrayList<String> list = (ArrayList<String>)request.getAttribute("bucket");
%>
<%
for(int i=0;i<list.size();i++){
	String bucket = list.get(i);
	out.println(bucket+"<br>");
}
%>
</div>
</section>
</body>
</html>