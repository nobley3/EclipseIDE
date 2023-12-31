package ajaxprj0906복습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MusicDAO {
	  String driver = "oracle.jdbc.driver.OracleDriver" ;
	  String url="jdbc:oracle:thin:@localhost:1521:dbtest";
	  String user="scott";
	  String password="tiger";	
	  
	  public Connection dbcon(){	 
			Connection con =null;
			try {
				Class.forName(driver);
				con  =DriverManager.getConnection(url, user, password);
				if( con != null) System.out.println("ok");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return con;
		}
	  
	  public ArrayList<Music> getMusicList(){
		  Connection con = dbcon();
		  
		  String sql="select * from musictbl";
		  ArrayList<Music> list = new ArrayList<>();
		  try {
			  PreparedStatement pst = con.prepareStatement(sql);
			  ResultSet rs = pst.executeQuery();
			  
			  while(rs.next()) {
				  String singer = rs.getString(1);
				  String title = rs.getString(2);
				  
				  Music music = new Music(singer,title);
				  list.add(music);
			  }
			  rs.close();
			  pst.close();
			  con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return list;
	  }
}
