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
<h2>EL, JSTL 사용하여 String bookNames = {  }; 책이름배열 출력하기 </h2>

 <ul>
 <c:forEach var="booknames" items="${booknames}">
 <li>${booknames}</li>
 </c:forEach>
 </ul>
 
</body>
</html>