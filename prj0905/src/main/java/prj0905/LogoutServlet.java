package prj0905;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
//		세션객체 재거함
		session.invalidate(); //즉시 로그아웃
//		session.setMaxInactiveInterval(3); //3초후 로그아웃
		
		resp.sendRedirect("/prj0905/home"); //홈으로 보내는 
	}
}
