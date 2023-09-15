package prj0915프로젝트연습;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class Syj_flightService {

	S_flightDAO f_dao = new S_flightDAO();
	
	public JSONArray getFlightInfo() {
		
		ArrayList<check> list = f_dao.getFlightList();
		JSONArray arr = new JSONArray();
		
		for(int i=0;i<list.size();i++) {
			check c = list.get(i);
			JSONObject o = new JSONObject();
			
			o.put("fcode",c.getFcode());
			o.put("departure",c.getDeparture());
			o.put("arrival",c.getArrival());
			o.put("sday",c.getSday());
			o.put("eday",c.getEday());
			o.put("stime",c.getStime());
			o.put("etime",c.getEtime());
			o.put("airnum",c.getAirnum());
			arr.put(o);
		}
		return arr;
	}
}
