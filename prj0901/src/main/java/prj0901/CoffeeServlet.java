package prj0901;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Ccheck")
public class CoffeeServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	CoffeeService s = new CoffeeService();
	ArrayList<String> list = s.getCoffeeList();
	System.out.println(list);
	
	request.setAttribute("list", list);
	request.getRequestDispatcher("WEB-INF/views/coffee.jsp").forward(request, response);
}
}
