<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="practice.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<table>

		<%
		ArrayList<Member> list = (ArrayList<Member>) request.getAttribute("list");
		%>
		<tr>
			<td>아이디</td>
			<td>비번</td>
			<td>이름</td>
		</tr>

		<tr>
			<td>
				<%
				for (int i = 0; i < list.size(); i++) {
					out.println(list.get(i).getId());
				}
				%>
			</td>
			<td><%
				for (int i = 0; i < list.size(); i++) {
					out.println(list.get(i).getPw());
				}
				%></td>
			<td><%
				for (int i = 0; i < list.size(); i++) {
					out.println(list.get(i).getName());
				}
				%></td>
		</tr>

		
	
	</table>




</body>
</html>