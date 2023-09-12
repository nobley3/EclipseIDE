package prj;
//랜덤한 화이팅 메시지 제공
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Quiz7")
public class Day1_실습7 extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/plain");
	resp.setCharacterEncoding("utf-8");
	PrintWriter out =  resp.getWriter();
	String[] msg= {"화이팅" , "화이탱 ", "짜요"} ;
	int index = (int) ( Math.random() *3) ;
	
	out.println(msg[index]);
}
}
