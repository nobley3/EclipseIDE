<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>EL, JSTL 사용하여 전체 구구단 출력하기 </h2>


<c:forEach var="i" begin="2" end="9">
<c:out value="${i}단을 출력합니다."/><br/>
<c:forEach var="j" begin="1" end="9">
<c:out value="${i}x${j}=${i*j}"/><br/>
</c:forEach>
<hr/>
</c:forEach>

</body>
</html>