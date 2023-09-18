package prj0918project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/s_check")
public class S_check extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 HttpSession session = req.getSession();
		 String fcode = (String) session.getAttribute("fcode");
		 
		 if(fcode!=null) {
			 req.getRequestDispatcher("WEB-INF/views/S_check.jsp").forward(req, resp);
			 
		 }else {
			 resp.sendRedirect("/prj0918/Check");
		 }
	}
}
