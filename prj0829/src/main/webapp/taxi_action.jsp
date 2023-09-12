<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*"%>
<%

request.setCharacterEncoding("UTF-8");

String reginum = request.getParameter("reginum");
String regitime = request.getParameter("regitime");
String regidate = request.getParameter("regidate");
String cusid = request.getParameter("cusid");
String departure = request.getParameter("departure");
String arrival = request.getParameter("arrival");
String taxinum = request.getParameter("taxinum");
String choose = request.getParameter("choose");

Connection con = null;
PreparedStatement st = null;

try {
	//데이터베이스 연결정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";

	//1. 오라클드라이버 로딩
	Class.forName(driver);
	//2. 데이터베이스 연결
	con = DriverManager.getConnection(url, user, password);
	//3. statement 얻어오기
	String sql = "insert into tblcall_list values( ?,?,?,?,?,?,?,?) ";
	st = con.prepareStatement(sql);

	st.setString(1, reginum);
	st.setString(2, regitime);
	st.setString(3, regidate);
	st.setString(4, cusid);
	st.setString(5, departure);
	st.setString(6, arrival);
	st.setString(7, taxinum);
	st.setString(8, choose);

	st.executeUpdate();

} catch (Exception e) {
	e.printStackTrace();
} finally { //자원의 반납		 
	if (st != null)
		st.close();
	if (con != null)
		con.close();
}


%>