package prj0901;

import java.util.ArrayList;

public class CoffeeService {

	CoffeeDAO  dao = new CoffeeDAO(); //db연결
	
	public ArrayList<String>getCoffeeList(){
		ArrayList<String>list = dao.selectAll();
		return list;
	}
	
	public void registerCoffee(String id,String name,String price) {
		dao.insertCoffee(id,name,price);
	}
}
