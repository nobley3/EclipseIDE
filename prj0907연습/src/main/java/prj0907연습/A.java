package prj0907연습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test5")
public class A   extends HttpServlet{
	
	   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		   
		   AcornService2   s = new AcornService2();
		   
		   ArrayList<Member> list  = s.getMemberList();
		   
		   
		   System.out.println( list);
		   
		   
		   
		   
	}
}
