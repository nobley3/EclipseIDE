<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>사칙연산</h2>
<%
int num1 = Integer.parseInt(request.getParameter("num1")) ;
int num2 = Integer.parseInt(request.getParameter("num2"));

%>
<%="덧셈결과: "+(num1+num2)+"<br>" %>
<%="뺄셈결과: "+(num1-num2)+"<br>" %>
<%="곳셈결과: "+(num1*num2)+"<br>" %>
<%="나눗셈결과: "+((double)num1/num2)%>

</body>
</html>