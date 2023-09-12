package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO2 {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";

	public Connection dbcon() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if (con != null)
				System.out.println("ok");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public int getTotalCnt() {

		Connection con = dbcon();
		String sql = "select count(*)from member_tbl_11"; // 11
		int totalCnt = 0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(); // 가져올게있으면 executeQuery

			if (rs.next()) {
				totalCnt = rs.getInt(1); // 첫번째 컬럼 int로 가져오는
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// close();
		return totalCnt;
	}

	// 현재페이지에 대한 목록 가져오기
	// 입력 : 현재페이지번호, 페이지size크기
	// 반환: ArrayList<Member> (고객목록)
	public ArrayList<Member> getListPage(int page, int pageSize) { //받아오는거
		//한 페이지에 보일 글의 수 : 4라는 가정하에
		//1페이지 => (1~4)
		//2페이지 => (5~8)
		
		int startPage=0,endPage=0;
		startPage=((page-1)*pageSize)+1;
		endPage=page * pageSize;
		
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String sql = "select *"
				+ "from(select rownum num,M_ID,M_PW,M_NAME,M_TEL,M_BIRTHDAY,M_POINT,M_GRADE from MEMBER_TBL_11)"
				+ "where num between ? and ?";
		
		System.out.println(sql);
		ArrayList<Member>list = new ArrayList<>();
		
		try {
			pst =con.prepareStatement(sql);
			pst.setInt(1, startPage);
			pst.setInt(2, endPage);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String m_id=rs.getString(2);
				String M_PW=rs.getString(3);
				String M_NAME=rs.getString(4);
				String M_TEL=rs.getString(5);
				String M_BIRTHDAY=rs.getString(6);
				int M_POINT=rs.getInt(7);
				String M_GRADE=rs.getString(8);
				list.add(new Member(m_id,M_PW,M_NAME,M_TEL,M_BIRTHDAY,M_POINT,M_GRADE));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs,pst,con);
		return list;
	}

	public static void main(String[] args) {
		MemberDAO2 dao = new MemberDAO2();
		if (dao.dbcon() != null) {
			System.out.println("ok");
		}
		int result = dao.getTotalCnt();
		System.out.println(result);

//		ArrayList<Member> list = dao.selectAll(); //전체출력
//		System.out.println(list);
		
		ArrayList<Member> list = dao.getListPage(1,4);
		System.out.println(list);
		
	}

	public ArrayList<Member> selectAll() {
		Connection con = dbcon();
		ArrayList<Member> list = new ArrayList<>();
		String sql = "select * from member_tbl_11";
		ResultSet rs = null;
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String m_id = rs.getString(1);
				String m_pw = rs.getString(2);
				String m_name = rs.getString(3);
				String m_tel = rs.getString(4);
				String m_birthday = rs.getString(5);
				int m_point = rs.getInt(6);
				String m_grade = rs.getString(7);
				Member m = new Member(m_id, m_pw, m_name, m_tel, m_birthday, m_point, m_grade);
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs, pst, con);
		return list;
	}

	public void close(AutoCloseable... autoCloseables) {
		for (AutoCloseable item : autoCloseables) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
