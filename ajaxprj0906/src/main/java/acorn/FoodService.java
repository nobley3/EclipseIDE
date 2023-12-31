package acorn;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class FoodService {
	
	FoodDAO dao = new FoodDAO();
	
	//한개
	public JSONObject getFoodInfo() {
		Food food = new Food("볶음밥","6000");
		//Json 형태로 바꿀것
		JSONObject o = new JSONObject();
		o.put("name", food.getName());
		o.put("price", food.getPrice());
		return o;
	}
	
	//여러개
	public JSONArray getFoodList() {
		ArrayList<Food> list = new ArrayList<>();
		list.add(new Food("볶음밥","6000"));
		list.add(new Food("마라탕","8000"));
		list.add(new Food("초밥","12000"));
		
		JSONArray arr = new JSONArray();
		
		for(int i=0;i<list.size();i++) {
			Food f = list.get(i); //볶음밥
			JSONObject o = new JSONObject();
			o.put("name",f.getName());
			o.put("price", f.getPrice());
			arr.put(o);
			
		}
		return arr;
	}
	

		public JSONArray getFoodRealList() {
			/*
			ArrayList<Food> list = new ArrayList<>();
			list.add(new Food("볶음밥","6000"));
			list.add(new Food("마라탕","8000"));
			list.add(new Food("초밥","12000"));
			*/
			ArrayList<Food> list = dao.getFoodList();
			JSONArray arr = new JSONArray();
			
			for(int i=0;i<list.size();i++) {
				Food f = list.get(i); //볶음밥
				JSONObject o = new JSONObject();
				o.put("name",f.getName());
				o.put("price", f.getPrice());
				arr.put(o);
				
			}
			return arr;
		}
}
