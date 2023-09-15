<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="프로젝트연습.check" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> 예약조회 화면</h2>

<form action="<%=request.getContextPath()%>">
<input type="text" placeholder="예약번호를 입력하세요">
<button type="submit">전송</button>
</form>
<%ArrayList<check> list =(ArrayList<check>) request.getAttribute("list");%>
<table>
<tr>
<td>항공번호</td>
<td>출발지</td>
<td>도착지</td>
<td>출발날짜</td>
<td>도착날짜</td>
<td>출발시간</td>
<td>도착시간</td>
<td>비행번호</td>
</tr>

<%for(check c : list){ 

%>
<tr>
<td><%=c.getFcode()%></td>
<td><%=c.getDeparture() %></td>
<td><%=c.getArrival() %></td>
<td><%=c.getSday() %></td>
<td><%=c.getEday() %></td>
<td><%=c.getStime() %></td>
<td><%=c.getEtime() %></td>
<td><%=c.getAirnum() %></td>
</tr>
<%} %>
</table>
</body>
</html>