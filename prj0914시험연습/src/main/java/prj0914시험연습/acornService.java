package prj0914시험연습;

import java.util.ArrayList;

public class acornService {

	acornDAO dao = new acornDAO();
	
	public ArrayList<Customer> getMemberList(){
		ArrayList<Customer> list = dao.selectAll();
		return list;
	}
}
