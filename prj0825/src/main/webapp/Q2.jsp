<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>원하는 만큼 별 출력</h2>
<%
int num = Integer.parseInt(request.getParameter("num"));
for(int i=0;i<num;i++){
	out.print("*");
}
%>

</body>
</html>