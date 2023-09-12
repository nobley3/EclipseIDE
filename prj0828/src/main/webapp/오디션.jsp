<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오디션관리 프로그램</title>
<link href="./css/오디션조회.css" rel="stylesheet"/>
</head>
<body>
<table>
<caption>참가자 조회</caption>
<tr>
<td>참가자ID</td>
<td>참가자이름</td>
<td>생년월일</td>
<td>성별</td>
<td>실력무대</td>
<td>매력무대</td>
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
		String sql = " SELECT join_id ,"; 
				sql+=" join_nm ,  ";
				sql+=" substr(birth,1,4)|| '년' || substr(birth, 5,2) || '월' ||  substr(birth, 7,2) || '일'  ,"; 
				sql+=" decode(gender,'M','남성','F','여성') , ";
				sql+=" decode(specialty,'V','보컬', 'D','댄스', 'R','랩') ,";
				sql+=" charm";
				sql+=" FROM  tbl_join_200";
				
				
		//5. 최종적으로 실행
		System.out.println(sql);
		rs = st.executeQuery(sql);
		//6. 가져온 쿼리 결과를 화면에 출력하기
		while (rs.next()) {
%>
<!-- db연동후 데이터 조회부분 -->
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6) %></td>

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
</table>
</body>
</html>