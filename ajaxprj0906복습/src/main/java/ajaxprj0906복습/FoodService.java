package ajaxprj0906복습;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class FoodService {
	
	FoodDAO dao = new FoodDAO();

	public JSONObject getFoodInfo() {
		Food food = new Food("마라탕","8000");
		JSONObject o = new JSONObject();
		o.put("name", food.getName());
		o.put("price", food.getPrice());
		return o;
	}
	
	public JSONArray getFoodList() {
		ArrayList<Food>list=new ArrayList<>();
		list.add(new Food("마라탕","8000"));
		list.add(new Food("초밥","12000"));
		list.add(new Food("김밥","4500"));
		
		JSONArray arr = new JSONArray();
		for(int i=0;i<list.size();i++) {
			Food f = list.get(i);
			JSONObject o = new JSONObject();
			o.put("name", f.getName());
			o.put("price", f.getPrice());
			arr.put(o);
		}
		return arr;
	}
	
	public JSONArray getFoodRealList() {
		ArrayList<Food>list = dao.getFoodList();
		JSONArray arr = new JSONArray();
		
		for(int i=0;i<list.size();i++) {
			Food f = list.get(i);
			JSONObject o = new JSONObject();
			o.put("name", f.getName());
			o.put("name", f.getPrice());
			arr.put(o);
		}
		return arr;
	}
}
