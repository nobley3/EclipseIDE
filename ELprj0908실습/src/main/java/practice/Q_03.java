package practice;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/quiz3")
public class Q_03 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	int kor=80;
	req.setAttribute("score", kor);
	req.getRequestDispatcher("WEB-INF/views/quiz3.jsp").forward(req, resp);
}
	
}
