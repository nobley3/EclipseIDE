package practice;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/quiz5")
public class Q_05 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String [] booknames = {"세이노의가르침","달러구트 꿈 백화점","날씨와 얼굴","나의 아저씨","당신은 결국 무엇이든 해내는 사람"};
	req.setAttribute("booknames", booknames);
	
	req.getRequestDispatcher("WEB-INF/views/quiz5.jsp").forward(req, resp);
}
	
}
