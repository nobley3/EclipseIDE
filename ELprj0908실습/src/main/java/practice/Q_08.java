package practice;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/quiz8")
public class Q_08 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 
	ArrayList<Coffee> coffee = new ArrayList<>();
	coffee.add(new Coffee("c001","아메리카노",1900));
	coffee.add(new Coffee("c002","바닐라라떼",3400));
	coffee.add(new Coffee("c003","돌체라떼",4900));
	coffee.add(new Coffee("c004","밀크티",5000));
	
	req.setAttribute("coffee", coffee);
	req.getRequestDispatcher("WEB-INF/views/quiz8.jsp").forward(req, resp);
}
	
}
