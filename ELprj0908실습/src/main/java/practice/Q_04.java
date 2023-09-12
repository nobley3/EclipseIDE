package practice;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/quiz4")
public class Q_04 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String [] gongcha = {"블랙밀크티","자몽그린티","망고요구르트"};
	req.setAttribute("gongcha", gongcha);
	
	req.getRequestDispatcher("WEB-INF/views/quiz4.jsp").forward(req, resp);
}
	
}
