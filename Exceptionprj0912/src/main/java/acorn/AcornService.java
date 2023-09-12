package acorn;

import java.sql.SQLException;

public class AcornService {

	AcornDAO dao = new AcornDAO();
	
//	회원정보등록하는기능
	 public void registerCstomer(Customer c) throws SQLException {
		 dao.insert(c);
	 }
}
