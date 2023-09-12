package prj0911시험연습;

import java.util.ArrayList;

public class Service {

	DAO dao = new DAO();
	
	public ArrayList<Customer> getMemberList(){
		ArrayList<Customer> list = dao.selectAll();
		return list;
	}
}
