package prj0901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CoffeeDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	
	public Connection Coffee() {
		Connection cf = null;
		try {
			Class.forName(driver);
			cf=DriverManager.getConnection(url, user, password);
			if(cf!=null) {
				System.out.println("ok");
			}
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cf;
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
	
	public ArrayList<String> selectAll(){
		Connection cf = Coffee();
		String sql = "select * from goodstbl";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<String>list = new ArrayList<>();
		   try {
			pst = cf.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				list.add(rs.getString(1));
				list.add(rs.getString(2));
				list.add(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   close(rs,pst,cf);
		   return list;
	}
	
	public void insertCoffee(String id,String name, String price) {
		Connection con = Coffee();
		String sql="insert into goodstbl values(?,?,?)";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, name);
			pst.setString(3, price);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pst,con);
	}
	
	public static void main(String[] args) {
		CoffeeDAO c = new CoffeeDAO();
		c.insertCoffee("c004", "카페모카","3600");
	}
	
	
}
