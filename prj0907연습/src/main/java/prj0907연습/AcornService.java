package prj0907연습;

import java.util.ArrayList;

public class AcornService {
	AcornDAO dao = new AcornDAO();
	
	public ArrayList<String> getMemberList(){
		ArrayList<String> list = dao.selectAll();
		return list;
	}
	
}
