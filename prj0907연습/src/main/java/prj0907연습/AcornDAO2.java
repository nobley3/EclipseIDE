package prj0907연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO2 {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";

	public Connection dbcon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			if (con != null) {
				System.out.println("ok");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
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

	public ArrayList<String> selectAll() {
		Connection con = dbcon();
		String sql = "select name from acorntbl";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		ArrayList<String> list = new ArrayList<>();

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				list.add(rs.getString(1));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con,rs,pst);
		return list;
	}
	
	
	public ArrayList<Member> selectAll2() {
		Connection con = dbcon();
		
		
		System.out.println(con);
		String sql = "select * from acorntbl";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		ArrayList<Member> list = new ArrayList<>();

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				String id=  rs.getString(1);
				String pw=  rs.getString(2);
				String name=  rs.getString(3);				
				
				list.add(new Member(id,pw,name));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con,rs,pst);
		return list;
	}
	
	 public static void main(String[] args) {
		 
		 AcornDAO2  dao = new AcornDAO2();
		 ArrayList<Member>  list = dao.selectAll2();		 
		 System.out.println(list);
		
	}
}
