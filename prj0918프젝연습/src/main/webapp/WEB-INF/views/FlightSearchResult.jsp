<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조회결과</title>
</head>
<body>
<h3>조회결과</h3>
<%String result = (String)request.getAttribute("result");
	if(result!=null){
		out.println(result+"<p");
	}else{
%>
<h3>
${f.fcode
</h3>
</body>
</html>