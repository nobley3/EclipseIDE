package prj0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/YJmovies")
public class YJServerletMovie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceYJMovie M = new ServiceYJMovie();
		ArrayList<YJMovie> list = M.getYJMovie();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/YJmovies.jsp").forward(request, response);
		
	}
}
