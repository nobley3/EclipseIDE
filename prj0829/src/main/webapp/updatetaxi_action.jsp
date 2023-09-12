<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@  page import="java.sql.*" %>
<%
//1.
request.setCharacterEncoding("UTF-8");
//2. 넘어온 데이터 확인
String reginum= request.getParameter("reginum");
String regitime= request.getParameter("regitime");
String regidate= request.getParameter("regidate");
String cusid= request.getParameter("cusid");
String departure= request.getParameter("departure");
String arrival= request.getParameter("arrival");
String taxinum= request.getParameter("taxinum");
String choose= request.getParameter("choose");


System.out.println(reginum);
System.out.println(regitime);
System.out.println(regidate);
System.out.println(cusid);
System.out.println(departure);
System.out.println(arrival);
System.out.println(taxinum);
System.out.println(choose);


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
		 
		String sql =" update tblcall_list ";
				//sql+=" set regtime= ?  ,";
				//sql+=" regdate= ?,";
				//sql+=" startpoint= ?,";
				sql+=" set destination= ? ";
				sql+=" where regno= ? "; 
				
			
				System.out.println(sql);
				
				st = con.prepareStatement(sql);
			//	st.setString(1,regitime);
			//	st.setString(2,regidate);
				//st.setString(3,departure);
				st.setString(1,arrival);
				st.setString(2,reginum);
				
				
			
				
				
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