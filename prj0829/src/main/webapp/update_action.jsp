<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>
<%
//1.
request.setCharacterEncoding("UTF-8");
//2. 넘어온 데이터 확인
String userid= request.getParameter("userid");
String userpw= request.getParameter("userpw");
String username= request.getParameter("username");

out.println(userid);
out.println(userpw);
out.println(username);

//데이터베이스 연결, sql update 실행
	Connection con= null;
	PreparedStatement st = null;
	
	try{ 
		// 데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		 
		Class.forName(driver); 
		con= DriverManager.getConnection(url, user, password); 
		 
		String sql =" update acorntbl";
				sql+=" set pw= ?";
				sql+=" where id= ?"; 
				
		st = con.prepareStatement(sql);
		st.setString(1,userpw);
		st.setString(2,userid);
				
		//실행
		st.executeUpdate();
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( st != null) st.close();
		if( con != null) con.close();
	}

//
//response.sendRedirect("index.jsp");
%>