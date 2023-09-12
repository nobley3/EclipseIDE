package prj0907연습;

import java.util.ArrayList;

public class AService {

	DAO dao = new DAO();
	
	public ArrayList<Member> getMemberList(){
		ArrayList<Member> list = dao.selectAll();
		return list;
	}
}
