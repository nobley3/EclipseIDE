package testprj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 

public class AcornDAO3 {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	public Connection dbcon() {		 
		Connection con = null;
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println( "ok");
			
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
		//연결
		Connection con  =dbcon();
		
		//sql
		String sql="select name from acorntbl";		
		//sql실행
		PreparedStatement pst=null;
		ResultSet rs =null;
		
		ArrayList<String> list =new ArrayList<>();
		try {
			pst=con.prepareStatement(sql);
			rs =pst.executeQuery();
			
			while( rs.next()) {
				list.add(rs.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		//해제
		close(rs,pst, con);
		return list;		
	}
	
	
	/*
	public Customer selectOne() {
		Customer c= new Customer("t1","0000","choi");
		return c; 
		
	}
	*/
	

	public ArrayList<Member> selectAll2() {
		Connection con = dbcon(); 
		System.out.println( "dkdkdkdk" + con);
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
	public void close(AutoCloseable... autoCloseables) {
		for (AutoCloseable item : autoCloseables) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		}
	}
}
