<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조회</title>
</head>
<body>
<h2>예약조회검색</h2>
${error}
<form action="S_flightSearch.do" method="post">
Fcode : <input type="text" name="fcode"/>
<input type ="submit" value="조회"/>

</form>
</body>
</html>