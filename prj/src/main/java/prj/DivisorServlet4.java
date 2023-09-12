package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/divisor4")
public class DivisorServlet4 extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int su = Integer.parseInt(req.getParameter("su"));
	MyUtils utils = new MyUtils();
	String divisors = utils.getDivisor(su);
	
	System.out.println(divisors);
	PrintWriter out = resp.getWriter();	
	out.println(divisors);
}
}
