package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Quiz8")
public class Day1_실습8 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out =  resp.getWriter();
		String [] img= {"prj/img/Img3.jpg","prj/img/Img4.jpg","prj/img/Img5.jpg" };
		int index = (int) ( Math.random() *3) ;
		
		
		 out.println("<html>");
		 out.println("<head>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<img src=\"/"+ img[index] +"\">"); //절대경로 /prj/img/a.jpeg
		 out.println("</body>");
		 out.println("</html>");
		 
		
		
	}
}
