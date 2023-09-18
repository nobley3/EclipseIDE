package prj0918project;

import java.util.ArrayList;

public class S_flightService {

	S_flightDAO sdao = new S_flightDAO();
	
	public ArrayList<Flight> getreginfo(String fcode){
		ArrayList<Flight> list = sdao.selectcheck(fcode);
		return list;
	} 
}
