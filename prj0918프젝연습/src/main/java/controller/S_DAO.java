package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class S_DAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";
	
	public Connection db() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
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
	
	public FlightVO flightSearch(String fcode){
		Connection con = db();
		PreparedStatement pst = null;
		ResultSet rs = null;
		FlightVO f = null;
		try {
			
			pst =con.prepareStatement("select * from flight_prj3 where fcode=?");
			pst.setString(1, fcode);
			rs = pst.executeQuery();
			while(rs.next()) {
				f = new FlightVO();
				
				f.setFcod(rs.getString(1));
				f.setDeparture(rs.getString(2));
				f.setArrival(rs.getString(3));
				f.setSday(rs.getString(4));
				f.setEday(rs.getString(5));
				f.setStime(rs.getString(6));
				f.setEtime(rs.getString(7));
				f.setAirnum(rs.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
}
