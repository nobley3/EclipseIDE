package 프로젝트연습;

import java.util.ArrayList;

public class FlightService {

	FlightDAO dao = new FlightDAO();
	
	public check getcheckList(){
		ArrayList<check> list = dao.selectFlightinfo();
		return list;
	}
}
