package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Quiz3")
public class Day1_실습3 extends HttpServlet{
//구구단 3단 구하기
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		PrintWriter out = response.getWriter();
        for(int i=1;i<=9;i++) {
        	out.println("3x"+i+"="+i*3);
        }
        	out.println();
       
	}
	
}
