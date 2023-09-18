<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.ArrayList" %>
     <%@page import="prj0918project.Flight" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> 예약조회</h2>

<form name ="frm" action="/prj0918project/S_check" method="get">
 <label for="fcode"> fcode 입력:</label>
 <input type="text"  name="fcode">
 <button>조회</button>
</form>

<% ArrayList<Flight> list = (ArrayList<Flight>) request.getAttribute("list"); %>
<% if (list != null) { %>
    <% for (int i = 0; i < list.size(); i++) { %>
        <ul>
            <li>fcode: <%= list.get(i).getFcod() %></li>
            <li>departure: <%= list.get(i).getDeparture() %></li>
            <li>arrival: <%= list.get(i).getArrival() %></li>
            <li>Sday: <%= list.get(i).getSday() %></li>
            <li>Eday: <%= list.get(i).getEday() %></li>
            <li>Stime: <%= list.get(i).getStime() %></li>
            <li>Etime: <%= list.get(i).getEtime() %></li>
            <li>airnum: <%= list.get(i).getAirnum() %></li>
        </ul>
    <% } %>
<% } %>

</body>
</html>