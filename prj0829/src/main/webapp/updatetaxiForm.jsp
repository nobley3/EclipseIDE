<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@  page import="java.sql.*"%>
<%
String regno = request.getParameter("regno");
out.println(regno);

 
String regitime = "";
String regidate = "";
String cusid = "";
String departure = "";
String arrival = "";
String taxinum = "";
String choose = "";

Connection con = null;
Statement st = null;
ResultSet rs = null;
try {
	// 데이터베이스 연결정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";

	//1. 오라클드라이버 로딩
	Class.forName(driver);
	//2. 데이터베이스 연결
	con = DriverManager.getConnection(url, user, password);
	//3. statement 얻어오기
	st = con.createStatement();
	//4. 필요한 sql 작성
	String sql = " select REGNO 예약번호, ";
			sql+="  REGTIME ";
			sql+=" to_char(REGDATE,'yyyy-mm-dd') 예약날짜, ";
			sql+=" CUSNO 고객아이디, ";
			sql+=" STARTPOINT 출발지, ";
			sql+=" DESTINATION 도착지 ,";
			sql+=" TEXINO 택시번호, ";
			sql+=" STATE 배차상태" ;
			sql+=" from tblcall_list where regno='" + regno + "'"; //5. 최종적으로 실행
	rs = st.executeQuery(sql);
	//6. 가져온 쿼리 결과를 화면에 출력하기
	if (rs.next()) {
		 //out.print(rs.getString(1)); // out은 브라우저에 출력을 의미함
		 // out.print(rs.getString(2));
		// out.print(rs.getString(3)+"<br>");
		regitime = rs.getString(2);
		regidate = rs.getString(3);		 
		cusid = rs.getString(4);
		departure = rs.getString(5);
		arrival = rs.getString(6);
		taxinum = rs.getString(7);
		choose = rs.getString(8);

	}
} catch (Exception e) {
	e.printStackTrace();
} finally { //자원의 반납
	if (rs != null)
		rs.close();
	if (st != null)
		st.close();
	if (con != null)
		con.close();
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="frm" action="updatetaxi_action.jsp" method="post">
		<table>
			<tr>
				<td>예약번호</td>
				<td><input type="text" readonly="readonly" name="reginum"></td>
			</tr>
			<tr>
				<td>예약시간</td>
				<td><input type="text" name="regitime"></td>
			</tr>
			<tr>
				<td>예약날짜</td>
				<td><input type="text" name="regidate"></td>
			</tr>
			<tr>
				<td>고객아이디</td>
				<td><input type="text" readonly="readonly" name="cusid"></td>
			</tr>
			<tr>
				<td>출발지</td>
				<td><input type="text" name="departure"></td>
			</tr>
			<tr>
				<td>목적지</td>
				<td><input type="text" name="arrival"></td>
			</tr>
			<tr>
				<td>택시번호</td>
				<td><input type="text" readonly="readonly" name="taxinum"></td>
			</tr>
			<tr>
				<td>배차상태</td>
				<td><input type="text" readonly="readonly" name="choose"></td>
			</tr>
			<tr>
				<td><input type="submit" value="수정"></td>
			</tr>
		</table>
	</form>
	
	<script>
		let frm = document.frm;
		frm.reginum.value="<%=regno%>";
		frm.regitime.value="<%=regitime%>";
		frm.regidate.value="<%=regidate%>";
		frm.cusid.value="<%=cusid%>";
		frm.departure.value="<%=departure%>";
		frm.arrival.value="<%=arrival%>";
		frm.taxinum.value="<%=taxinum%>";
		frm.choose.value="<%=choose%>";
	</script>
</body>
</html>