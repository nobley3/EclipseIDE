<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="prj0913시험연습.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> 에이콘 학생 List</h2>
<%ArrayList<Customer> list = (ArrayList<Customer>)request.getAttribute("list"); %>
<table border="1">

<tr>
<td>아이디</td>
<td>비번</td>
<td>이름</td>
</tr>

<%for(int i=0;i<list.size();i++){

	 Customer c = list.get(i);
	 Customer c2 = list.get(i);
	 Customer c3 = list.get(i);
%>

<tr>
<td><%=c.getId() %></td>
<td><%=c.getPw() %></td>
<td><%=c.getName() %></td>

</tr>
<%}%>
</table>
</body>
</html>