package ajaxprj0906복습;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
@WebServlet("/food2")
public class FoodServelt2 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setCharacterEncoding("utf-8");
	resp.setContentType("text/html;charset=utf-8");
	
	Food food = new Food("마라탕","8000");
	JSONObject o = new JSONObject();
	o.put("name", food.getName());
	o.put("price", food.getPrice());
	
	resp.getWriter().println(o);
}
}
