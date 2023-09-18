package prj0918project;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/checkyj")
public class Check extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 req.getRequestDispatcher("WEB-INF/views/yjcheck.jsp").forward(req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setCharacterEncoding("utf-8");
	resp.setContentType("text/html;charset=utf-8");
	
	String fcode = req.getParameter("fcode");
	
	boolean result = true;
	
	result = (fcode.equals(fcode))? true:false;
	if(result) {
		HttpSession session = req.getSession();
		session.setAttribute("fcode", fcode);
		req.getRequestDispatcher("WEB-INF/views/main.jsp").forward(req, resp);	
	}
	else {
		String message = URLEncoder.encode("fcode확인","utf-8");
		resp.sendRedirect("/prj0918project/check?message="+message);
	}
	}
}
