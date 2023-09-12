package prj0907연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	
	public Connection dbAcorn() {
		Connection con = null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			if(con!=null) {
				System.out.print("ok");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public ArrayList<String> selectAll(){
		
		Connection con = dbAcorn();
		String sql="select name from acorntbl";
		
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
		close(rs,pst,con);
		return list;
	}
	
	public void close(AutoCloseable...autoCloseables) {
		for(AutoCloseable item : autoCloseables) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
