package practice;

import java.util.ArrayList;

public class Service {

	DAO dao = new DAO();
	
	public ArrayList<Member> getMemberList(){
		ArrayList<Member> list = dao.selectAll();
		return list;
	}
}
