package prj0901;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/deleted")
public class DeleteServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("id");
	AcornService a = new AcornService();
	a.deleteMember(id);
	
	ArrayList<String>list=a.getMemberRealList();
	
	request.setAttribute("list", list);
	request.getRequestDispatcher("WEB-INF/views/delete.jsp").forward(request, response);
	
}
}
