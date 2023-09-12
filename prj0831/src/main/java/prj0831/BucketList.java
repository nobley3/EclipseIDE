package prj0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/bucketlist")
public class BucketList extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServiceBucketList B = new ServiceBucketList();
		ArrayList<String> list = B.getBucketList();
		
		request.setAttribute("bucket", list);
		request.getRequestDispatcher("WEB-INF/views/bucket.jsp").forward(request, response);
		
		
	}
}
