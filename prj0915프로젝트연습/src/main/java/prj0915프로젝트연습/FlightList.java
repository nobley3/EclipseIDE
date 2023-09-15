package prj0915프로젝트연습;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/checklist")
public class FlightList extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 HttpSession session = req.getSession();
	 String fcode = (String) session.getAttribute("fcode");
	 
	 if(fcode!=fcode) {
		 req.getRequestDispatcher("WEB-INF/views/list.jap").forward(req, resp);
		 
	 }else {
		 resp.sendRedirect("/prj0915프로젝트연습/flightinfo");
	 }
}
}
