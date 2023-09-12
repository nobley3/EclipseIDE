<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>참가자 등수 조회</title>
<link href="./css/오디션조회.css" rel="stylesheet"/>
</head>
<body>
<table>
		<caption>참가자 등수조회</caption>
		<tr class="ppyo">
			
			<td>참가자ID</td>
			<td>참가자이름</td>
			<td>종합점수</td>
			<td>평균점수</td>
			<td>순위</td>
			
		</tr>
		<%
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

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
			st = con.createStatement();
			//4. 필요한 sql 작성
			String sql = " SELECT   artistid, join_nm ,";    
					sql+=" sum(score)  , ";
					sql+=" trunc(avg(score),2), ";
					sql+=" rank () over( order by avg(score) desc ) rank"; 
					sql+=" FROM    tbl_score_200 s, tbl_join_200 j";
					sql+=" WHERE  s.artistid  = j.join_id";
					sql+=" GROUP BY  artistid, join_nm";
					sql+=" ORDER BY   rank "; 

			//5. 최종적으로 실행
			System.out.println(sql);
			rs = st.executeQuery(sql);
			//6. 가져온 쿼리 결과를 화면에 출력하기
			while (rs.next()) {
		%>
		<!-- db연동후 데이터 조회부분 -->
		<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><%=rs.getString(5)%></td>
			
			


		</tr>
		<%
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

</body>
</html>