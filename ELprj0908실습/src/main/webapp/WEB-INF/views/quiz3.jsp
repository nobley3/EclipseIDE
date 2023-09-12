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
<h2>EL, JSTL 사용하여 성적에 따라 A, B, C ,F( 70미만)  출력하기   <c:set var="kor"   value="90" />  kor변수에 점수값</h2>

<c:choose>
<c:when test="${score>=90}">A</c:when>
<c:when test="${score>=80}">B</c:when>
<c:when test="${score>=70}">C</c:when>
<c:otherwise>F</c:otherwise>
</c:choose>

</body>
</html>