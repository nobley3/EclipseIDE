<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>메인화면이다</h2>

<form name ="frm" action="/prj0918project/S_check" method="get">
 <label for="fcode"> fcode 입력:</label>
 <input type="text"  name="fcode">
 <button>조회</button>
</form>


<%String fcode =(String)session.getAttribute("fcode"); 
	if(fcode!=null){
		%>
		<a href="/prj0918project/S_check">조회하기</a>
	<%
	}
	%>

</body>
</html>