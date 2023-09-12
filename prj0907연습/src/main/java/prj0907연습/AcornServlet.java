package prj0907연습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/acorn")
public class AcornServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	AcornService s = new AcornService();
	ArrayList<String> list = s.getMemberList();
	System.out.println(list);
	
	req.setAttribute("list", list);
	req.getRequestDispatcher("WEB-INF/views/acorn.jsp").forward(req, resp);
	
	
}
}
