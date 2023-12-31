<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>저장소</h2>
<ul>
<li>pageContext ->pageScope</li> <!-- set Attribute 이후 -->
<li>request -> requestScope</li>
<li>session -> sessionScope</li>
<li>application ->apllicationScope</li>
</ul>

<!-- EL은 저장소에 담긴것만 사용할 수 있다. -->
<h3>pageContext</h3>
<p>jsp페이지 하나당 제공되는 저장소</p>
<p>jsp페이지내에서 EL사용하여 변수를 처리하고 싶을 때 사용한다.</p>

<h3>pageContext 예시</h3>
<%String test="EL을 사용하고 싶어요"; %>
<%=test %>
<h3>test 변수를 EL을 사용하고 싶다 / EL표현식은 저장소에 저장된 것들만 사용할 수 있다!!</h3>
${test} <!-- 이건 안나온다 왜? 저장소에 담긴게 아니라 -->
<%pageContext.setAttribute("test1", test); %> <!-- 저장소에 저장한 것 -->
${test1}
<h3>request</h3>
<p>하나의 요청이 공유해야 할 데이터를 저장하는 공간</p>

<h3>session</h3>
<p>사용자 한 명이 공유해야 하는 데이터를 저장하는 공간</p>

<h3>application</h3>
<p>모든 사용자가 공유해야 하는 데이터를 저장하는 공간 : 설정정보(데이터 베이스 연결정보)</p>



</body>
</html>