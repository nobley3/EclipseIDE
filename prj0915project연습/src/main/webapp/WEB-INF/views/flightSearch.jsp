<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>예약확인</h2>
	<!-- fcode입력하지 않은 상태에서 검색했을때 오류메시지 출력하는 코드 -->
	${error}
	<form action="flightSearch.do" method="post">
		fcode : <input type="text" name="fcode"/>
		<input type="hidden" name="job" value="search"/>
		<input type="submit" value="조회"/>
	</form>
</body>
</html>