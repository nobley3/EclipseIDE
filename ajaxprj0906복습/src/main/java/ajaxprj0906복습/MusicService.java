package ajaxprj0906복습;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class MusicService {

	MusicDAO dao = new MusicDAO();

	public JSONArray getMusicRealList() {
		ArrayList<Music> list = dao.getMusicList();
		JSONArray arr = new JSONArray();

		for (int i = 0; i < list.size(); i++) {
			Music m = list.get(i);
			JSONObject o = new JSONObject();
			o.put("singer", m.getSinger());
			o.put("title", m.getTitle());
			arr.put(o);
		}
		return arr;
	}

}
